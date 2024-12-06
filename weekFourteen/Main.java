package weekFourteen;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        System.out.println("Testing with Integer type:");
        DataStructure<Integer> intStructure = new DataStructure<>();
        intStructure.add(10);
        intStructure.add(20);
        intStructure.add(30);
        intStructure.print();
        intStructure.remove(20);
        intStructure.print();

        System.out.println("\nTesting with String type:");
        DataStructure<String> stringStructure = new DataStructure<>();
        stringStructure.add("Apple");
        stringStructure.add("Banana");
        stringStructure.add("Cherry");
        stringStructure.print();
        stringStructure.remove("Banana");
        stringStructure.print();

        System.out.println("\nTesting with Double type:");
        DataStructure<Double> doubleStructure = new DataStructure<>();
        doubleStructure.add(1.1);
        doubleStructure.add(2.2);
        doubleStructure.add(3.3);
        doubleStructure.print();
        doubleStructure.remove(2.2);
        doubleStructure.print();
    }
}

