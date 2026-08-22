class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
    }
}

private Node top;
private int size;

// Push
public void push(int data) {
    Node newNode = new Node(data);
    newNode.next = top;
    top = newNode;
    size++;
}

// Pop
public int pop() {
    if (isEmpty()) {
        System.out.println("Stack Underflow");
        return -1;
    }

    int value = top.data;
    top = top.next;
    size--;
    return value;
}

// Peek
public int peek() {
    if (isEmpty()) {
        System.out.println("Stack is Empty");
        return -1;
    }

    return top.data;
}

// Check if stack is empty
public boolean isEmpty() {
    return top == null;
}

// Return size of stack
public int size() {
    return size;
}

// Display stack from top to bottom
public void display() {
    if (isEmpty()) {
        System.out.println("Stack is Empty");
        return;
    }

    Node temp = top;
    while (temp != null) {
        System.out.print(temp.data + " ");
        temp = temp.next;
    }
    System.out.println();
}
}