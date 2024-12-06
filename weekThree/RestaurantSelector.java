package weekThree;

import java.util.Scanner;

//class (down) needed imports (up)

public class RestaurantSelector {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        boolean isVegetarian;
        boolean isVegan;
        boolean isGlutenFree;

//questions

        System.out.print("Is anyone in your party vegetarian? (yes/no): ");
        isVegetarian = scnr.next().equalsIgnoreCase("yes");

        System.out.print("Is anyone in your party vegan? (yes/no): ");
        isVegan = scnr.next().equalsIgnoreCase("yes");

        System.out.print("Is anyone in your party gluten-free? (yes/no): ");
        isGlutenFree = scnr.next().equalsIgnoreCase("yes");

        System.out.println("\nYou can choose the following restaurants:");

//if statements/sorting

        if (!isVegetarian && !isVegan && !isGlutenFree) {
            System.out.println("Joe’s Gourmet Burgers");
        }
        if (isVegetarian && !isVegan && isGlutenFree) {
            System.out.println("Main Street Pizza Company");
        }
        if (isVegetarian && isVegan && isGlutenFree) {
            System.out.println("Corner Café");
            System.out.println("The Chef’s Kitchen");
        }
        if (isVegetarian && !isVegan && !isGlutenFree) {
            System.out.println("Mama’s Fine Italian");
        }

        if ((isVegetarian || isVegan || isGlutenFree)) {
            System.out.println("Corner Café");
            System.out.println("The Chef’s Kitchen");
        }

//closing

        scnr.close();
    }
}

