package ImplementationOfCFW;

public class Deque {

    int[] arr;
    int front;
    int rear;
    int size;
    int capacity;

    // Constructor
    Deque(int capacity) {
        this.capacity = capacity;
        arr = new int[capacity];

        front = -1;
        rear = -1;
        size = 0;
    }

    // Check Empty
    boolean isEmpty() {
        return size == 0;
    }

    // Check Full
    boolean isFull() {
        return size == capacity;
    }

    // Insert at Front
    void insertFront(int data) {

        if (isFull()) {
            System.out.println("Deque is Full");
            return;
        }

        if (isEmpty()) {
            front = 0;
            rear = 0;
        } else {
            front = (front - 1 + capacity) % capacity;
        }

        arr[front] = data;
        size++;
    }

    // Insert at Rear
    void insertRear(int data) {

        if (isFull()) {
            System.out.println("Deque is Full");
            return;
        }

        if (isEmpty()) {
            front = 0;
            rear = 0;
        } else {
            rear = (rear + 1) % capacity;
        }

        arr[rear] = data;
        size++;
    }

    // Delete from Front
    int deleteFront() {

        if (isEmpty()) {
            System.out.println("Deque is Empty");
            return -1;
        }

        int data = arr[front];

        if (front == rear) {
            front = -1;
            rear = -1;
        } else {
            front = (front + 1) % capacity;
        }

        size--;

        return data;
    }

    // Delete from Rear
    int deleteRear() {

        if (isEmpty()) {
            System.out.println("Deque is Empty");
            return -1;
        }

        int data = arr[rear];

        if (front == rear) {
            front = -1;
            rear = -1;
        } else {
            rear = (rear - 1 + capacity) % capacity;
        }

        size--;

        return data;
    }

    // Display
    void display() {

        if (isEmpty()) {
            System.out.println("Deque is Empty");
            return;
        }

        int i = front;

        System.out.print("Deque: ");

        for (int count = 0; count < size; count++) {
            System.out.print(arr[i] + " ");
            i = (i + 1) % capacity;
        }

        System.out.println();
    }

    public static void main(String[] args) {

        Deque dq = new Deque(5);

        // Insert from rear
        dq.insertRear(10);
        dq.insertRear(20);
        dq.insertRear(30);

        dq.display();

        // Insert from front
        dq.insertFront(5);
        dq.insertFront(1);

        dq.display();

        // Delete from front
        System.out.println("Deleted Front: " + dq.deleteFront());

        dq.display();

        // Delete from rear
        System.out.println("Deleted Rear: " + dq.deleteRear());

        dq.display();
    }
}