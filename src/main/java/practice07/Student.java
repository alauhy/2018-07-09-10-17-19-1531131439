package practice07;

public class Student extends Person{
    protected final Klass klass;

    public Student(String name, int age, Klass klass) {
        super(name, age);
        this.klass = klass;
    }

    public Klass getKlass() {
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
        return super.introduce()+" I am a Student. I am at "+klass.getDisplayName()+".";
    }
}
