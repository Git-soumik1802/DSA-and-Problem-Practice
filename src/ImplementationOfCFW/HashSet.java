package ImplementationOfCFW;

public class HashSet {

    // Node to store key and value
    static class Node {

        int key;
        String value;
        Node next;

        Node(int key, String value) {
            this.key = key;
            this.value = value;
            this.next = null;
        }
    }

    // Array of Nodes
    Node[] table;

    int capacity;

    // Constructor
    HashSet(int capacity) {
        this.capacity = capacity;
        table = new Node[capacity];
    }

    // Hash function
    int hash(int key) {
        return Math.abs(key) % capacity;
    }

    // Put key-value
    void put(int key, String value) {

        int index = hash(key);

        Node current = table[index];

        // If key already exists
        while (current != null) {

            if (current.key == key) {
                current.value = value;
                return;
            }

            current = current.next;
        }

        // Create new node
        Node newNode = new Node(key, value);

        // Insert at beginning
        newNode.next = table[index];
        table[index] = newNode;
    }

    // Get value using key
    String get(int key) {

        int index = hash(key);

        Node current = table[index];

        while (current != null) {

            if (current.key == key) {
                return current.value;
            }

            current = current.next;
        }

        return null;
    }

    // Remove key-value
    void remove(int key) {

        int index = hash(key);

        Node current = table[index];
        Node previous = null;

        while (current != null) {

            if (current.key == key) {

                if (previous == null) {
                    table[index] = current.next;
                } else {
                    previous.next = current.next;
                }

                return;
            }

            previous = current;
            current = current.next;
        }
    }

    // Check key exists
    boolean containsKey(int key) {

        int index = hash(key);

        Node current = table[index];

        while (current != null) {

            if (current.key == key) {
                return true;
            }

            current = current.next;
        }

        return false;
    }

    // Display HashMap
    void display() {

        for (int i = 0; i < capacity; i++) {

            System.out.print(i + " → ");

            Node current = table[i];

            while (current != null) {

                System.out.print(
                    "(" + current.key + ", " + current.value + ") → "
                );

                current = current.next;
            }

            System.out.println("null");
        }
    }

    public static void main(String[] args) {

        HashSet map = new HashSet(5);

        map.put(1, "Soumik");
        map.put(2, "Rahul");
        map.put(6, "Amit");
        map.put(11, "Rohan");

        map.display();

        System.out.println();

        System.out.println("Value of key 1: " + map.get(1));

        System.out.println("Value of key 6: " + map.get(6));

        System.out.println("Contains key 2: "
                + map.containsKey(2));

        map.remove(2);

        System.out.println("After removing key 2:");

        map.display();
    }
}