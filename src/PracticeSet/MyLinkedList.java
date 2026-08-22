package PracticeSet;
class Node{
	int data;
	Node next;
}
public class MyLinkedList {
	
	
	
	
	Node head;
	 
	public void insert(int data) {
		Node node=new Node();
		node.data=data;
		node.next=null;
		if(head==null) {
			head=node;
		}
		else {
			Node n=head;
			while(n.next!=null) {
				n=n.next;
				
			}
			n.next=node;
		}
		
	}
	public void show() {
		Node node=head;
		while(node!=null) {
			System.out.println(node.data);
			node=node.next;
		}
	}
	
	
	
	
	public static void main(String[] args) {

	    MyLinkedList l = new MyLinkedList();

	    l.insert(10);
	    l.insert(20);
	    l.insert(30);
	    l.insert(40);

	    l.show();
	}

}
