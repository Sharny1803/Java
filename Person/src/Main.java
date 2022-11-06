public class Main {
    public static void main(String[] args) {
        Person person = new Person();
        person.setFirstName("Jan");
        person.setLastName("Kowalski");
        person.setAge(28);
        System.out.println("First name: " + person.getFirstName());
        System.out.println("Last name: " + person.getLastName());
        System.out.println("Age: " + person.getAge());
        System.out.println("Is the person teenager: " + person.isTeen());
        System.out.println("Full name: " + person.getFullName());
        person.setLastName("");
//        Without last name
        System.out.println("Full name: " + person.getFullName());
        person.setLastName("Kowalski");
        person.setFirstName("");
//        Without first name
        System.out.println("Full name: " + person.getFullName());
    }
}