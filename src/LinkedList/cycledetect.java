package LinkedList;

public class cycledetect {
	public boolean detectCycle(ListNode head) {
		if(head==null ||head.next==null) {
			return false;
		
		}
		ListNode turt=head;
		ListNode hare=head;
		while(hare!=null && hare.next!=null ) {
			hare=hare.next.next;
			turt=turt.next;
			if(turt==hare) {
				return true;
			}
		}
		return false;
	}
	public static void main(String[] args) {

	    // Create nodes
	    ListNode head = new ListNode(1);
	    ListNode second = new ListNode(2);
	    ListNode third = new ListNode(3);
	    ListNode fourth = new ListNode(4);
	    ListNode fifth = new ListNode(5);

	    // Connect nodes
	    head.next = second;
	    second.next = third;
	    third.next = fourth;
	    fourth.next = fifth;

	    // Create a cycle: 5 -> 3
	    fifth.next = third;

	    cycledetect obj = new cycledetect();

	    if (obj.detectCycle(head)) {
	        System.out.println("Cycle Detected");
	    } else {
	        System.out.println("No Cycle");
	    }
	}

}
