public class MemoryDemo {

    public static void main(String[] args) {

        int a = 100;
        int b = 200;

        Student s1 = new Student("Rahul");
        Student s2 = s1;

        s2.name = "Pratik";

        System.out.println(a + b);
        System.out.println(s1.name);
        System.out.println(s2.name);
    }
}

class Student {

    String name;

    Student(String name) {
        this.name = name;
    }
}