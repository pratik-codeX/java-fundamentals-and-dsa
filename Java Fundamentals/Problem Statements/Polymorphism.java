class Course
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

class OnlineCourse extends Course
{
    OnlineCourse(String name,double fees)
    {
        super(name,fees);
    }

    @Override 
    public void displayDetails() 
    {
        System.out.println("Course: " + courseName);
        System.out.println("Fee: " + courseFee);
        System.out.println("OnlineCourse");
    }
}

class ClassroomCourse extends Course
{
    ClassroomCourse(String name,double fee)
    {
        super(name,fee);
    }
    @Override 
    public void displayDetails() 
    {
        System.out.println("Course: " + courseName);
        System.out.println("Fee: " + courseFee);
        System.out.println("ClassroomCourse");
    }
}

class Polymorphism
{
    public static void main(String[] args) 
    {
        Course c = new OnlineCourse("Java",50000);
    
        c.displayDetails();    
    }
}