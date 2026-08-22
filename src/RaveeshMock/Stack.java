package RaveeshMock;
import java.util.*;
public class Stack {
	private ArrayList l=new ArrayList();
	
	void push(Object ele) {
		l.add(ele);
	}
	Object pop() {
		if(isEmpty()) {
			return "Stack Empty";
		}
		return l.remove(size()-1);
	}
	Object peek() {
		if(isEmpty()) {
			return "Stack Empty";
		}
		return l.get(size()-1);
	}
	
	 boolean isEmpty() {
		// TODO Auto-generated method stub
		return l.size()==0;
	}
	 int size() {
		
		return l.size();
	}
	public static void main(String[] args) {
		Stack s = new Stack();

        s.push(10);
        s.push(20);
        s.push(30);

        System.out.println("Peek: " + s.peek());

        System.out.println("Pop: " + s.pop());

        System.out.println("Peek: " + s.peek());

        System.out.println("Size: " + s.size());

        System.out.println("Is Empty: " + s.isEmpty());

	}

}
