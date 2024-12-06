package weekSeven;

import java.util.Random;
import java.util.Scanner;

public class MovieSimulationThree {
    private static final int ROWS = 5;
    private static final int COLUMNS = 10;

    public static void main(String[] args) {
        String[] movieNames = {"The Matrix", "Inception", "Avatar", "Titanic"};
        String[] movieTypes = {"Sci-Fi", "Sci-Fi", "Fantasy", "Drama"};
        double[] moviePrices = {10.0, 12.5, 15.0, 9.5};
        int[][] movieAvailability = new int[ROWS][COLUMNS];

        displayMovieDetails(movieNames, movieTypes, moviePrices);


        int index = selectMovie(movieNames);


        displaySelectedMovie(movieNames[index], movieTypes[index], moviePrices[index]);

        setSeatAvailability(movieAvailability);
        displaySeatAvailability(movieAvailability);

        randomizeAvailability(movieAvailability);
        displaySeatAvailability(movieAvailability);
    }

    public static void displayMovieDetails(String[] movieNames, String[] movieTypes, double[] moviePrices) {
        System.out.println("Available Movies:");
        System.out.printf("%-15s %-10s %-10s\n", "Movie", "Type", "Price");
        for (int i = 0; i < movieNames.length; i++) {
            System.out.printf("%-15s %-10s $%-10.2f\n", movieNames[i], movieTypes[i], moviePrices[i]);
        }
    }

    public static int selectMovie(String[] movieNames) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("Enter the movie you would like to select: ");
            String selectedMovie = sc.nextLine();
            for (int i = 0; i < movieNames.length; i++) {
                if (movieNames[i].equalsIgnoreCase(selectedMovie)) {
                    return i;
                }
            }
            System.out.println("Movie not found. Try again.");
        }
    }

    public static void displaySelectedMovie(String movieName, String movieType, double moviePrice) {
        System.out.println("Selected Movie:");
        System.out.printf("Movie: %s, Type: %s, Price: $%.2f\n", movieName, movieType, moviePrice);
    }

    public static void setSeatAvailability(int[][] movieAvailability) {
        for (int i = 0; i < ROWS; i++) {
            for (int j = 0; j < COLUMNS; j++) {
                movieAvailability[i][j] = 0;
            }
        }
    }

    public static void randomizeAvailability(int[][] movieAvailability) {
        Random random = new Random();
        for (int i = 0; i < ROWS; i++) {
            for (int j = 0; j < COLUMNS; j++) {
                movieAvailability[i][j] = random.nextInt(2);
            }
        }
    }

    public static void displaySeatAvailability(int[][] movieAvailability) {
        System.out.println("Seat Availability:");
        System.out.print("  ");
        for (int i = 1; i <= COLUMNS; i++) {
            System.out.printf("%-3d", i);
        }
        System.out.println();

        for (int i = 0; i < ROWS; i++) {
            System.out.print((char) ('A' + i) + " ");
            for (int j = 0; j < COLUMNS; j++) {
                if (movieAvailability[i][j] == 0) {
                    System.out.print("O  ");
                } else {
                    System.out.print("X  ");
                }
            }
            System.out.println();
        }
    }
}

