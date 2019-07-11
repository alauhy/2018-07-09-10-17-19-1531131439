package practice05;

public class Person {
    protected final String name;
    protected final int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String introduce(){
        return "My name is "+this.name+". I am "+this.age+" years old.";
    }

    public String basicIntroduce() {
        return "My name is "+this.name+". I am "+this.age+" years old.";
    }
}