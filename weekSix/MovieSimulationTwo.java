package weekSix;

import java.util.Random;

public class MovieSimulationTwo {
    static final int ROWS = 5;
    static final int COLUMNS = 10;

    public static void main(String[] args) {
        String[] movieNames = {"Movie A", "Movie B", "Movie C", "Movie D"};
        String[] movieTypes = {"Action", "Comedy", "Drama", "Horror"};
        double[] moviePrices = {10.99, 8.99, 12.99, 9.99};

        int[][] movieAvailability = new int[ROWS][COLUMNS];

        displayMovieDetails(movieNames, movieTypes, moviePrices);

        setSeatAvailability(movieAvailability);

        System.out.println("\nInitial Seat Availability:");
        displaySeatAvailability(movieAvailability);

        randomizeAvailability(movieAvailability);

        System.out.println("\nRandomized Seat Availability:");
        displaySeatAvailability(movieAvailability);
    }

    public static void displayMovieDetails(String[] names, String[] types, double[] prices) {
        System.out.println("Movie Details:");
        System.out.println("Name       | Type     | Price");
        System.out.println("------------------------------");
        for (int i = 0; i < names.length; i++) {
            System.out.printf("%-10s | %-8s | $%.2f\n", names[i], types[i], prices[i]);
        }
    }

    public static void setSeatAvailability(int[][] availability) {
        for (int row = 0; row < ROWS; row++) {
            for (int col = 0; col < COLUMNS; col++) {
                availability[row][col] = 0;
            }
        }
    }

    public static void randomizeAvailability(int[][] availability) {
        Random rand = new Random();
        for (int row = 0; row < ROWS; row++) {
            for (int col = 0; col < COLUMNS; col++) {
                availability[row][col] = rand.nextInt(2);
            }
        }
    }

    public static void displaySeatAvailability(int[][] availability) {
        System.out.println("Seat Availability (0 = empty, 1 = occupied):");
        for (int row = 0; row < ROWS; row++) {
            for (int col = 0; col < COLUMNS; col++) {
                System.out.print(availability[row][col] + " ");
            }
            System.out.println();
        }
    }
}
