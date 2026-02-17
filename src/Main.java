
public class Main {

    public static void main(String[] args) {

        University university = new University();
        Group group1 = new Group("Sun", 20);
        Group group2 = new Group("gadu", 30);

        university.addGroup(group1);
        university.addGroup(group2);


        Student n1 = new Student("Fedya", "Ganjubas", "04.07.2002");
        Student n2 = new Student("Rick", "Ganjubas", "30.04.2003");
        Student n3 = new Student("Morty", "Vandonov", "15.03.2006");
        Student n4 = new Student("Egor", "Ermakov", "25.06.2009");


        group1.addStudent(n1);
        group1.addStudent(n2);
        group2.addStudent(n3);
        group2.addStudent(n4);

//        System.out.println(university.GroupCount);

//        System.out.println(n1.FirstName + "/" + n1.Lastname + "/" + n1.BirthDate);

//        Student found = group1.getStudentByFirstName("Rick");
//        if (found != null) {
//
//            System.out.print(found.getFirstName() + " / " + found.getLastName() + " / " + found.getBirthDate() + ".");
//        }
//
//        else
//           System.out.println("No student found.");

//        group1.removeStudentByFirstName("Fedya");
//
//        System.out.println(group1.getStudentCount());
//        System.out.println(group2.getStudentCount());






    }

}








