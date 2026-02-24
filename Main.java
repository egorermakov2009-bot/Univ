
public class Main {

    public static void main(String[] args) {

        University university = new University(20);
        Group group1 = new Group("Sun", 4);
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


        group1.addBy(n1);
        group1.addBy(n2);
        group1.addBy(n3);
        group1.addBy(n4);
        group1.addBy(n5);
        group1.addBy(n6);
        group2.addBy(n7);
        group2.addBy(n8);
        group2.addBy(n9);



//        int index = group1.indexOf(n5);
//        System.out.println(index);


//        System.out.println(group1.getSize());


//        group1.removeBy(n4);
//        int index = group1.indexOf(n4);
//        System.out.println("Index: " + index);
//        System.out.println(group1.getSize());


//        group1.removeBy(10);
//        int index = group1.indexOf(n4);
//        System.out.println("Index: " + index);
//        System.out.println(group1.getSize());



    }

}








