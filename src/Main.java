import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        University university = new University(10);

        Group group1 = new Group("Sun", 10);
        Group group2 = new Group("Mor", 20);
        Group group3 = new Group("Sho", 30);
        Group group4 = new Group("Gro", 40);

        group1.addBy(new Student("Fedya", "Fedor", "25.06.2009"));
        group1.addBy(new Student("Rick", "Fedor", "25.06.2009"));
        group2.addBy(new Student("Roma", "Fedor", "25.06.2009"));
        group2.addBy(new Student("Egor", "Ganjubas", "25.06.2009"));
        group3.addBy(new Student("Egor", "Ermakov", "25.06.2009"));
        group3.addBy(new Student("Valera", "Fedor", "25.06.2009"));
        group4.addBy(new Student("Goru", "Fedor", "25.06.2009"));
        group4.addBy(new Student("Fora", "Fedor", "25.06.2009"));

        university.addGroup(group1);
        university.addGroup(group2);
        university.addGroup(group3);
        university.addGroup(group4);

//            \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\

        while (true) {
            System.out.println("1 - Add Group");
            System.out.println("2 - Remove Group");
            System.out.println("3 - Remove Group by index");
            System.out.println("4 - Add Student");
            System.out.println("5 - Remove Student");
            System.out.println("6 - Remove Student by index");
            System.out.println("7 - Show groups count");
            System.out.println("8 - Get students size");
            System.out.println("9 - Exit");

            int choice = sc.nextInt();
            sc.nextLine();

//            \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\

            if (choice == 1) {
                System.out.print("Enter group name: ");
                String groupName = sc.nextLine();

                System.out.print("Enter group size: ");
                int size = sc.nextInt();
                sc.nextLine();

                Group group = new Group(groupName, size);
                university.addGroup(group);

                System.out.println("Group has been added.");
            }

//            \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\

            else if (choice == 2) {
                System.out.print("Enter group name to remove: ");
                String name = sc.nextLine();

                university.removeBy(name);

                System.out.println("Group has been removed.");
            }

//            \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\

            else if (choice == 3) {
                System.out.print("Enter group index to remove: ");

                int index = sc.nextInt();

                System.out.println("Group has been removed.");
            }

//            \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\

            else if (choice == 4) {
                System.out.print("Enter group name: ");
                String groupName = sc.nextLine();

                Group group = university.getGroupBy(groupName);

                if (group != null) {
                    System.out.print("Enter student first name: ");
                    String firstName = sc.nextLine();
                    System.out.print("Enter student last name: ");
                    String lastName = sc.nextLine();
                    System.out.print("Enter student birth date: ");
                    String birthDate = sc.nextLine();

                    Student student = new Student(firstName, lastName, birthDate);
                    group.addBy(student);
                    System.out.println("Student has been added.");
                } else {
                    System.out.println("Group not found.");
                }
            }

//            \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\

            else if (choice == 5) {
                System.out.print("Enter group name: ");
                String groupName = sc.nextLine();

                Group group = university.getGroupBy(groupName);

                if (group != null) {
                    System.out.print("Enter student name to remove: ");
                    String studentName = sc.nextLine();

                    group.removeBy(studentName);

                    System.out.println("Student has been removed.");
                } else {
                    System.out.println("Group not found.");
                }
            }

//            \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\

            else if (choice == 6) {
                System.out.print("Enter group name: ");
                String groupName = sc.nextLine();

                Group group = university.getGroupBy(groupName);

                if (group != null) {
                    System.out.print("Enter student index to remove: ");
                    int index = sc.nextInt();

                    group.removeBy(index);

                    System.out.println("Student has been removed.");
                } else {
                    System.out.println("Group not found.");
                }
            }

//            \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\

            else if (choice == 7) {
                System.out.println("Groups in university: " + university.getSize());
            }

//            \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\

            else if (choice == 8) {
                System.out.print("Enter group name: ");
                String groupName = sc.nextLine();

                Group group = university.getGroupBy(groupName);

                if (group != null) {
                    System.out.println("Students in group: " + group.getSize());
                } else {
                    System.out.println("Group not found");
                }
            }

//            \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\

            else if (choice == 9) {
                break;
            }

        }

    }

}