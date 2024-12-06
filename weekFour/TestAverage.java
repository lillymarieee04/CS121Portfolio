package weekFour;

import java.util.Scanner;

public class TestAverage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("Enter the number of students: ");
        int numStudents = scanner.nextInt();

        System.out.println("Enter the number of test scores per students: ");
        int numScores = scanner.nextInt();

        for (int i = 1; i <= numStudents; i++) {
            double totalScore = 0;

            System.out.println("Student " + i + ":");


            for (int j = 1; j <= numScores; j++) {
                System.out.println("Enter test score " + j + ": ");
                double score = scanner.nextDouble();
                totalScore += score;
            }

            double averageScore = totalScore / numScores;
            System.out.println("Average test score for Student " + i + ": " + averageScore);
            System.out.println();

            scanner.close();
        }
    }
}