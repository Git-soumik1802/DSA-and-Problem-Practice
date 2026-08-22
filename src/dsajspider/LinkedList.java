package dsajspider;

import java.util.ArrayList;

public class LinkedList {

    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    Node head;
    int count = 0;

    public void add(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            count++;
            return;
        }

        Node curr = head;

        while (curr.next != null) {
            curr = curr.next;
        }

        curr.next = newNode;
        count++;
    }

    public void addFirst(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
        count++;
    }

    public void addAtIndex(int index, int data) {

        if (index < 0 || index > count) {
            throw new IndexOutOfBoundsException("Invalid Index");
        }

        if (index == 0) {
            addFirst(data);
            return;
        }

        Node newNode = new Node(data);
        Node curr = head;

        for (int i = 0; i < index - 1; i++) {
            curr = curr.next;
        }

        newNode.next = curr.next;
        curr.next = newNode;

        count++;
    }

    public void display() {
        Node curr = head;

        while (curr != null) {
            System.out.print(curr.data + " -> ");
            curr = curr.next;
        }

        System.out.println("null");
    }

    public int getFirst() {

        if (head == null) {
            throw new RuntimeException("List is Empty");
        }

        return head.data;
    }

    public int getLast() {

        if (head == null) {
            throw new RuntimeException("List is Empty");
        }

        Node curr = head;

        while (curr.next != null) {
            curr = curr.next;
        }

        return curr.data;
    }

    public int get(int index) {

        if (index < 0 || index >= count) {
            throw new IndexOutOfBoundsException("Invalid Index");
        }

        Node curr = head;

        for (int i = 0; i < index; i++) {
            curr = curr.next;
        }

        return curr.data;
    }

    public void set(int index, int value) {

        if (index < 0 || index >= count) {
            throw new IndexOutOfBoundsException("Invalid Index");
        }

        Node curr = head;

        for (int i = 0; i < index; i++) {
            curr = curr.next;
        }

        curr.data = value;
    }

    public boolean contains(int value) {
        Node curr = head;

        while (curr != null) {

            if (curr.data == value) {
                return true;
            }

            curr = curr.next;
        }

        return false;
    }

    public int indexOf(int value) {
        Node curr = head;
        int index = 0;

        while (curr != null) {

            if (curr.data == value) {
                return index;
            }

            curr = curr.next;
            index++;
        }

        return -1;
    }

    public void removeFirst() {

        if (head == null) {
            throw new RuntimeException("List is Empty");
        }

        head = head.next;
        count--;
    }

    public void removeLast() {

        if (head == null) {
            throw new RuntimeException("List is Empty");
        }

        if (head.next == null) {
            head = null;
            count--;
            return;
        }

        Node curr = head;

        while (curr.next.next != null) {
            curr = curr.next;
        }

        curr.next = null;
        count--;
    }

    public void remove(int value) {

        if (head == null) {
            throw new RuntimeException("List is Empty");
        }

        if (head.data == value) {
            head = head.next;
            count--;
            return;
        }

        Node curr = head;

        while (curr.next != null && curr.next.data != value) {
            curr = curr.next;
        }

        if (curr.next == null) {
            throw new RuntimeException("Element Not Found");
        }

        curr.next = curr.next.next;
        count--;
    }

    public void removeAtIndex(int index) {

        if (index < 0 || index >= count) {
            throw new IndexOutOfBoundsException("Invalid Index");
        }

        if (index == 0) {
            removeFirst();
            return;
        }

        Node curr = head;

        for (int i = 0; i < index - 1; i++) {
            curr = curr.next;
        }

        curr.next = curr.next.next;
        count--;
    }

    public void reverse() {
        Node prev = null;
        Node curr = head;
        Node next = null;

        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        head = prev;
    }

    public int middleElement() {

        if (head == null) {
            throw new RuntimeException("List is Empty");
        }

        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow.data;
    }

    public boolean search(int key) {
        Node curr = head;

        while (curr != null) {

            if (curr.data == key) {
                return true;
            }

            curr = curr.next;
        }

        return false;
    }

    public int countOccurrences(int key) {
        Node curr = head;
        int occurrences = 0;

        while (curr != null) {

            if (curr.data == key) {
                occurrences++;
            }

            curr = curr.next;
        }

        return occurrences;
    }

    public void printReverse(Node node) {

        if (node == null) {
            return;
        }

        printReverse(node.next);

        System.out.print(node.data + " ");
    }

    public boolean detectLoop() {
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                return true;
            }
        }

        return false;
    }

    public void removeDuplicates() {
        Node curr = head;

        while (curr != null && curr.next != null) {

            if (curr.data == curr.next.data) {
                curr.next = curr.next.next;
                count--;
            } else {
                curr = curr.next;
            }
        }
    }

    public int nthNodeFromEnd(int n) {

        if (n <= 0 || n > count) {
            throw new RuntimeException("Invalid Position");
        }

        Node first = head;
        Node second = head;

        for (int i = 0; i < n; i++) {
            first = first.next;
        }

        while (first != null) {
            first = first.next;
            second = second.next;
        }

        return second.data;
    }

    public boolean palindrome() {
        ArrayList<Integer> list = new ArrayList<>();
        Node curr = head;

        while (curr != null) {
            list.add(curr.data);
            curr = curr.next;
        }

        int left = 0;
        int right = list.size() - 1;

        while (left < right) {

            if (!list.get(left).equals(list.get(right))) {
                return false;
            }

            left++;
            right--;
        }

        return true;
    }

    public int size() {
        return count;
    }

    public boolean isEmpty() {
        return count == 0;
    }

    public void clear() {
        head = null;
        count = 0;
    }

    public static void main(String[] args) {

        LinkedList list = new LinkedList();

        list.add(10);
        list.add(20);
        list.add(30);
        list.add(30);
        list.add(40);

        list.addFirst(5);

        list.addAtIndex(2, 15);

        list.display();

        System.out.println("First: " + list.getFirst());

        System.out.println("Last: " + list.getLast());

        System.out.println("Get Index 2: " + list.get(2));

        list.set(2, 100);

        list.display();

        System.out.println("Contains 20: " + list.contains(20));

        System.out.println("Index of 30: " + list.indexOf(30));

        list.removeFirst();

        list.display();

        list.removeLast();

        list.display();

        list.remove(20);

        list.display();

        list.removeAtIndex(1);

        list.display();

        System.out.println("Middle Element: " + list.middleElement());

        System.out.println("Search 30: " + list.search(30));

        System.out.println("Occurrences of 30: " + list.countOccurrences(30));

        System.out.print("Reverse Print: ");

        list.printReverse(list.head);

        System.out.println();

        System.out.println("Detect Loop: " + list.detectLoop());

        System.out.println("Nth Node From End: " + list.nthNodeFromEnd(2));

        System.out.println("Palindrome: " + list.palindrome());

        list.reverse();

        System.out.println("Reversed List:");

        list.display();

        System.out.println("Size: " + list.size());

        System.out.println("Is Empty: " + list.isEmpty());

        list.clear();

        System.out.println("After Clear:");

        list.display();
    }
}