package RaveeshMock;

public class Queue1 {
	private ArrayList l=new ArrayList();
	void enqueue(Object ele) {
		l.add(ele);
	}
	Object dequeue() {
		if(isEmpty()) {
			return "queue is empty";
		}
		return l.remove(0);
	}
	Object peek() {
		if(isEmpty()) {
			return "queue is empty";
		}
		return l.get(0);
	}
	 boolean isEmpty() {
		// TODO Auto-generated method stub
		return l.size()==0;
	}
	 
	 int size() {
		return l.size();
	 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
