package practice11;

import java.util.List;

public class Teacher extends Person {
    private List<Klass> classes;

    public Teacher(int id, String name, int age) {
        super(id, name, age);
    }


    public Teacher(int id, String name, int age, List<Klass> classes) {
        super(id, name, age);
        this.classes = classes;
        for (Klass klass : classes) {
            klass.attach(this);
        }
    }


    public void notifiedTeacherWhenStuentJoin(Student student, String classNumer) {
        String str = "I am " + super.getName() + ". I know " + student.getName() + " has joined " + classNumer + ".";
        System.out.println(str);
    }

    public void notifiedTeacherWhenStuentBecomeLeader(Student student, String classNumer) {
        String str = "I am " + super.getName() + ". I know " + student.getName() + " become Leader of " + classNumer + ".";
        System.out.println(str);
    }

    public List<Klass> getClasses() {
        return classes;
    }

    @Override
    public String introduce() {
        String str = super.introduce() + " I am a Teacher. I teach Class ";
        if (classes != null) {
            for (Klass klass : classes) {
                str += klass.getNumber() + ", ";

            }
            str = str.substring(0, str.length() - 2);
            str += ".";
        } else str = "My name is Tom. I am 21 years old. I am a Teacher. I teach No Class.";
        return str;

    }

    public String introduceWith(Student student) {
        if (classes.contains(student.getKlass())) {
            return super.introduce() + " I am a Teacher. I teach " + student.getName() + ".";
        } else return super.introduce() + " I am a Teacher. I don't teach " + student.getName() + ".";
    }

    public boolean isTeaching(Student student) {
        boolean flag = false;
        for (Klass klass : classes) {
            if (klass.isIn(student)) {
                flag = true;
            }
        }
        return flag;

    }
}
