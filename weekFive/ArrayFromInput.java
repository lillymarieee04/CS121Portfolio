package weekFive;

import java.util.Scanner;

public class ArrayFromInput {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);

        final int NUM_ELEMENTS = 3;

        String[] customerNames = new String[NUM_ELEMENTS];
        String[] itemNames = new String[NUM_ELEMENTS];
        int[] ratings = new int[NUM_ELEMENTS];

        for (int i = 0; i < NUM_ELEMENTS; ++i) {
            System.out.println("Enter customer " + (i + 1) + " name:");
            customerNames[i] = scnr.nextLine();

            System.out.println("Enter the item name for " + customerNames[i] + ":");
            itemNames[i] = scnr.nextLine();

            System.out.println("Enter the rating (1-5) for " + itemNames[i] + ":");
            ratings[i] = scnr.nextInt();
            scnr.nextLine(); // Consume newline left-over from nextInt
        }

        System.out.println("\nCustomer Feedback Data:");
        System.out.printf("%-15s %-15s %-15s\n", "Customer", "Item", "Rating");

        for (int i = 0; i < NUM_ELEMENTS; ++i) {
            System.out.printf("%-15s %-15s %-15d\n", customerNames[i], itemNames[i], ratings[i]);
        }
    }
}

