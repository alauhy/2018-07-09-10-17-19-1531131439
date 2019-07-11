package practice03;

public class Student extends Person{
    protected final int klass;

    public Student(String name, int age, int klass) {
        super(name, age);
        this.klass = klass;
    }

    public int getKlass() {
        return klass;
    }

    @Override

    public String getName() {
        return super.getName();
    }

    @Override
    public int getAge() {
        return super.getAge();
    }

    @Override
    public String introduce() {
        return "I am a Student. I am at Class "+klass+".";
    }
}
