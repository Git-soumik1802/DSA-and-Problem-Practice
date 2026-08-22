package LinkedList;

import java.util.List;

class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
    }
}

public class DeleteNthNodeFromLast {

    // Delete nth node from end
    public ListNode removeNthFromEnd(ListNode head, int n) {
    	if(head.next==null) {
    		return null;
    	}
    	int size=0;
    	ListNode curr=head;
    	while(curr!=null) {
    		curr=curr.next;
    		size++;
    	}
    	if(n==size) {
    		return head.next;
    	}
        int idx=size-n;
       ListNode prev=head;
       
        for (int i = 1; i < idx; i++) {
            prev = prev.next;
        }
        prev.next=prev.next.next;
        return head;
        
    }

    // Display Linked List
    public static void display(ListNode head) {
        ListNode curr = head;

        while (curr != null) {
            System.out.print(curr.val + " -> ");
            curr = curr.next;
        }

        System.out.println("null");
    }

    public static void main(String[] args) {

        // Creating Linked List
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        System.out.println("Original List:");
        display(head);

        DeleteNthNodeFromLast obj = new DeleteNthNodeFromLast();

        int n = 4;
        head = obj.removeNthFromEnd(head, n);

        System.out.println("After Deleting " + n + "th Node From End:");
        display(head);
    }
}