package weekThree.labThree;
import java.util.Scanner;


public class Triangles {
    public static void main(String[]args){
        Scanner scnr = new Scanner(System.in);

        System.out.print("Enter the length of side 1: ");
        int side1 = scnr.nextInt();
        System.out.print("Enter the length of side 2: ");
        int side2 = scnr.nextInt();
        System.out.print("Enter the length of side 3: ");
        int side3 = scnr.nextInt();


        if (side1 == side2 && side2 == side3) {
            System.out.println("The triangle is equilateral.");
        } else if (side1 == side2 || side2 == side3 || side1 == side3) {
            System.out.println("The triangle is isosceles.");
        } else {
            System.out.println("The triangle is scalene.");
        }
    }
}
