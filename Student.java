public class Student {

    private final String firstName;
    private final String lastName;
    private final String birthDate;


    public Student(String firstName, String lastname, String birthDate) {

        this.firstName = firstName;
        this.lastName = lastname;
        this.birthDate = birthDate;
    }

    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public String getBirthDate() {
        return birthDate;
    }


}
