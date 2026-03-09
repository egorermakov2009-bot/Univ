package com.egor.basic.univ.group;

import com.egor.basic.univ.List;
import com.egor.basic.univ.student.Student;

public class Group {

    private String groupName;
    private List<Student> students;

    public List<Student> getStudentList() {
        return students;
    }
//    -------------------------------------------------------------------------------------------
    public Group(String groupName, int size) {
        this.groupName = groupName;
        this.students = new List<>(size);
    }
//    -------------------------------------------------------------------------------------------
    public void removeStudentBy(int index) {
        students.removeBy(index);
    }
//    -------------------------------------------------------------------------------------------
    public String getGroupName() {
        return groupName;
    }
//    -------------------------------------------------------------------------------------------
    public int getSize() {
        return students.getSize();
    }
//    -------------------------------------------------------------------------------------------
    public void add(Student student) {
        students.add(student);
    }
//    -------------------------------------------------------------------------------------------
    public void removeStudentBy(Student student) {
        students.remove(student);
    }
//    -------------------------------------------------------------------------------------------
    public Student getStudentBy(int index) {
        return students.getBy(index);
    }
//    -------------------------------------------------------------------------------------------
    public int indexOf(Student student) {
        return students.indexOf(student);
    }
//    -------------------------------------------------------------------------------------------
    public Student getStudentBy(String name) {
        for (int i = 0; i < students.getSize();  i++) {
            Student s = students.getBy(i);
            if (s.getFirstName().equals(name)) {
                return s;
            }
        }
        return null;
    }
//    -------------------------------------------------------------------------------------------
    public void removeStudentBy(String name) {
        Student s = getStudentBy(name);
        if (s != null) {
            students.remove(s);
        }
    }
}