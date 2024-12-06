package weekThirteen;

import java.util.ArrayList;   // Provides a resizable array implementation
import java.util.LinkedList;  // Provides a doubly-linked list implementation
import java.util.HashSet;     // Provides a hash-based set implementation, unique elements only
import java.util.TreeSet;     // Provides a sorted set implementation, keeps elements in order
import java.util.HashMap;     // Provides a hash-based key-value map
import java.util.Stack;       // Provides a last-in, first-out (LIFO) stack implementation

public class DataStructure {
    // Declaring private fields for each data structure type
    // Using private to encapsulate each data structure, restricting access only to this class
    private ArrayList<String> arrayList;
    private LinkedList<String> linkedList;
    private HashSet<String> hashSet;
    private TreeSet<String> treeSet;
    private HashMap<Integer, String> hashMap;
    private Stack<String> stack;

    public DataStructure() {
        arrayList = new ArrayList<>();
        linkedList = new LinkedList<>();
        hashSet = new HashSet<>();
        treeSet = new TreeSet<>();
        hashMap = new HashMap<>();
        stack = new Stack<>();
    }

    public void addToArrayList(String element) {
        arrayList.add(element);
    }

    public void removeFromArrayList(String element) {
        arrayList.remove(element);
    }

    public void printArrayList() {
        System.out.println("ArrayList: " + arrayList);
    }

    public void addToLinkedList(String element) {
        linkedList.add(element);
    }

    public void removeFromLinkedList(String element) {
        linkedList.remove(element);
    }

    public void printLinkedList() {
        System.out.println("LinkedList: " + linkedList);
    }

    public void addToHashSet(String element) {
        hashSet.add(element);
    }

    public void removeFromHashSet(String element) {
        hashSet.remove(element);
    }

    public void printHashSet() {
        System.out.println("HashSet: " + hashSet);
    }

    public void addToTreeSet(String element) {
        treeSet.add(element);
    }

    public void removeFromTreeSet(String element) {
        treeSet.remove(element);
    }

    public void printTreeSet() {
        System.out.println("TreeSet: " + treeSet);
    }

    public void addToHashMap(int key, String value) {
        hashMap.put(key, value);
    }

    public void removeFromHashMap(int key) {
        hashMap.remove(key);
    }

    public void printHashMap() {
        System.out.println("HashMap: " + hashMap);
    }

    public void addToStack(String element) {
        stack.push(element);
    }

    public void removeFromStack() {
        if (!stack.isEmpty()) {
            stack.pop();
        }
    }

    public void printStack() {
        System.out.println("Stack: " + stack);
    }
}

