package practice11;

import java.util.Objects;

public class Person {
    private final String name;
    private final int age;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return id == person.id;
    }

    @Override
    public int hashCode() {

        return Objects.hash(name, age, id);
    }

    private final int id;

    public Person(int id,String name, int age) {
        this.name = name;
        this.age = age;
        this.id = id;
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