 package dsajspider;

public class doubleLL {

    class Node {
        int data;
        Node prev;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    Node head;
    Node tail;
    int count = 0;

    public void add(int data) {

        Node newNode = new Node(data);

//        
        if (head == null) {
            head = newNode;
            tail = newNode;
            count++;
            return;
        }

        Node curr = head;

        while (curr.next != null) {
            curr = curr.next;
        }

        curr.next = newNode;
        newNode.prev = curr;
        tail = newNode;

        count++;
    }

    public void addFirst(int data) {

        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            tail = newNode;
            count++;
            return;
        }

        newNode.next = head;
        head.prev = newNode;
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

        if (index == count) {
            add(data);
            return;
        }

        Node newNode = new Node(data);
        Node curr = head;

        for (int i = 0; i < index - 1; i++) {
            curr = curr.next;
        }

        newNode.next = curr.next;
        newNode.prev = curr;

        curr.next.prev = newNode;
        curr.next = newNode;

        count++;
    }

    public void displayForward() {

        Node curr = head;

        while (curr != null) {
            System.out.print(curr.data + " <-> ");
            curr = curr.next;
        }

        System.out.println("null");
    }

    public void displayBackward() {

        Node curr = tail;

        while (curr != null) {
            System.out.print(curr.data + " <-> ");
            curr = curr.prev;
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

        if (tail == null) {
            throw new RuntimeException("List is Empty");
        }

        return tail.data;
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

    public void removeFirst() {

        if (head == null) {
            throw new RuntimeException("List is Empty");
        }

        if (head == tail) {
            head = null;
            tail = null;
            count--;
            return;
        }

        head = head.next;
        head.prev = null;

        count--;
    }

    public void removeLast() {

        if (tail == null) {
            throw new RuntimeException("List is Empty");
        }

        if (head == tail) {
            head = null;
            tail = null;
            count--;
            return;
        }

        tail = tail.prev;
        tail.next = null;

        count--;
    }

    public void remove(int value) {
    	
        if (head == null) {
            throw new RuntimeException("List is Empty");
        }

        if (head.data == value) {
            removeFirst();
            return;
        }

        if (tail.data == value) {
            removeLast();
            return;
        }

        Node curr = head.next;

        while (curr != null && curr.data != value) {
            curr = curr.next;
        }

        if (curr == null) {
            throw new RuntimeException("Element Not Found");
        }

        curr.prev.next = curr.next;
        curr.next.prev = curr.prev;

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

        if (index == count - 1) {
            removeLast();
            return;
        }

        Node curr = head;

        for (int i = 0; i < index; i++) {
            curr = curr.next;
        }

        curr.prev.next = curr.next;
        curr.next.prev = curr.prev;

        count--;
    }

    public void reverse() {

        Node curr = head;
        Node temp = null;

        while (curr != null) {

            temp = curr.prev;
            curr.prev = curr.next;
            curr.next = temp;

            curr = curr.prev;
        }

        temp = head;
        head = tail;
        tail = temp;
    }

    public int size() {
        return count;
    }

    public boolean isEmpty() {
        return count == 0;
    }

    public void clear() {
        head = null;
        tail = null;
        count = 0;
    }

    public static void main(String[] args) {

        doubleLL list = new doubleLL();

        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);

        list.displayForward();

        list.addFirst(5);

        list.displayForward();

        list.addAtIndex(2, 15);

        list.displayForward();

        System.out.println("First: " + list.getFirst());

        System.out.println("Last: " + list.getLast());

        System.out.println("Get Index 3: " + list.get(3));

        System.out.println("Contains 20: " + list.contains(20));

        list.removeFirst();

        list.displayForward();

        list.removeLast();

        list.displayForward();

        list.remove(20);

        list.displayForward();

        list.removeAtIndex(1);

        list.displayForward();

        System.out.println("Backward Traversal:");

        list.displayBackward();

        list.reverse();

        System.out.println("Reversed:");

        list.displayForward();

        System.out.println("Size: " + list.size());

        System.out.println("Is Empty: " + list.isEmpty());

        list.clear();

        System.out.println("After Clear:");

        list.displayForward();
    }
}
//isEmpty(),.contains(),addFirst(),addLast();