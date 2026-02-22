package BackendDay1;

public class Student {
    String name;
    int age;
    String batch;
    double PSP;

    // Default constructor
    public Student() {
    }

    // Constructor with 2 parameters
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Custom constructor with all fields
    public Student(String name, int age, String batch, double PSP) {
        this.name = name;
        this.age = age;
        this.batch = batch;
        this.PSP = PSP;
    }

    // Method
    void bookInterview() {
        System.out.println("Booked Interview");
    }
}