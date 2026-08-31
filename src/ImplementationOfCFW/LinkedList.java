package ImplementationOfCFW;

import java.util.NoSuchElementException;

public class LinkedList {

    // Node class
    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // Head of LinkedList
    private Node head;

    // Add element at the end
    public void add(int data) {

        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            return;
        }

        Node curr = head;

        while (curr.next != null) {
            curr = curr.next;
        }

        curr.next = newNode;
    }

    // Add element at the beginning
    public void addFirst(int data) {

        Node newNode = new Node(data);

        newNode.next = head;
        head = newNode;
    }

    // Add element at a particular index
    public void add(int idx, int data) {
        if (idx < 0) {
            throw new IndexOutOfBoundsException();
        }
        if (idx == 0) {
            addFirst(data);
            return;
        }

        Node newNode = new Node(data);

        Node curr = head;

        for (int i = 0; i < idx - 1; i++) {

            if (curr == null) {
                throw new IndexOutOfBoundsException();
            }

            curr = curr.next;
        }

        if (curr == null) {
            throw new IndexOutOfBoundsException();
        }

        newNode.next = curr.next;
        curr.next = newNode;
    }

    // Get element from a particular index
    public int get(int idx) {

        if (idx < 0) {
            throw new IndexOutOfBoundsException();
        }

        Node curr = head;

        for (int i = 0; i < idx; i++) {

            if (curr == null) {
                throw new IndexOutOfBoundsException();
            }

            curr = curr.next;
        }

        if (curr == null) {
            throw new IndexOutOfBoundsException();
        }

        return curr.data;
    }

    // Remove first element
    public int removeFirst() {

        if (head == null) {
            throw new NoSuchElementException("List is empty");
        }

        int data = head.data;

        head = head.next;

        return data;
    }

    // Remove last element
    public int removeLast() {

        if (head == null) {
            throw new NoSuchElementException("List is empty");
        }

        // Only one node
        if (head.next == null) {

            int data = head.data;

            head = null;

            return data;
        }

        Node curr = head;

        while (curr.next.next != null) {
            curr = curr.next;
        }

        int data = curr.next.data;

        curr.next = null;

        return data;
    }

    // Remove element from a particular index
    public int remove(int idx) {

        if (head == null || idx < 0) {
            throw new IndexOutOfBoundsException();
        }

        // Remove first element
        if (idx == 0) {
            return removeFirst();
        }

        Node curr = head;

        for (int i = 0; i < idx - 1; i++) {

            if (curr.next == null) {
                throw new IndexOutOfBoundsException();
            }

            curr = curr.next;
        }

        if (curr.next == null) {
            throw new IndexOutOfBoundsException();
        }

        Node removeNode = curr.next;

        curr.next = removeNode.next;

        return removeNode.data;
    }

    // Search an element
    public boolean contains(int data) {

        Node curr = head;

        while (curr != null) {

            if (curr.data == data) {
                return true;
            }

            curr = curr.next;
        }

        return false;
    }

    // Find size of LinkedList
    public int size() {

        int count = 0;

        Node curr = head;

        while (curr != null) {

            count++;

            curr = curr.next;
        }

        return count;
    }

    // Display LinkedList
    public void display() {

        Node curr = head;

        while (curr != null) {

            System.out.print(curr.data + "->");

            curr = curr.next;
        }

        System.out.println("null");
    }

    // Main method
    public static void main(String[] args) {

        LinkedList list = new LinkedList();

        // Add elements
        list.add(10);
        list.add(20);
        list.add(30);

        list.display();

        // Add at beginning
        list.addFirst(5);

        list.display();

        // Add at index
        list.add(2, 15);

        list.display();

        // Get element
        System.out.println("Element at index 2: "
                + list.get(2));

        // Search
        System.out.println("Contains 30: "
                + list.contains(30));

        // Size
        System.out.println("Size: "
                + list.size());

        // Remove first
        System.out.println("Removed: "
                + list.removeFirst());

        list.display();

        // Remove last
        System.out.println("Removed: "
                + list.removeLast());

        list.display();

        // Remove by index
        System.out.println("Removed: "
                + list.remove(1));

        list.display();
    }
}