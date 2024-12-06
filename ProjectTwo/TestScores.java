package ProjectTwo;

import java.util.Scanner;
import java.util.Random;

public class TestScores {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        final int SIZE = random.nextInt(8) + 3;

        int[] testScores = new int[SIZE];
        char[] letterGrades = new char[SIZE];

        System.out.println("Enter " + SIZE + " test scores:");

        for (int i = 0; i < SIZE; i++) {
            int score;
            do {
                System.out.print("Enter score for test " + (i + 1) + " (0-100): ");
                score = scanner.nextInt();
                if (score < 0 || score > 100) {
                    System.out.println("Invalid score! Please enter a score between 0 and 100.");
                }
            } while (score < 0 || score > 100);
            testScores[i] = score;
        }

        for (int i = 0; i < SIZE; i++) {
            letterGrades[i] = getLetterGrade(testScores[i]);
        }

        printGrades(testScores, letterGrades);
        printHighestScore(testScores);
        printLowestScore(testScores);
        printAverageScore(testScores);

        scanner.close();
    }

    public static char getLetterGrade(int score) {
        if (score >= 90) {
            return 'A';
        } else if (score >= 80) {
            return 'B';
        } else if (score >= 70) {
            return 'C';
        } else if (score >= 60) {
            return 'D';
        } else {
            return 'F';
        }
    }

    public static void printGrades(int[] scores, char[] grades) {
        System.out.println("Score\tGrade");
        for (int i = 0; i < scores.length; i++) {
            System.out.println(scores[i] + "\t" + grades[i]);
        }
    }

    public static void printHighestScore(int[] scores) {
        int highest = scores[0];
        for (int score : scores) {
            if (score > highest) {
                highest = score;
            }
        }
        System.out.println("Highest Score: " + highest);
    }

    public static void printLowestScore(int[] scores) {
        int lowest = scores[0];
        for (int score : scores) {
            if (score < lowest) {
                lowest = score;
            }
        }
        System.out.println("Lowest Score: " + lowest);
    }

    public static void printAverageScore(int[] scores) {
        int total = 0;
        for (int score : scores) {
            total += score;
        }
        double average = (double) total / scores.length;
        System.out.printf("Average Score: %.2f\n", average);  // Limit to 2 decimal places
    }
}
