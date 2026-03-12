package Backend16_PrototypeDesignPattern;

public class IntelligentStudent extends Student{
    int iq;



    IntelligentStudent(IntelligentStudent intelligentstudent) {

        super(intelligentstudent);
        this.iq = intelligentstudent.iq;

    }
    @Override
    public Student clone() {
        return new IntelligentStudent(this);
    }
}


// IntelligentSt is = new Inteeligentst();