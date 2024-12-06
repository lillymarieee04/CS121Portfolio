package weekFourteen;

// DataStructure.java

/*
1. What is the purpose of generics in Java?
Generics allow for type safety by enabling classes, interfaces, and methods to operate on specific types without requiring explicit casting. This reduces runtime errors and enhances code readability.

2. How can generics be used in Java programming?
Generics can be applied in classes, methods, and interfaces to handle different types without duplicating code. For example, they are used in collections like ArrayList<T> or HashMap<K, V>.

3. What are the pros and cons of using generics?
Pros: Generics provide type safety, eliminate the need for casting, and improve code reusability.
Cons: They increase complexity and may result in more verbose code. Additionally, Java's type erasure limits certain operations with generics.
*/

import java.util.ArrayList;

// Generic DataStructure class
public class DataStructure<T> { // T is the type parameter
    private ArrayList<T> elements;

    public DataStructure() {
        elements = new ArrayList<>();
    }

    public void add(T element) {
        elements.add(element);
    }

    public void remove(T element) {
        if (elements.contains(element)) {
            elements.remove(element);
            System.out.println("Removed: " + element);
        } else {
            System.out.println("Element not found: " + element);
        }
    }

    public void print() {
        System.out.println("DataStructure elements:");
        for (T element : elements) {
            System.out.println(element);
        }
    }
}

