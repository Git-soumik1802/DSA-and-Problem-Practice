package ImplementationOfCFW;
import java.util.ArrayList;
public class Stack {
	ArrayList<Object>al=new ArrayList<>();
	public void push(Object data) {
		al.add(data);
	}
	public Object pop() {
		if(al.isEmpty()) {
			System.out.println("stack is empty");
		}
		return al.remove(al.size()-1);
	}
	public Object peek() {
		if(al.isEmpty()) {
			System.out.println("stack is empty");
		}
		return al.get(al.size()-1);
	}
	public void display() {
		System.out.println(al);
	}
public static void main(String[] args) {
	 Stack s = new Stack();

     s.push(10);
     s.push(20);
     s.push(30);

     s.display();

     System.out.println("Pop: " + s.pop());

     s.display();

     System.out.println("Top: " + s.peek());
}
}
