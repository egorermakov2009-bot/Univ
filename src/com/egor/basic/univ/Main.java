package com.egor.basic.univ;

import com.egor.basic.univ.group.Group;
import com.egor.basic.univ.organization.University;
import com.egor.basic.univ.student.Student;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        University university = new University(10);

        Group group1 = new Group("Sun", 10);
        Group group2 = new Group("Mor", 20);
        Group group3 = new Group("Sho", 30);
        Group group4 = new Group("Gro", 40);

        group1.add(new Student("Fedya", "Fedor", "25.06.2009"));
        group1.add(new Student("Rick", "Fedor", "25.06.2009"));
        group2.add(new Student("Roma", "Fedor", "25.06.2009"));
        group2.add(new Student("Egor", "Ganjubas", "25.06.2009"));
        group3.add(new Student("Egor", "Ermakov", "25.06.2009"));
        group3.add(new Student("Valera", "Fedor", "25.06.2009"));
        group4.add(new Student("Goru", "Fedor", "25.06.2009"));
        group4.add(new Student("Fora", "Fedor", "25.06.2009"));

        university.addGroup(group1);
        university.addGroup(group2);
        university.addGroup(group3);
        university.addGroup(group4);

//            \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\

        while (true) {

            System.out.println("==============================================");
            System.out.println("               UNIVERSITY MENU               ");
            System.out.println("==============================================");

            System.out.printf("| %-3s | %-35s |\n", "1", "Add group");
            System.out.printf("| %-3s | %-35s |\n", "2", "Remove Group");
            System.out.printf("| %-3s | %-35s |\n", "3", "Remove Group by index");
            System.out.printf("| %-3s | %-35s |\n", "4", "Add Student");
            System.out.printf("| %-3s | %-35s |\n", "5", "Remove Student");
            System.out.printf("| %-3s | %-35s |\n", "6", "Remove by index");
            System.out.printf("| %-3s | %-35s |\n", "7", "Show groups count");
            System.out.printf("| %-3s | %-35s |\n", "8", "Show students count");
            System.out.printf("| %-3s | %-35s |\n", "9", "Show group list");
            System.out.printf("| %-3s | %-35s |\n", "10", "Show student list");
            System.out.printf("| %-3s | %-35s |\n", "11", "Exit");

            System.out.println("==============================================");
            System.out.print("Choose option > ");

            int choice = sc.nextInt();
            sc.nextLine();

//            \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\

            switch (choice) {
                case 1 -> addGroup(sc, university);

                case 2 -> removeGroup(sc, university);

                case 3 -> removeGroupByIndex(sc,university);

                case 4 -> addStudent(sc, university);
                
                case 5 -> removeStudent(sc, university);
                
                case 6 -> removeStudentByIndex(sc, university);
                
                case 7 -> System.out.println("Groups in university: " + university.getSize());

                case 8 -> studentSize(sc, university);

                case 9 -> groupList(university);

                case 10 -> studentList(sc, university);

                case 11 -> { return; }

                default -> System.out.println("Invalid input.");

            }
        }
    }

    private static void studentList(Scanner sc, University university) {
        System.out.print("Enter group name: ");
        String name = sc.nextLine();

        Group group = university.getGroupBy(name);

        if (group == null) {
            System.out.println("Group not found");
        }else {
            List<Student> students = group.getStudentList();

            String line = "======================";

            System.out.println("\n" + line);
            System.out.printf("| %-5s | %-10s |\n", "ID", "Name");
            System.out.println(line);

            if (students.getSize() == 0){
                System.out.printf("| %-34s |\n", "No students in group");
            }else{
                for (int i = 0; i < students.getSize(); i++) {
                    System.out.printf("| %-5s | %-10s |\n",
                            i,
                            students.getBy(i).getFirstName(),
                            students.getBy(i).getLastName(),
                            students.getBy(i).getBirthDate());
                }
            }
            System.out.println(line + "\n");
        }
    }

    private static void groupList(University university) {
        List<Group> groups = university.getGroupList();

        String line = "======================";

        System.out.println("\n" + line);
        System.out.printf("| %-5s | %-10s |\n", "ID", "Name");
        System.out.println(line);

        if (groups.getSize() == 0){
            System.out.println("No groups in university");
        }else{
            for (int i = 0; i < groups.getSize(); i++) {
                System.out.printf("| %-5d | %-10s | \n", i, groups.getBy(i).getGroupName());
            }
        }
        System.out.println(line + "\n");
    }

    private static void studentSize(Scanner sc, University university) {
        System.out.print("Enter group name: ");
        String groupName = sc.nextLine();

        Group group = university.getGroupBy(groupName);

        if (group != null) {
            System.out.println("Students in group: " + group.getSize());
        } else {
            System.out.println("Group not found");
        }
    }

    private static void removeStudentByIndex(Scanner sc, University university) {
        System.out.print("Enter group name: ");
        String groupName = sc.nextLine();

        Group group = university.getGroupBy(groupName);

        if (group != null) {
            System.out.print("Enter student index to remove: ");
            int index = sc.nextInt();

            group.removeStudentBy(index);

            System.out.println("Student has been removed.");
        } else {
            System.out.println("Group not found.");
        }
    }

    private static void removeStudent(Scanner sc, University university) {
        System.out.print("Enter group name: ");
        String groupName = sc.nextLine();

        Group group = university.getGroupBy(groupName);

        if (group != null) {
            System.out.print("Enter student name to remove: ");
            String studentName = sc.nextLine();

            group.removeStudentBy(studentName);

            System.out.println("Student has been removed.");
        } else {
            System.out.println("Group not found.");
        }
    }

    private static void addStudent(Scanner sc, University university) {
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
            group.add(student);
            System.out.println("Student has been added.");
        } else {
            System.out.println("Group not found.");
        }
    }

    private static void removeGroupByIndex(Scanner sc, University university) {
        System.out.print("Enter group index to remove: ");

        int index = sc.nextInt();

        university.getGroupBy(index);

        System.out.println("Group has been removed.");
    }

    private static void removeGroup(Scanner sc, University university) {
        System.out.print("Enter group name to remove: ");
        String name = sc.nextLine();

        university.removeGroupBy(name);

        System.out.println("Group has been removed.");
    }

    private static void addGroup(Scanner sc, University university) {
        System.out.print("Enter group name: ");
        String groupName = sc.nextLine();

        System.out.print("Enter group size: ");
        int size = sc.nextInt();
        sc.nextLine();

        Group group = new Group(groupName, size);
        university.addGroup(group);

        System.out.println("Group has been added.");
    }
}
