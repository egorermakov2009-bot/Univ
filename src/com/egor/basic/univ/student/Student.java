package com.egor.basic.univ.student;

import com.egor.basic.univ.Profession;

public class Student {

    private Profession profession;

    private final String firstName;
    private final String lastName;
    private final String birthDate;


    public Student(String firstName, String lastName, String birthDate,  Profession profession) {

        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = birthDate;
        this.profession = profession;
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
    public  Profession getProfession() {
        return profession;
    }

    @Override
    public String toString() {
        return firstName + " " + lastName + " | "  + birthDate + " | " + profession;
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
