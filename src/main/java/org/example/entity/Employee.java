package org.example.entity;

import java.util.Objects;

public class Employee {
    private int id;
    private String firstname;
    private  String lastname;


    public Employee(int id, String firstname, String lastname) {
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
    }

    public int getId() {
        return id;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return id == employee.id;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

    @Override
    public String toString() {
        return "\n" +
                "Employee ID=" + id + "\n" +
                "Name='" + firstname + "\n" +
                "Surname='" + lastname + "\n";
    }
}
