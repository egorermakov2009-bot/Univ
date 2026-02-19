public class Group {

    private String groupName;
    private StudentList studentList;


    public Group(String GroupName, int size) {
        this.groupName = GroupName;
        this.studentList = new StudentList(size);
    }

    public int getStudentCount() {
        return studentList.getStudentCount();
    }

    public String getGroupName() {
        return groupName;
    }

    public void addStudent(Student student) {
        studentList.addStudent(student);
    }


    public Student[] getStudentByFirstName(String firstName) {
        Student[] students = studentList.getStudents(firstName);
        int size = studentList.getStudentCount();

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

    public void removeStudentByFirstName(String name) {
        Student[] students = studentList.getStudents(name);
        int size = studentList.getStudentCount();
        for (int i = 0; i < size; i++) {
            if (students[i].getFirstName().equals(name)) {

                for (int j = i; j < size - 1; j++) {
                    students[j] = students[j + 1];
                }
                students[size - 1] = null;
                studentList.decreaseCount();
                size--;
                i--;
            }
        }


    }


}
