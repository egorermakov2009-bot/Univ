public class Student {

    private String FirstName;
    private String LastName;
    private String BirthDate;


    public Student(String FirstName, String Lastname, String BirthDate) {

        this.FirstName = FirstName;
        this.LastName = Lastname;
        this.BirthDate = BirthDate;
    }

    public String getFirstName() {
        return FirstName;
    }
    public String getLastName() {
        return LastName;
    }
    public String getBirthDate() {
        return BirthDate;
    }


}
