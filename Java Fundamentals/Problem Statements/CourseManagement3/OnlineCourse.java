public class OnlineCourse extends Course 
{
    private String platform;

    public OnlineCourse(
        String courseName,
        double courseFee,
        String platform
    ) 
    {

        // TODO: Call parent constructor
        super(courseName, courseFee);
        // TODO: Initialize platform
        this.platform = platform;
    }

    public void displayPlatform() 
    {
        // TODO: Display platform
        System.out.println("This is "+platform);
    }
}