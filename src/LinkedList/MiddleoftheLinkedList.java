package LinkedList;
import java.util.*;
public class MiddleoftheLinkedList {
	
	    public static ListNode middleNode(ListNode head) {
	    	
	        ListNode slow=head;
	        ListNode fast=head;
	        while(fast!=null && fast.next!=null) {
	        	slow=slow.next;
	        	fast=fast.next.next;
	        }
	        head=slow;
	        while(slow.next!=null) {
	        	slow=slow.next;
	        }
	        return head;
	        
	    }
	
	    public static void main(String[] args) {

	        ListNode head = new ListNode(1);
	        head.next = new ListNode(2);
	        head.next.next = new ListNode(3);
	        head.next.next.next = new ListNode(4);
	        head.next.next.next.next = new ListNode(5);

	        ListNode result = middleNode(head);

	        System.out.println(result.val);
	    }

}
