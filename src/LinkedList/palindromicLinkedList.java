package LinkedList;

import java.util.LinkedList;
import java.util.List;

public class palindromicLinkedList {
	public boolean isPalindrome(ListNode head) {
		if(head==null ||head.next==null) {
			return true;
		}
		ListNode middle=findMiddle(head);
		ListNode secHalfstart=reverse(middle.next);
		ListNode firstHalfhead=head;
		while(secHalfstart!=null) {
			if(firstHalfhead.val!=secHalfstart.val) {
				return false;
			}
			firstHalfhead=firstHalfhead.next;
			secHalfstart=secHalfstart.next;
		}
		return true;
		
	}
	private ListNode reverse(ListNode head) {
		ListNode prev=null;
		ListNode curr=head;
		while(curr!=null) {
			ListNode next=curr.next;
			curr.next=prev;
			prev=curr;
			curr=next;
		}
		return prev;
	}
	private ListNode findMiddle(ListNode head) {
		ListNode hare=head;
		ListNode turt=head;
		while(hare.next!=null && hare.next.next!=null) {
			hare=hare.next.next;
			turt=turt.next;
		}
		return turt;
	}
	public static void main(String[] args) {
		 ListNode head = new ListNode(1);
		    head.next = new ListNode(2);
		    head.next.next = new ListNode(1);
		    head.next.next.next = new ListNode(1);
		    head.next.next.next.next = new ListNode(1);

		    palindromicLinkedList obj = new palindromicLinkedList();

		    if (obj.isPalindrome(head)) {
		        System.out.println("Palindrome");
		    } else {
		        System.out.println("Not Palindrome");
		    }

	}

}
