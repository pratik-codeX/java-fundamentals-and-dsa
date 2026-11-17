public class Course{

    // 1. Declare private instance variables
    private String courseName;
    private double courseFee;
    static int courseCount = 0;

    // 2. Create parameterized constructor
    public Course(String courseName, double courseFee) 
    {
        // TODO: Initialize instance variables
        this.courseName = courseName;
        this.courseFee = courseFee;
        Course1.courseCount++;
    }

    // 3. Create getter for courseName
    public String getCourseName() {

        // TODO
        return courseName;
    }

    // 4. Create getter for courseFee
    public double getCourseFee() {

        // TODO
        return courseFee;
    }

    // 5. Create updateCourseFee method
    public boolean updateCourseFee(double newFee) 
    {

        // TODO: Reject negative fee
        if(newFee < 0)
        {
            return false;
        }
        // TODO: Update fee if valid

        this.courseFee = newFee;

        return true;
    }

    // 6. Display course details
    public void displayCourseDetails() 
    {

        // TODO
        System.out.println("Course Name : "+courseName);
        System.out.println("Course Fee : "+courseFee);
    }

    public static void displayTotalCourses() 
    {
        // Display totalCourses
        System.out.println("Total Course Count : "+courseCount);
    }
}
