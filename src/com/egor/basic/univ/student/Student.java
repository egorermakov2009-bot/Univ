package com.egor.basic.univ.student;

public class Student {

    private final String firstName;
    private final String lastName;
    private final String birthDate;


    public Student(String firstName, String lastName, String birthDate) {

        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = birthDate;
    }

    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public String getBirthDate() {
        return birthDate;
    }

    @Override
    public String toString() {
        return firstName + " " + lastName;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Student)) return false;

        Student other = (Student) obj;
        return firstName.equals(other.firstName)
                && lastName.equals(other.lastName)
                && birthDate.equals(other.birthDate);
    }
}
