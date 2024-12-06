package weekFour.labFour;

import java.util.Scanner;
import java.util.Random;

public class ESPGame {
    public static void main(String[] args) {
        String[] colors = {"red", "green", "blue", "orange", "yellow"};

        Scanner input = new Scanner(System.in);
        Random random = new Random();

        int correctGuesses = 0;


        for (int i = 1; i <= 10; i++) {
            int randomInt = random.nextInt(5);
            String computerColor = colors[randomInt];

            System.out.println("What color has the computer chosen?");
            String userGuess = input.nextLine().toLowerCase();

            System.out.println("The computer has chosen: " + computerColor);

            if (userGuess.equals(computerColor)) {
                correctGuesses++;
                System.out.println("Correct!");
            } else {
                System.out.println("Wrong guess!");
            }
        }

        System.out.println("You got " + correctGuesses + " out of 10 correct.");

        input.close();
    }
}