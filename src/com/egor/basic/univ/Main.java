package com.egor.basic.univ;

import groups.Group;
import organization.University;
import students.Student;

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
            System.out.printf("| %-3s | %-35s |\n", "2", "Remove groups.Group");
            System.out.printf("| %-3s | %-35s |\n", "3", "Remove groups.Group by index");
            System.out.printf("| %-3s | %-35s |\n", "4", "Add students.Student");
            System.out.printf("| %-3s | %-35s |\n", "5", "Remove students.Student");
            System.out.printf("| %-3s | %-35s |\n", "6", "Remove students.Student by index");
            System.out.printf("| %-3s | %-35s |\n", "7", "Show groups count");
            System.out.printf("| %-3s | %-35s |\n", "8", "Get students size");
            System.out.printf("| %-3s | %-35s |\n", "9", "Show group list");
            System.out.printf("| %-3s | %-35s |\n", "10", "Show student list");
            System.out.printf("| %-3s | %-35s |\n", "11", "Exit");

            System.out.println("==============================================");
            System.out.print("Choose option > ");

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

                System.out.println("groups.Group has been added.");
            }

//            \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\

            else if (choice == 2) {
                System.out.print("Enter group name to remove: ");
                String name = sc.nextLine();

                university.removeBy(name);

                System.out.println("groups.Group has been removed.");
            }

//            \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\

            else if (choice == 3) {
                System.out.print("Enter group index to remove: ");

                int index = sc.nextInt();

                System.out.println("groups.Group has been removed.");
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
                    group.add(student);
                    System.out.println("students.Student has been added.");
                } else {
                    System.out.println("groups.Group not found.");
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

                    System.out.println("students.Student has been removed.");
                } else {
                    System.out.println("groups.Group not found.");
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

                    System.out.println("students.Student has been removed.");
                } else {
                    System.out.println("groups.Group not found.");
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
                    System.out.println("groups.Group not found");
                }
            }

//            \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\

            else if (choice == 9) {

                Group[] groups = university.getGroupList().getGroups();

                String line = "======================";

                System.out.println("\n" + line);
                System.out.printf("| %-5s | %-10s |\n", "ID", "Name");
                System.out.println(line);

                if (groups.length == 0){
                    System.out.println("No groups in university");
                }else{
                    for (int i = 0; i < groups.length; i++) {
                        System.out.printf("| %-5d | %-10s | \n", i, groups[i].getGroupName());
                    }
                }
                System.out.println(line + "\n");
            }

//            \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\

            else if (choice == 10) {
                System.out.print("Enter group name: ");
                String name = sc.nextLine();

                Group group = university.getGroupBy(name);

                if (group == null) {
                    System.out.println("Group not found");
                }else {
                    Student[] students = group.getStudentList().getStudents();

                    String line = "======================";

                    System.out.println("\n" + line);
                    System.out.printf("| %-5s | %-10s |\n", "ID", "Name");
                    System.out.println(line);

                    if (students.length == 0){
                        System.out.printf("| %-34s |\n", "No students in group");
                    }else{
                        for (int i = 0; i < students.length; i++) {
                            System.out.printf("| %-5s | %-10s |\n",
                                    i,
                                    students[i].getFirstName(), students[i].getLastName(), students[i].getBirthDate());
                        }
                    }
                    System.out.println(line + "\n");
                }
            }

//            \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\

            else if (choice == 11) {
                break;
            }
        }
        }
    }
