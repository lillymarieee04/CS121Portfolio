package weekFour;

public class CFTable {
    public static void main(String[]args) {
        System.out.println("Celsius   //   Fahrenheit   ");


        for (int celsius = 0; celsius <= 20; celsius++) {
            int fahrenheit = (celsius * 9/5) + 32;
            System.out.println(celsius + "         " + fahrenheit);
        }
    }
}
