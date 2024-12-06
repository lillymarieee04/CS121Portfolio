package packageDemo;

public class Person {
    public String firstName;
    public String lastName;
    private int age;
    private String gender;
    private double height;

    public Person(String firstName, String lastName, int age, String gender, double height) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.gender = gender;
        this.height = height;
    }

    public void displayFullName() {
        System.out.println("Full Name: " + firstName + " " + lastName);
    }

    private void displayAge() {
        System.out.println("Age: " + age);
    }

    protected void displayGender() {
        System.out.println("Gender: " + gender);
    }

    void displayHeight() {
        System.out.println("Height: " + height + " meters");
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void displayPersonInfo() {
        displayFullName();
        System.out.println("Age: " + age);
        displayGender();
        displayHeight();
    }

    public static void main(String[] args) {
        Person person = new Person("John", "Doe", 30, "Male", 1.75);

        person.displayFullName();
        person.displayPersonInfo();
        person.displayHeight();
    }
}
