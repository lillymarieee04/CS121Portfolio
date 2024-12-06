package weekThree;

import java.util.Scanner;

public class SwitchStatements {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        String house;

        // Prompt user for input
        System.out.println("Enter the name of a Hogwarts house (Gryffindor, Hufflepuff, Ravenclaw, Slytherin):");
        house = scnr.nextLine();

        // Switch statement for Hogwarts house properties
        switch (house) {
            case "Gryffindor":
                System.out.println("House: Gryffindor\nEmblematic Animal: Lion\nColors: Red and Gold\nValues: Courage, Bravery, and Determination");
                break;
            case "Hufflepuff":
                System.out.println("House: Hufflepuff\nEmblematic Animal: Badger\nColors: Yellow and Black\nValues: Hard work, Patience, Loyalty, and Fair Play");
                break;
            case "Ravenclaw":
                System.out.println("House: Ravenclaw\nEmblematic Animal: Eagle\nColors: Blue and Silver\nValues: Intelligence, Learning, and Wisdom");
                break;
            case "Slytherin":
                System.out.println("House: Slytherin\nEmblematic Animal: Serpent\nColors: Green and Silver\nValues: Ambition, Cunning, and Resourcefulness");
                break;
            default:
                System.out.println("Invalid house. Please enter Gryffindor, Hufflepuff, Ravenclaw, or Slytherin.");
                break;
        }
    }
}


