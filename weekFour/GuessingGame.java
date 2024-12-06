package weekFour;

import java.util.Scanner;

public class GuessingGame {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int number = 35;
        boolean gameOver = false;
        int uGuess;

        System.out.println("Guess a number between 1-100, or enter 'q' if you want to quit: ");

        while (!gameOver) {
            String userGuess = scn.nextLine();  // Get user input (number or 'q')

            if (userGuess.equalsIgnoreCase("q")) {
                System.out.println("You quit the game.");
                gameOver = true;
                break;
            }

            try {
                uGuess = Integer.parseInt(userGuess);

                if (uGuess > number) {
                    System.out.println("Too High");
                } else if (uGuess < number) {
                    System.out.println("Too Low");
                } else {
                    System.out.println("Correct! You guessed the number.");
                    gameOver = true; // Exit loop when the correct number is guessed
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a number between 1-100 or 'q' to quit.");
            }
        }

        scn.close();
    }
}
