package dsajspider;

import java.util.ArrayList;

public class stackusingAl {

    private ArrayList<Integer> stack = new ArrayList<>();

    // Push operation
    public void push(int data) {
        stack.add(data);
    }

    // Pop operation
    public int pop() {
        if (stack.isEmpty()) {
            System.out.println("Stack Underflow");
            return -1;
        }
        return stack.remove(stack.size() - 1);
    }

    // Peek operation
    public int peek() {
        if (stack.isEmpty()) {
            System.out.println("Stack is Empty");
            return -1;
        }
        return stack.get(stack.size() - 1);
    }

    // Check if stack is empty
    public boolean isEmpty() {
        return stack.isEmpty();
    }

    // Size of stack
    public int size() {
        return stack.size();
    }

    // Display elements from top to bottom
    public void display() {
        if (stack.isEmpty()) {
            System.out.println("Stack is Empty");
            return;
        }

        System.out.println("Stack Elements:");
        for (int i = stack.size() - 1; i >= 0; i--) {
            System.out.print(stack.get(i) + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        stackusingAl s = new stackusingAl();

        s.push(10);
        s.push(20);
        s.push(30);
        s.push(40);

        s.display();

        System.out.println("Top Element: " + s.peek());
        System.out.println("Size: " + s.size());

        System.out.println("Popped: " + s.pop());

        s.display();
        System.out.println("Size after pop: " + s.size());
    }
}