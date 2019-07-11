package practice11;

import java.util.ArrayList;
import java.util.List;

public class Klass {
    private int number;
    private Student leader;
    private List<Student> students = new ArrayList<Student>();
    private List<Teacher> observers = new ArrayList<Teacher>();


    public void attach(Teacher observer){
        observers.add(observer);
    }

    public void notifyAllObservers(Student student,int mode){

        for (Teacher observer : observers) {
            if(mode==1){
                observer.update(student,this.getDisplayName());
            }
            if(mode==2){
                observer.update2(student,this.getDisplayName());
            }
        }
    }

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
        notifyAllObservers(student,1);

    }
    public void assignLeader(Student student){
        if(students!=null && !students.contains(student)){
            System.out.println("It is not one of us.");
        }
        else {
            this.leader=student;
            notifyAllObservers(student,2);
        }

    }

    public List<Student> getStudents() {
        return students;
    }

    public boolean isIn(Student student){
        if(students!=null && students.contains(student)){
            return true;
        }
        else return false;
    }

}
