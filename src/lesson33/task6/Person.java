package lesson33.task6;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Person {

    private String name;
    private int age;
    private List<String> skills;

    public Person(String name, int age,List<String> skills) {
        this.name = name;
        this.age = age;
        this.skills = skills;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public List<String> getSkills() {
        return skills;
    }

    public void setSkills(List<String> skills) {
        this.skills = skills;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", skills=" + skills +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age && Objects.equals(name, person.name) && Objects.equals(skills, person.skills);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, skills);
    }
}
