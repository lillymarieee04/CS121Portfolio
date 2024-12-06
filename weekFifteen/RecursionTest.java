package weekFifteen;
import java.util.Scanner;

public class RecursionTest {
    public static void main(String[] args) {
        Recursion recursion = new Recursion();

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a starting number for countdown: ");
        int startNumber = Integer.parseInt(scanner.nextLine());

        System.out.print("Enter a starting letter for alphabet reverse: ");
        char startLetter = scanner.nextLine().charAt(0);

        scanner.close();

        System.out.println("\nCountdown:");
        recursion.countDown(startNumber);

        System.out.println("\nAlphabet Backwards:");
        recursion.alphaBackwards(startLetter);
    }
}
