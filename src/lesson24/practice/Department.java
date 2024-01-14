package lesson24.practice;

import java.util.Objects;

public class Department {

    private String namOfDepartment;

    public Department(String namOfDepartment) {
        this.namOfDepartment = namOfDepartment;
    }

    public String getNamOfDepartment() {
        return namOfDepartment;
    }

    public void setNamOfDepartment(String namOfDepartment) {
        this.namOfDepartment = namOfDepartment;
    }

    @Override
    public String toString() {
        return "Department{" +
                "namOfDepartment='" + namOfDepartment + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Department that = (Department) o;
        return Objects.equals(namOfDepartment, that.namOfDepartment);
    }

    @Override
    public int hashCode() {
        return Objects.hash(namOfDepartment);
    }
}
