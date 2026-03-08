package Backend15_DesignPatterns.Builder;

public class Student {
    String name;
    int age;
    String batch;
    double psp;
    int gradyear;


    public Student(String name, int age, String batch, double psp, int gradyear) {
        this.name = name;
        this.age = age;
        this.batch = batch;
        this.psp = psp;
        this.gradyear = gradyear;
    }



    public Student(Builder builder) {
        //Validations

        if(builder.getAge()<18){
            throw new RuntimeException("Age must be greater than 18");
        }

        if(builder.getGradyear()<2025){
            throw new RuntimeException("Gradyear must be greater than 2025");
        }
        // validations are done here



        this.name = builder.getName();
        this.age = builder.getAge();
        this.batch = builder.getBatch();
        this.psp = builder.getPsp();
        this.gradyear = builder.getGradyear();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getBatch() {
        return batch;
    }

    public void setBatch(String batch) {
        this.batch = batch;
    }

    public double getPsp() {
        return psp;
    }

    public void setPsp(double psp) {
        this.psp = psp;
    }

    public int getGradyear() {
        return gradyear;
    }

    public void setGradyear(int gradyear) {
        this.gradyear = gradyear;
    }
}
