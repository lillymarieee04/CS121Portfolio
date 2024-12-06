package weekFive;
import java.util.Scanner;

public class HotelOccupancy {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        int floors;
        int totalRooms = 0;
        int totalOccupiedRooms = 0;
        int totalVacantRooms;
        double occupancyRate;

        System.out.println("How many floors does the hotel have? ");
        floors = Integer.parseInt(keyboard.nextLine());

        for (int i = 1; i <= floors; i++) {
            System.out.printf("Enter the number of rooms on floor %d: ", i);
            int rooms = Integer.parseInt(keyboard.nextLine());

            System.out.println("How many rooms are occupied?");
            int occupiedRooms = Integer.parseInt(keyboard.nextLine());

            totalRooms += rooms;
            totalOccupiedRooms += occupiedRooms;
        }

        totalVacantRooms = totalRooms - totalOccupiedRooms;
        occupancyRate = (double) totalOccupiedRooms / totalRooms;

        // Display results
        System.out.printf("Floors: %d%nRooms: %d%nOccupied Rooms: %d%nVacant Rooms: %d%nOccupancy Rate: %.2f%%",
                floors, totalRooms, totalOccupiedRooms, totalVacantRooms, occupancyRate * 100);

        // Close the scanner (Chat Gpt helped me with this part)
        keyboard.close();
    }
}
