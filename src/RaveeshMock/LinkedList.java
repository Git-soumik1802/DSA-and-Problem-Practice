package RaveeshMock;

class Node{
	Object data;
	Node next;
	Node(Object data){
		this.data=data;
	
	}
}
public class LinkedList {
	private Node head;
	private int size;
	public void add(Object data) {
		Node newNode=new Node(data);
		if(head==null) {
			head=newNode;
		}
		else {
			Node temp=head;
			while(temp.next!=null) {
				temp=temp.next;
			}
			temp.next=newNode;
		}
		size++;
	}
	public void addFirst(Object data) {
		Node newNode=new Node (data);
		newNode.next=head;
		head=newNode;
		size++;
	}
	public Object removeFirst()  {
		if(isEmpty()) {
		return null;
		}
		Object data=head.data;
		head=head.next;
		size--;
		return data;
	}
	public Object removeLast()  {
		if(isEmpty()) {
		return null;
		}
		if(head.next==null) {
			Object data=head.data;
			head=null;
			size--;
			return data;
		}
		
		Node temp=head;
		while(temp.next.next!=null) {
			temp=temp.next;
		}
		Object data=temp.next.data;
		temp.next=null;
		size--;
		return data;
	}
	public boolean isEmpty() {
		return size==0;
	}
	public Object get(int idx) {
		if(idx<0||idx>=size) {
			throw new IndexOutOfBoundsException();
		}
		Node temp=head;
		for(int i=0;i<idx;i++) {
			temp=temp.next;
		}
		return temp.data;
	}
	public boolean contains(Object ele) {
		Node temp=head;
		while(temp!=null) {
			if(temp.data.equals(ele)) {
				return true;
			}
			temp=temp.next;
		}
		return false;
	}
	public static void main(String[] args) {
		LinkedList list = new LinkedList();

	    // Add elements
	    list.add(10);
	    list.add(20);
	    list.add(30);
	    list.add(40);

	    System.out.println("Elements after add():");
	    for (int i = 0; i < list.size; i++) {
	        System.out.print(list.get(i) + " ");
	    }
	    System.out.println();

	    // Add first
	    list.addFirst(5);

	    System.out.println("\nAfter addFirst(5):");
	    for (int i = 0; i < list.size; i++) {
	        System.out.print(list.get(i) + " ");
	    }
	    System.out.println();

	    // Get element
	    System.out.println("\nElement at index 2: " + list.get(2));

	    // Contains
	    System.out.println("Contains 30? " + list.contains(30));
	    System.out.println("Contains 100? " + list.contains(100));

	    // Remove first
	    System.out.println("\nRemoved First: " + list.removeFirst());

	    System.out.println("List after removeFirst():");
	    for (int i = 0; i < list.size; i++) {
	        System.out.print(list.get(i) + " ");
	    }
	    System.out.println();

	    // Remove last
	    System.out.println("\nRemoved Last: " + list.removeLast());

	    System.out.println("List after removeLast():");
	    for (int i = 0; i < list.size; i++) {
	        System.out.print(list.get(i) + " ");
	    }
	    System.out.println();

	    // Check empty
	    System.out.println("\nIs Empty? " + list.isEmpty());

	}

}
