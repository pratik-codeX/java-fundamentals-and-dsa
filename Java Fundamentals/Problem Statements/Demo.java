class Course {

    private String courseName;
    private double courseFee;

    // Constructor
    Course(String courseName,double courseFee)
    {
        this.courseName = courseName;
        this.courseFee = courseFee;
    }

    // Getter methods
    String getCourseName(String courseName)
    {
        return courseName;
    }
    
    int getCourseFee(int courseFee)
    {
        return courseFee;
    }

    // Display course details
    void displayCourseDetails()
    {
        System.out.println("Course Name : "+courseName);
        System.out.println("Course Fees : "+courseFee);
        System.out.println();
    }
}

class Demo
{
    public static void main(String[] args) 
    {
        Course course1 = new Course(null, 0);
        Course course2 = new Course(null, 0);
        Course course3 = new Course(null, 0);
        
        course1.getCourseName("Python");
        course1.getCourseFee(20000);
        course1.displayCourseDetails();

        course2.getCourseName("Python");
        course2.getCourseFee(20000);
        course2.displayCourseDetails();        
        
        course3.getCourseName("Python");
        course3.getCourseFee(20000);
        course3.displayCourseDetails();
    }
}