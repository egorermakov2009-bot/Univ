
public class Main {

    public static void main(String[] args) {

        University university = new University(20);
        Group group1 = new Group("Sun", 20);
        Group group2 = new Group("gadu", 30);

        university.addGroup(group1);
        university.addGroup(group2);


        Student n1 = new Student("Fedya", "Ganjubas", "04.07.2002");
        Student n2 = new Student("Rick", "Ganjubas", "30.04.2003");
        Student n3 = new Student("Morty", "Vandonov", "15.03.2006");
        Student n4 = new Student("Egor", "Ermakov", "25.06.2009");
        Student n5 = new Student("Fedya", "Ganjubas", "04.07.2002");
        Student n6 = new Student("Fedya", "Ganjubas", "04.07.2002");
        Student n7 = new Student("Fedya", "Ganjubas", "04.07.2002");
        Student n8 = new Student("Fedya", "Ganjubas", "04.07.2002");
        Student n9 = new Student("Fedya", "Ganjubas", "04.07.2002");


        group1.addStudent(n1);
        group1.addStudent(n2);
        group1.addStudent(n3);
        group1.addStudent(n4);
        group1.addStudent(n5);
        group1.addStudent(n6);
        group1.addStudent(n7);
        group1.addStudent(n8);
        group2.addStudent(n9);


//        group1.removeStudentByFirstName("Rick");
//
//        Student[] found  = group1.getStudentByFirstName("Rick");
//        if (found.length == 0) {
//            System.out.println("No students found");
//        }else
//            System.out.println("Found " + found.length + " students" );


//        System.out.print("Before: ");
//        System.out.println(group1.getStudentCount());
//
//        group1.removeStudentByFirstName("Rick");
//        System.out.print("After: ");
//        System.out.println(group1.getStudentCount());


//        Student[] found = group1.getStudentByFirstName("Morty");
//
//        if (found.length > 0) {
//            System.out.println("Найден: " + found[0].getFirstName());
//        } else {
//            System.out.println("Не найден");
//        }

    }

}








