package practice09;

public class Student extends Person{
    private Klass klass;

    public Klass getKlass() {
        return klass;
    }

    public Student(int id, String name, int age, Klass klass) {
        super(id, name, age);
        this.klass = klass;
    }

    @Override
    public String introduce() {
        if(klass.getLeader()!=null && klass.getLeader().getName()==super.getName()){
            return super.introduce()+" I am a Student. I am Leader of "+klass.getDisplayName()+".";
        }
        else return super.introduce()+" I am a Student. I am at "+klass.getDisplayName()+".";
    }
}