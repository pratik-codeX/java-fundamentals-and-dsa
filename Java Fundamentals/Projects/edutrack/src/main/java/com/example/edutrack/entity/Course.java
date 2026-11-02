
package com.example.edutrack.entity;

import jakarta.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(
    name = "courses",
    uniqueConstraints = {
        @UniqueConstraint(
            name = "uk_course_title",
            columnNames = "title"
        )
    }
)
public class Course {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 150)
    private String title;

    @Column(length = 1000)
    private String description;

    @Column(name = "duration_in_weeks", nullable = false)
    private Integer durationInWeeks;

    @Column(nullable = false, precision = 10, scale = 2)
    private BigDecimal fee;

    @Column(nullable = false)
    private Boolean active;

    // JPA requires a no-argument constructor.
    protected Course() {
    }

    public Course(
            String title,
            String description,
            Integer durationInWeeks,
            BigDecimal fee,
            Boolean active) {
        this.title = title;
        this.description = description;
        this.durationInWeeks = durationInWeeks;
        this.fee = fee;
        this.active = active;
    }

    public void updateDetails(
            String title,
            String description,
            Integer durationInWeeks,
            BigDecimal fee,
            Boolean active) {
        this.title = title;
        this.description = description;
        this.durationInWeeks = durationInWeeks;
        this.fee = fee;
        this.active = active;
    }

    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public Integer getDurationInWeeks() {
        return durationInWeeks;
    }

    public BigDecimal getFee() {
        return fee;
    }

    public Boolean getActive() {
        return active;
    }
}
