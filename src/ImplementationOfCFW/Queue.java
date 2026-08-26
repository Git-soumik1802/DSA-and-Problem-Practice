package ImplementationOfCFW;

import java.util.ArrayList;

public class Queue {

	ArrayList<Object> al = new ArrayList<>();

	public void enqueue(Object data) {
		al.add(data);
	}

	public Object dequeue() {
		if (al.isEmpty()) {
			System.out.println("queue is empty");

		}
		return al.remove(0);

	}

	public Object peek() {
		if (al.isEmpty()) {
			System.out.println("queue is empty");

		}
		return al.get(0);

	}

	public void display() {
		System.out.println(al);
	}

	public static void main(String[] args) {

		Queue q = new Queue();

		q.enqueue(10);
		q.enqueue(20);
		q.enqueue(30);

		q.display();

		System.out.println("Removed: " + q.dequeue());

		q.display();

		System.out.println("Front: " + q.peek());
	}
}
