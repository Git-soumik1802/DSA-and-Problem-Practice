package dsajspider;

import java.util.ArrayList;

public class queueUsingAl {

    private ArrayList<Integer> list = new ArrayList<>();

    // Add element
    public void enqueue(int data) {
        list.add(data);
    }

    // Remove element
    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is Empty");
            return -1;
        }
        return list.remove(0);
    }

    // Get front element
    public int peek() {
        if (isEmpty()) {
            System.out.println("Queue is Empty");
            return -1;
        }
        return list.get(0);
    }

    // Check queue is empty or not
    public boolean isEmpty() {
        return list.isEmpty();
    }

    // Return size of queue
    public int size() {
        return list.size();
    }

    // Display queue
    public void display() {
        if (isEmpty()) {
            System.out.println("Queue is Empty");
            return;
        }

        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
        System.out.println();
    }

    // Remove all elements
    public void clear() {
        list.clear();
    }

    public static void main(String[] args) {

        queueUsingAl q = new queueUsingAl();

        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        q.enqueue(40);

        System.out.println("Queue Elements:");
        q.display();

        System.out.println("Front Element: " + q.peek());

        System.out.println("Removed Element: " + q.dequeue());

        System.out.println("Queue After Dequeue:");
        q.display();

        System.out.println("Size: " + q.size());

        System.out.println("Is Empty: " + q.isEmpty());

        q.clear();

        System.out.println("After Clear:");
        q.display();
    }
}