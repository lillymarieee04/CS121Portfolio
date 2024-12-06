package weekSix;
import java.util.Scanner;

public class MovieSimulationOne {

    public static void main(String[]args){

        Scanner scn = new Scanner (System.in);


       /* String [] movieNames = {"The Notebook", "Spider-Man", "Scream", "Grown Ups"};
        String movieType [] = {"Romance", "Action", "Horror", "Comedy"};
        double prices [] = {4, 8, 16, 32};


        */

        System.out.println("How many characters would you like to enter: ");


        //Constant Variable
        final int NUM_OF_CHARACTER = Integer.parseInt(scn.nextLine());

        String [] movieNames = new String [NUM_OF_CHARACTER];
        String movieType [] = new String [NUM_OF_CHARACTER];
        double prices [] = new double [NUM_OF_CHARACTER];

        for(int i = 0; i < NUM_OF_CHARACTER; i++) {
            //prompt user to enter movie name, movie type, and price
            System.out.println("Enter your movie details: " + (i+1));
            System.out.println("Character Name: ");
            movieNames[i] = scn.nextLine();
            System.out.println("Movie Type: ");
            movieType[i] = scn.nextLine();
            System.out.println("Movie Prices: ");
            prices[i] = Double.parseDouble(scn.nextLine());
            //add one more moviePrices
        }

        displayMovieDetails(movieNames, movieType, prices);
    }

    //Method
    //static return type  nameForMethod(){}
    static void displayMovieDetails(String[] movieNames, String[] movieType, double[] prices){
        System.out.println("\nMovie Names: ");
        String header = String.format("%-20s %-20s %-20s", "Movie Name: ", "Movie Types: ", "Movie Prices: ");
        System.out.println(header);
        for(int i = 0; i< movieNames.length; i++){
            String output = String.format("%-20s %-20s %.2f",movieNames[i], movieType[i], prices[i]);
            System.out.println(output);
        }

    }
}
