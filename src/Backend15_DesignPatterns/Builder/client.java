package Backend15_DesignPatterns.Builder;

public class client {
    public static void main() {
        Builder builder = new Builder();
        builder.setName("Chethan I B ");
        builder.setAge(18);
        builder.setBatch("LLD");
        builder.setGradyear("2025");
        builder.setPsp(Double.parseDouble("100"));

        Student student = new Student(builder);

    }
}
