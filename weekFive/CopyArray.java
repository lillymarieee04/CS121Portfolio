package weekFive;

import java.util.Scanner;

public class CopyArray {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);

        System.out.print("Enter the number of elements for the arrays: ");
        final int NUM_ELEMENTS = scnr.nextInt();

        int[] array1 = new int[NUM_ELEMENTS];
        int[] array2 = new int[NUM_ELEMENTS];
        int[] array3 = new int[NUM_ELEMENTS];
        int[] array4 = new int[NUM_ELEMENTS];

        for (int i = 0; i < NUM_ELEMENTS; i++) {
            System.out.print("Enter number for array1[" + i + "]: ");
            array1[i] = scnr.nextInt();
        }

        System.out.println("Array1:");
        for (int i = 0; i < NUM_ELEMENTS; i++) {
            System.out.print(array1[i] + " ");
        }
        System.out.println();

        for (int i = 0; i < NUM_ELEMENTS; i++) {
            array2[i] = array1[i];
        }

        System.out.println("Array2 (copy of Array1):");
        for (int i = 0; i < NUM_ELEMENTS; i++) {
            System.out.print(array2[i] + " ");
        }
        System.out.println();

        for (int i = 0; i < NUM_ELEMENTS; i++) {
            array3[i] = array1[i] * array1[i];
        }

        System.out.println("Array3 (elements of Array1 squared):");
        for (int i = 0; i < NUM_ELEMENTS; i++) {
            System.out.print(array3[i] + " ");
        }
        System.out.println();

        for (int i = 0; i < NUM_ELEMENTS; i++) {
            array4[i] = array1[NUM_ELEMENTS - 1 - i];
        }

        System.out.println("Array4 (elements of Array1 in reverse order):");
        for (int i = 0; i < NUM_ELEMENTS; i++) {
            System.out.print(array4[i] + " ");
        }
        System.out.println();

        scnr.close();
    }
}

