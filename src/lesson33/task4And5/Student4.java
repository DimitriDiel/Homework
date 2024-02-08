package lesson33.task4And5;

import java.util.Objects;

public class Student4 {

    private String name;
    private double avgGrade;
    private int yearOfEntering;

    public Student4(String name, double avgGrade, int yearOfEntering) {
        this.name = name;
        this.avgGrade = avgGrade;
        this.yearOfEntering = yearOfEntering;
    }

    public String getName() {
        return name;
    }

    public double getAvgGrade() {
        return avgGrade;
    }

    public int getYearOfEntering() {
        return yearOfEntering;
    }

    @Override
    public String toString() {
        return "Student4{" +
                "name='" + name + '\'' +
                ", avgGrade=" + avgGrade +
                ", yearOfEntering=" + yearOfEntering +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student4 student4 = (Student4) o;
        return Double.compare(avgGrade, student4.avgGrade) == 0 && yearOfEntering == student4.yearOfEntering && Objects.equals(name, student4.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, avgGrade, yearOfEntering);
    }
}
