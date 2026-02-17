public class Group {

    private String GroupName;
    private StudentList studentList;


    public Group(String GroupName, int size) {
        this.GroupName = GroupName;
        this.studentList = new StudentList(size);
    }

    public int getStudentCount() {
        return studentList.getStudentCount();
    }

    public String getGroupName() {
        return GroupName;
    }

    public void addStudent(Student student) {
        studentList.addStudent(student);
    }

    public Student getStudentByFirstName(String FirstName) {
        return studentList.getStudentByFirstName(FirstName);
    }

    public void removeStudentByFirstName(String FirstName) {
        studentList.removeStudentByFirstName(FirstName);
    }

}
