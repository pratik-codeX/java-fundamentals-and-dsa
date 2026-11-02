
package com.example.edutrack.service;

import com.example.edutrack.dto.CourseRequest;
import com.example.edutrack.dto.CourseResponse;
import com.example.edutrack.entity.Course;
import com.example.edutrack.exception.DuplicateResourceException;
import com.example.edutrack.exception.ResourceNotFoundException;
import com.example.edutrack.repository.CourseRepository;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class CourseService {

    private final CourseRepository courseRepository;

    public CourseService(CourseRepository courseRepository) {
        this.courseRepository = courseRepository;
    }

    public CourseResponse createCourse(CourseRequest request) {

        if (courseRepository.existsByTitleIgnoreCase(request.title())) {
            throw new DuplicateResourceException(
                "Course already exists: " + request.title()
            );
        }

        Course course = new Course(
            request.title().trim(),
            request.description(),
            request.durationInWeeks(),
            request.fee(),
            request.active()
        );

        Course savedCourse = courseRepository.save(course);

        return mapToResponse(savedCourse);
    }

    @Transactional(readOnly = true)
    public List<CourseResponse> getAllCourses() {

        return courseRepository.findAll()
                .stream()
                .map(this::mapToResponse)
                .toList();
    }

    @Transactional(readOnly = true)
    public CourseResponse getCourseById(Long id) {

        Course course = findCourseOrThrow(id);

        return mapToResponse(course);
    }

    public CourseResponse updateCourse(Long id, CourseRequest request) {

        Course course = findCourseOrThrow(id);

        boolean titleUsedByAnotherCourse =
                courseRepository.existsByTitleIgnoreCaseAndIdNot(
                    request.title(),
                    id
                );

        if (titleUsedByAnotherCourse) {
            throw new DuplicateResourceException(
                "Another course already uses title: " + request.title()
            );
        }

        course.updateDetails(
            request.title().trim(),
            request.description(),
            request.durationInWeeks(),
            request.fee(),
            request.active()
        );

        // No explicit save() required here.
        // Hibernate dirty checking detects the entity changes.
        return mapToResponse(course);
    }

    public void deleteCourse(Long id) {

        Course course = findCourseOrThrow(id);

        courseRepository.delete(course);
    }

    private Course findCourseOrThrow(Long id) {

        return courseRepository.findById(id)
                .orElseThrow(() ->
                    new ResourceNotFoundException(
                        "Course not found with id: " + id
                    )
                );
    }

    private CourseResponse mapToResponse(Course course) {

        return new CourseResponse(
            course.getId(),
            course.getTitle(),
            course.getDescription(),
            course.getDurationInWeeks(),
            course.getFee(),
            course.getActive()
        );
    }
}
