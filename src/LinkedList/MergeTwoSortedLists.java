package LinkedList;

public class MergeTwoSortedLists {

    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {

        ListNode dummy = new ListNode(0);
        ListNode temp = dummy;

        while (list1 != null && list2 != null) {

            if (list1.val <= list2.val) {

                temp.next = list1;
                list1 = list1.next;

            } else {

                temp.next = list2;
                list2 = list2.next;
            }

            temp = temp.next;
        }

        // Add remaining nodes
        if (list1 != null) {
            temp.next = list1;
        } else {
            temp.next = list2;
        }

        return dummy.next;
    }

    public static void main(String[] args) {

        // First sorted list
        ListNode list1 = new ListNode(1);
        list1.next = new ListNode(2);
        list1.next.next = new ListNode(4);

        // Second sorted list
        ListNode list2 = new ListNode(1);
        list2.next = new ListNode(3);
        list2.next.next = new ListNode(4);

        // Merge
        ListNode result = mergeTwoLists(list1, list2);

        // Print result
        while (result != null) {
            System.out.print(result.val + " ");
            result = result.next;
        }
    }
}