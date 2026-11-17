public class Course 
{
    protected String courseName;
    protected double courseFee;

    public Course(String courseName, double courseFee) 
    {
        this.courseName = courseName;
        this.courseFee = courseFee;
    }

    public void displayDetails() 
    {
        System.out.println("Course: " + courseName);
        System.out.println("Fee: " + courseFee);
    }
}