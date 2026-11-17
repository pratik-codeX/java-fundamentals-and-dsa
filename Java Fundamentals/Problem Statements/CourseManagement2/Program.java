public class Program {

    public static void main(String[] args) {

        // 1. Create three Course objects

        // TODO: Java
        Course c1 = new Course("Java",15000);
        // TODO: Python
        Course c2 = new Course("Python",12000);

        // TODO: React
        Course c3 = new Course("React",10000);


        // 2. Display course details
        c1.displayCourseDetails();
        c2.displayCourseDetails();
        c3.displayCourseDetails();

        // 3. Update Java course fee to 18000
        c1.updateCourseFee(18000);

        // 4. Try updating Python fee to -500
        c2.updateCourseFee(-500);
        
        System.out.println("\nAfter Updating Fees : ");
        // 5. Display updated details
        c1.displayCourseDetails();
        c2.displayCourseDetails();
        c3.displayCourseDetails();

        c1.displayTotalCourses();
    }
}
