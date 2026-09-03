package practiceimplementation;

public class LinkedList {
	static class Node{
		Object data;
		Node next;
		Node(Object data){
			this.data=data;
			this.next=null;
		}
	}
	Node head;
	int size=0;
	void addFirst(Object data) {
		Node newNode=new Node(data);
		newNode.next=head;
		head=newNode;
		size++;
	}
	void addLast(Object data) {
		Node newNode=new Node(data);
		  if (head == null) {

	            head = newNode;
	            size++;

	            return;
	        }
		Node temp=head;
		while(temp.next!=null) {
			temp=temp.next;
		}
		temp.next=newNode;
		size++;
	}
	void add(int i,Object data) {
		if(i<0||i>size) {
			throw new IndexOutOfBoundsException();
		}
		if(i==1) {
			addFirst(data);
			return ;
		}
		if(i==size+1) {
			addLast(data);
			return ;
		}
		Node newNode= new Node(data);
		 Node temp=head;
		 for(int idx=0;idx<i-1;idx++) {
			 temp=temp.next;
		 }
		 newNode.next=temp.next;
		 temp.next=newNode;
		 size++;
	}
	void deleteFirst() {
		if(head==null) {
			System.out.println("Invalid LinkedList");
						return;
		}
		head=head.next;
		size--;
	}
	void deleteLast() {
		if(head==null) {
			System.out.println("Invalid LinkedList");
			return ;
		}
		if(head.next==null) {
			head=null;
			size--;
			return ;
		}
		Node temp=head;
		while(temp.next.next!=null) {
			temp=temp.next;
		}
		temp.next=null;
		size--;
	}
	void delete (int pos) {
		if(head==null) {
			System.out.println("Invalid LinkedList");
			return ;
		}
		if(pos<1 || pos>size) {
			System.out.println("Invalid LinkedList");
			return ;
		}
		if(pos==1) {
			deleteFirst();
			return ;
		}
		if(pos==size) {
			deleteLast();
			return ;
		}
		Node temp=head;
		for(int i=0;i<pos-1;i++) {
			temp=temp.next;
		}
		temp.next=temp.next.next;
		size--;
	}
	Object get(int idx) {
		if(head==null) {
			System.out.println("Invalid LinkedList");
			return -1 ;
		}
		if(idx<1 || idx>size) {
			System.out.println("Invalid LinkedList");
			return -1;
		}
		Node temp=head;
		for(int i=1;i<idx;i++) {
			temp=temp.next;
		}
		return temp.data;
	}
	boolean contains(Object data) {
		Node temp=head;
		while(temp!=null) {
			if(temp.data.equals(data)) {
				return true;
			}
			temp=temp.next;
		}
		return false;
	}
	int size() {
		return size;
	}
	boolean isEmpty() {
		return size==0;
	}
	
	void display() {

       Node temp=head;
       while(temp.next!=null) {
    	   System.out.println(temp.data+"->");
    	   temp=temp.next;
    	   
       }
        System.out.println("null");
    }

    // Main
    public static void main(String[] args) {

        LinkedList list = new LinkedList();

        // Add
        list.addFirst(20);
        list.addFirst(10);
        list.addLast(40);
        list.addLast(50);

        System.out.print("LinkedList: ");
        list.display();

        // Add at position
        list.add(3, 30);

        System.out.print("After add(3, 30): ");
        list.display();

        // Get
        System.out.println("Element at position 3: " + list.get(3));

        // Delete first
        list.deleteFirst();

        System.out.print("After deleteFirst(): ");
        list.display();

        // Delete last
        list.deleteLast();

        System.out.print("After deleteLast(): ");
        list.display();

        // Delete position
        list.delete(2);

        System.out.print("After delete(2): ");
        list.display();

        // Other methods
        System.out.println("Size: " + list.size());

        System.out.println("Contains 30: " + list.contains(30));

        System.out.println("Is Empty: " + list.isEmpty());

}
}