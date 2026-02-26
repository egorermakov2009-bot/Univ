package groups;

import students.Student;
import students.StudentList;

public class Group {

    private String groupName;
    private StudentList studentList;


    public Group(String GroupName, int size) {
        this.groupName = GroupName;
        this.studentList = new StudentList(size);
    }

    public int getSize() {
        return studentList.getSize();
    }

    public String getGroupName() {
        return groupName;
    }

    public void add(Student student) {
        studentList.add(student);
    }

    public void removeBy(Student student) {
        studentList.removeBy(student);
    }
    public void removeBy(int index) {
        studentList.removeBy(index);
    }
    public int indexOf(Student student) {
        return studentList.indexOf(student);
    }

    public void removeBy(String firstName) {
        studentList.removeBy(firstName);
    }

    public StudentList getStudentList() {
        return studentList;
    }


    public Student[] getStudentBy(String firstName) {
        Student[] students = studentList.getStudents();
        int size = studentList.getSize();

        Student[] temp  = new Student[size];
        int count = 0;

        for (int i = 0; i < size; i++) {
            if (students[i].getFirstName().equals(firstName)) {
                temp[count++] = students[i];
            }
        }
        Student[] result = new Student[count];
        for (int i = 0; i < count; i++) {
            result[i] = temp[i];
        }
        return result;
    }



}
