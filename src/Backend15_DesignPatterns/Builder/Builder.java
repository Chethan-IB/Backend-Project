package Backend15_DesignPatterns.Builder;

public class Builder {
    String name;
    int age;
    String batch;
    double psp;
    int gradyear;


    private Builder() {

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

    public void setGradyear(String gradyear) {
        this.gradyear = gradyear;
    }

    }
}
