package weekSix.labSix;

import java.util.Scanner;

public class Rectangle {
    static Scanner scnr = new Scanner(System.in);

    public static double getLength() {
        System.out.print("Enter the rectangle's length: ");
        return scnr.nextDouble();
    }

    public static double getWidth() {
        System.out.print("Enter the rectangle's width: ");
        return scnr.nextDouble();
    }

    public static double getArea(double length, double width) {
        return length * width;
    }

    public static void displayData(double length, double width, double area) {
        System.out.println("Length: " + length);
        System.out.println("Width: " + width);
        System.out.println("Area: " + area);
    }

    public static void main(String[] args) {
        double length = getLength();
        double width = getWidth();
        double area = getArea(length, width);

        displayData(length, width, area);

        scnr.close();
    }
}

