package students;

public class StudentList {

    private Student[] students;
    private int size;

    public StudentList(int size) {
        students = new Student[size];
        this.size = 0;
    }

    public int getSize() {
        return this.size;
    }

    public Student[] getStudents() {
        Student[] copy = new Student[size];
        for (int i = 0; i < size; i++) {
            copy[i] = students[i];
        }
        return copy;
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
        for (int i = index; i < size - 1; i++) {
            students[i] = students[i + 1];
        }
        students[size-1] = null;
        size--;
    }

    public void removeBy(Student student) {
        int index = indexOf(student);
        if (index != -1) {
            removeBy(index);
        }
    }

    public void removeBy(String firstName) {
        for (int i = 0; i < size; i++) {
            if (students[i].getFirstName().equals(firstName)) {
                removeBy(i);
                i--;
            }
        }
    }

}

