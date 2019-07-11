package practice09;

import java.util.ArrayList;
import java.util.List;

public class Klass {
    private int number;
    private Student leader;
    private List<Student> students=new ArrayList<Student>();
    public Klass(int number) {
        this.number = number;
    }

    public Student getLeader() {
        return leader;
    }

    public int getNumber() {
        return number;

    }
    public String getDisplayName(){
        return "Class "+number;
    }
    public void appendMember(Student student) {
        students.add(student);
    }
    public void assignLeader(Student student){
        if(students!=null&&!students.contains(student)){
            System.out.println("It is not one of us.");
        }
        else this.leader=student;
    }

}

