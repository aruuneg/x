public class Person {
    protected String firstName;
    protected String lastName;
    protected int idNumber;
    private String email; // Шинэ attribute

    public Person(String firstName, String lastName, int idNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.idNumber = idNumber;
    }

    public void printPerson() {
        System.out.println("Name: " + lastName + ", " + firstName);
        System.out.println("ID: " + idNumber);
        System.out.println("Email: " + email);
    }

    // Email-ийн getter
    public String getEmail() {
        return email;
    }

    // Email-ийн setter (шалгалттай)
    public void setEmail(String email) {
        if (email != null && email.contains("@")) {
            this.email = email;
        } else {
            System.out.println("Invalid email address. It must contain '@'.");
        }
    }
}
