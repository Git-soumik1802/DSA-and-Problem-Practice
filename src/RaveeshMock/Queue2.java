package RaveeshMock;

public class Queue2 {
	private Stack s1=new Stack();
	private Stack s2=new Stack();
	void enqueue(Object ele) {
		
			s1.push(ele);
		
	}
	Object dequeue() {
		if(s1.isEmpty())return "Queue is Empty";
		while(!s1.isEmpty()) {
			s2.push(s1.pop());
		}
		Object ele=s2.pop();
		while(!s2.isEmpty()) {
			s1.push(s2.pop());
		}
		return ele;
	}
	Object peek() {
		if(s1.isEmpty())return "Queue is Empty";
		while(!s1.isEmpty()) {
			s2.push(s1.pop());
		}
		Object ele=s2.peek();
		while(!s2.isEmpty()) {
			s1.push(s2.pop());
		}
		return ele;
	}
	boolean isEmpty() {
		return s1.size()==0;
	}
	int size() {
		return s1.size();
	}
	public static void main(String[] args) {
		

	}

}
