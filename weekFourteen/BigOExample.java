package weekFourteen;

public class BigOExample {
    public static void main(String[] args) {

        // Big O
        // What is Big O?
        // Describes the performance or complexity of an algorithm.
        // It tells you the maximum amount of time or space an algorithm will take.
        // Time Complexity - how long it takes to run based on input size.
        // Space Complexity - how much space it requires.

        printOneTime("Billy");

        // Other example methods can be added here

    }

    // O(1) - Constant time: doesn't change based on input size
    public static void printOneTime(String name) {
        System.out.println(name);  // Always takes the same time regardless of input size
    }

    // O(log n) - Logarithmic time: time grows logarithmically with input size
    public static int binarySearch(String[] array, String value) {
        int low = 0;
        int high = array.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            int result = value.compareTo(array[mid]);

            if (result == 0) {
                return mid;  // Found the value
            } else if (result < 0) {
                high = mid - 1;  // Search in the left half
            } else {
                low = mid + 1;  // Search in the right half
            }
        }

        return -1;  // Return -1 if the value is not found
    }
}

