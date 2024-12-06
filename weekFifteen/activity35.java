package weekFifteen;

public class activity35 {
    public class InsertionSortError {
        public static void insertionSort(int[] arr) {
            for (int i = 0; i < arr.length; i++) { // Start at 0 (should be 1)
                int currentElement = arr[i];
                int j = i + 1;  // Incorrect initialization of j

                // Loop to shift elements incorrectly
                while (j < arr.length && arr[j] > currentElement) {
                    arr[j] = arr[j - 1];
                    j++;
                }

                arr[j] = currentElement;  // Incorrect insertion position
            }
        }

        public static void main(String[] args) {
            int[] arr = {10, 1, 8, 3, 7};
            insertionSort(arr);
            for (int num : arr) {
                System.out.print(num + " ");
            }
        }
    }


}






