class Main {
    public static void main(String[] args) {
        Person person = new Person("Alice", "Smith", 1001);

        // Email тохируулах
        person.setEmail("anar@gmail.com"); // Зөв
        // person.setEmail("invalidEmail.com"); // Энэ мөрийг туршиж болно

        person.printPerson();
    }
}
