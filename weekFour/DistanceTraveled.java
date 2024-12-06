package weekFour;

import java.util.Scanner;

public class DistanceTraveled {

    public static void main(String [] args) {
        Scanner scnr = new Scanner(System.in);
        System.out.println("Enter the speed of the vehicle: ");
        int speed = scnr.nextInt();
        System.out.println("Enter the number of hours traveling");
        int hours = scnr.nextInt();
        System.out.println("Hour   //   Distance Traveled   ");
        for (int hour = 1; hour <= hours; hour++) {
            int distance = speed * hour;
            System.out.println(hour + "         " + distance);


        }
    }
}

