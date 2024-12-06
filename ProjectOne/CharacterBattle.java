package ProjectOne;

import java.util.Random;
import java.util.Scanner;

public class CharacterBattle {

    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        Random random = new Random();

        // Get the number of rounds
        int rounds;
        do {
            System.out.print("Enter an odd number of rounds: ");
            rounds = scnr.nextInt();
        } while (rounds % 2 == 0);

        int player1Wins = 0;
        int player2Wins = 0;

        for (int round = 1; round <= rounds; ++round) {
            System.out.println("\nRound " + round);

            // Player 1 details
            System.out.println("Player 1, enter your character's details:");
            String player1Name = getStringInput("Name: ", scnr);
            int[] player1Stats = getCharacterStats(scnr);

            // Player 2 details
            System.out.println("Player 2, enter your character's details:");
            String player2Name = getStringInput("Name: ", scnr);
            int[] player2Stats = getCharacterStats(scnr);

            // Determine round winner
            int roundWinner = determineRoundWinner(player1Stats, player2Stats, random);

            if (roundWinner == 1) {
                System.out.println(player1Name + " (Player 1) wins this round!");
                player1Wins++;
            } else if (roundWinner == 2) {
                System.out.println(player2Name + " (Player 2) wins this round!");
                player2Wins++;
            }
        }

        // Print final scores
        System.out.println("\nFinal Scores:");
        System.out.println("Player 1: " + player1Wins);
        System.out.println("Player 2: " + player2Wins);

        // Determine overall winner
        if (player1Wins > player2Wins) {
            System.out.println("Player 1 is the overall winner!");
        } else if (player2Wins > player1Wins) {
            System.out.println("Player 2 is the overall winner!");
        } else {
            System.out.println("It's a tie!");
        }
        scnr.close();
    }

    private static String getStringInput(String message, Scanner scnr) {
        System.out.print(message);
        return scnr.next();
    }

    private static int[] getCharacterStats(Scanner scnr) {
        int[] stats = new int[3];
        System.out.print("Hit Points: ");
        stats[0] = scnr.nextInt();
        System.out.print("Move Power: ");
        stats[1] = scnr.nextInt();
        System.out.print("Attack Speed: ");
        stats[2] = scnr.nextInt();
        return stats;
    }

    private static int determineRoundWinner(int[] p1Stats, int[] p2Stats, Random random) {
        // Determine who attacks first based on speed or random choice
        if (p1Stats[2] > p2Stats[2]) {
            // Player 1 attacks first
            p2Stats[0] -= p1Stats[1];
            if (p2Stats[0] <= 0) return 1;
            p1Stats[0] -= p2Stats[1];
            if (p1Stats[0] <= 0) return 2;
        } else if (p1Stats[2] < p2Stats[2]) {
            // Player 2 attacks first
            p1Stats[0] -= p2Stats[1];
            if (p1Stats[0] <= 0) return 2;
            p2Stats[0] -= p1Stats[1];
            if (p2Stats[0] <= 0) return 1;
        } else {
            // Speeds are equal, use random choice
            if (random.nextBoolean()) {
                // Player 1 attacks first
                p2Stats[0] -= p1Stats[1];
                if (p2Stats[0] <= 0) return 1;
                p1Stats[0] -= p2Stats[1];
                if (p1Stats[0] <= 0) return 2;
            } else {
                // Player 2 attacks first
                p1Stats[0] -= p2Stats[1];
                if (p1Stats[0] <= 0) return 2;
                p2Stats[0] -= p1Stats[1];
                if (p2Stats[0] <= 0) return 1;
            }
        }
        return 0;
    }
}
