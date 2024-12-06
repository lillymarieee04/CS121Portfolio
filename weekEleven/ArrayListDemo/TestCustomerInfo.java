package weekEleven.ArrayListDemo;

import java.util.Scanner;

public class TestCustomerInfo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SystemManagement systemManagement = new SystemManagement();

        String input;
        System.out.println("Enter 'name' to add a name, 'age' to add an age, 'score' to add a score, or 'q' to quit.");

        while (true) {
            System.out.print("Enter choice (name/age/score/q): ");
            input = scanner.nextLine();

            if (input.equals("q")) {
                break;
            }

            switch (input) {
                case "name":
                    System.out.print("Enter name: ");
                    String name = scanner.nextLine();
                    systemManagement.addName(name);
                    break;

                case "age":
                    System.out.print("Enter age: ");
                    int age = scanner.nextInt();
                    scanner.nextLine();  // Consume newline
                    systemManagement.addAge(age);
                    break;

                case "score":
                    System.out.print("Enter score: ");
                    double score = scanner.nextDouble();
                    scanner.nextLine();  // Consume newline
                    systemManagement.addScore(score);
                    break;

                default:
                    System.out.println("Invalid input. Try again.");
            }
        }

        System.out.println("\nInformation entered:");

        systemManagement.displayNamesForEach();

        systemManagement.displayAgesForLoop();

        systemManagement.displayScoresForLoop();

        scanner.close();
    }
}

