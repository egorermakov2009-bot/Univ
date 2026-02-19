public class StudentList {

    private Student[] students;
    private int studentCount;

    public StudentList(int size) {
        students = new Student[size];
        studentCount = 0;
    }

    public int getStudentCount() {
        return studentCount;
    }

    public Student[] getStudents(String name) {
        return students;
    }

    public void decreaseCount() {
        studentCount--;
    }


    public void addStudent(Student student) {
        if  (studentCount >= students.length) {
            System.out.println("not enough space");
            return;
        }
        students[studentCount] = student;
        studentCount++;
    }



}

