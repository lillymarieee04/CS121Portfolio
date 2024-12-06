package packageDemo;

public class PersonTest {
    public static void main(String[] args) {
        Person person = new Person("John", "Doe", 30, "Male", 1.75);


        person.displayFullName();

        person.displayPersonInfo();

        person.displayHeight();

        person.displayGender();


        System.out.println("Age: " + person.getAge());

        person.setAge(35);
        System.out.println("Updated Age: " + person.getAge());

        System.out.println("First Name: " + person.firstName);
        System.out.println("Last Name: " + person.lastName);


    }
}
