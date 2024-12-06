package weekOne;

public class Firstcodewithme {
    //Declaring Variables
    public static void main(String[] args) {
    int age;
    double gpa;
    char lettergrade;
    boolean csMajor;
    String name;

    //Initialize variables
    age = 1;
    gpa = 3.9;
    lettergrade = 'A';
    csMajor = true;
    name = "Lilly";

    String favoriteColor = "Purple";

    //print, println, printf (formatting)

    System.out.printf("The age of this person is: %d%n", age);
    System.out.printf("The gpa is %.2f%n", gpa);
    System.out.printf("The letter grade is : %c%n", lettergrade);
    System.out.printf("Is it true that your major is computer science? %b%n", csMajor);
    System.out.printf("This persons name is: %s%n", name);

    System.out.println("Your age is: " + age);
    }
}
