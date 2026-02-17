public class StudentList {

    private Student[] Students;
    private int StudentCount;

    public StudentList(int size) {
        Students = new Student[size];
        StudentCount = 0;
    }

    public int getStudentCount() {
        return StudentCount;
    }


    public void addStudent(Student student) {
        if  (this.StudentCount < Students.length) {
            Students[StudentCount] = student;
            StudentCount++;
        }
    }

    public Student getStudentByFirstName(String FirstName) {
        for (int i = 0; i < StudentCount; i++) {
            if (Students[i].getFirstName().equals(FirstName)) {
                return Students[i];
            }
        }
        return null;
    }

    public Student removeStudentByFirstName(String FirstName) {
        for (int i = 0; i < StudentCount; i++) {
            if (Students[i].getFirstName().equals(FirstName)) {
                Students[i] = Students[StudentCount - 1];
                Students[StudentCount - 1] = null;
                StudentCount--;

                return  Students[i];

            }
        }
        return null;
    }

}

