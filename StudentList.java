import org.w3c.dom.ls.LSOutput;

public class StudentList {

    private Student[] students;
    private int size;

    public StudentList(int size) {
        students = new Student[size];
        this.size = 0;
    }

    public int getSize() {
        return size;
    }

    public Student[] getStudents(String name) {
        return students;
    }


    public void add(Student student) {
        if (size == students.length) {
            Student[] newArray = new Student[students.length * 2];

            for (int i = 0; i < size; i++) {
                newArray[i] = students[i];
            }
            students = newArray;
        }
        students[size] = student;
        size++;
    }

    public int indexOf (Student student) {
        for (int i = 0; i < size; i++) {
            if (students[i].equals(student)) {
                return i;
            }
        }
        return -1;
    }

    public void removeBy(int index) {

        if (index < 0 || index >= size) {
            System.out.println("Index out of range");
            return;
        }
        for (int i = index; i < size; i++) {
            students[i] = students[i + 1];
        }
        students[size-1] = null;
        size--;
    }

    public void removeBy(Student student) {
        int idex = indexOf(student);
        if (idex != -1) {
            removeBy(idex);
        }
    }



}

