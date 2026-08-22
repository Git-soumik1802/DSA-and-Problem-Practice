package dsajspider;

public class QueueLL {

    private class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    private Node front;
    private Node rear;
    private int size;

    // Add element to queue
    public void add(int data) {
        Node newNode = new Node(data);

        if (rear == null) {
            front = rear = newNode;
        } else {
            rear.next = newNode;
            rear = newNode;
        }
        size++;
    }

    // Remove element from queue
    public int poll() {
        if (isEmpty()) {
            System.out.println("Queue is Empty");
            return -1;
        }

        int removed = front.data;
        front = front.next;

        if (front == null) {
            rear = null;
        }

        size--;
        return removed;
    }

    // Get front element
    public int peek() {
        if (isEmpty()) {
            System.out.println("Queue is Empty");
            return -1;
        }

        return front.data;
    }

    // Check if queue is empty
    public boolean isEmpty() {
        return size == 0;
    }

    // Return size of queue
    public int size() {
        return size;
    }

    // Display queue
    public void display() {
        if (isEmpty()) {
            System.out.println("Queue is Empty");
            return;
        }

        Node temp = front;

        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }

        System.out.println();
    }

    public static void main(String[] args) {

        QueueLL q = new QueueLL();

        q.add(10);
        q.add(20);
        q.add(30);
        q.add(40);

        System.out.println("Queue:");
        q.display();

        System.out.println("Peek: " + q.peek());

        System.out.println("Poll: " + q.poll());

        System.out.println("After Poll:");
        q.display();

        System.out.println("Size: " + q.size());

        System.out.println("Is Empty: " + q.isEmpty());
    }
}