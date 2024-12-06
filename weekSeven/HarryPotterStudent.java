
package weekSeven;
import java.util.Scanner;

//over explaining to study
public class HarryPotterStudent {
    private String house; // String because need to have houses set
    private String patronus;
    private int year; //because years are numbers goober


    public HarryPotterStudent (String house, String patronus, int year) { //attributes of hoggies students
        this.house = house; //assigns the value of parameter???
        this.patronus = patronus;
        this.year = year;
    }

    public void printDetails(){
        System.out.println("House: " + house);
        System.out.println("Patronus: " + patronus);
        System.out.println("Year at Hogwarts: " + year);
    }

    public static void main(String[] args) {
        // scanner to let user put in details
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your hogwarts house: ");
        String house = scanner.nextLine();

        System.out.println("Enter your patronus: ");
        String patronus = scanner.nextLine();

        System.out.println("Enter your year: ");
        int year = scanner.nextInt();

        HarryPotterStudent student = new HarryPotterStudent(house, patronus, year);

        student.printDetails();  // printing the details of HP student

        scanner.close();
    }
}

///////////////////////////////////////////////////////////////////////////////