package tech.stepniewski.example1;

public class Customer {
    private final String pesel;
    private final String firstName;
    private final String lastName;
    private final String idNumber;

    public Customer(String pesel, String firstName, String lastName, String idNumber) {
        this.pesel = pesel;
        this.firstName = firstName;
        this.lastName = lastName;
        this.idNumber = idNumber;
    }

    public String getPesel() {
        return pesel;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getIdNumber() {
        return idNumber;
    }
}
