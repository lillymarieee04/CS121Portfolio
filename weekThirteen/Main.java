package weekThirteen;

public class Main {
    public static void main(String[] args) {
        // Create an instance of the DataStructure class to access its methods for each data structure.
        DataStructure dataStructure = new DataStructure();

        // Add elements to ArrayList, showing how ArrayLists allow ordered storage.
        dataStructure.addToArrayList("Apple");
        dataStructure.addToArrayList("Banana");
        dataStructure.addToArrayList("Cherry");

        // Add elements to LinkedList, demonstrating sequential, ordered insertion.
        dataStructure.addToLinkedList("Dog");
        dataStructure.addToLinkedList("Elephant");
        dataStructure.addToLinkedList("Fox");

        // Add elements to HashSet, which prevents duplicates and has no guaranteed order.
        dataStructure.addToHashSet("Grape");
        dataStructure.addToHashSet("Honeydew");
        dataStructure.addToHashSet("Ivy");

        // Add elements to TreeSet, which stores unique elements in a sorted order.
        dataStructure.addToTreeSet("Jackfruit");
        dataStructure.addToTreeSet("Kiwi");
        dataStructure.addToTreeSet("Lemon");

        // Add key-value pairs to HashMap, which maps unique keys to values.
        dataStructure.addToHashMap(1, "Mango");
        dataStructure.addToHashMap(2, "Nectarine");
        dataStructure.addToHashMap(3, "Orange");

        // Add elements to Stack, demonstrating Last In, First Out (LIFO) behavior.
        dataStructure.addToStack("Papaya");
        dataStructure.addToStack("Quince");
        dataStructure.addToStack("Raspberry");

        // Print the current elements in each data structure after adding items.
        System.out.println("After adding elements:");
        dataStructure.printArrayList();
        dataStructure.printLinkedList();
        dataStructure.printHashSet();
        dataStructure.printTreeSet();
        dataStructure.printHashMap();
        dataStructure.printStack();

        // Remove specific elements from each data structure.
        // This demonstrates each structure’s unique behavior regarding deletion.
        dataStructure.removeFromArrayList("Banana"); // Removes by value from ArrayList.
        dataStructure.removeFromLinkedList("Elephant"); // Removes by value from LinkedList.
        dataStructure.removeFromHashSet("Honeydew"); // Removes by value from HashSet.
        dataStructure.removeFromTreeSet("Kiwi"); // Removes by value from TreeSet.
        dataStructure.removeFromHashMap(2); // Removes entry with key '2' from HashMap.
        dataStructure.removeFromStack(); // Removes the last item added to Stack (LIFO).

        // Print the elements in each data structure after removal.
        // This verifies the correctness of the removal operations and shows the current state of each structure.
        System.out.println("\nAfter removing elements:");
        dataStructure.printArrayList();
        dataStructure.printLinkedList();
        dataStructure.printHashSet();
        dataStructure.printTreeSet();
        dataStructure.printHashMap();
        dataStructure.printStack();
    }
}

