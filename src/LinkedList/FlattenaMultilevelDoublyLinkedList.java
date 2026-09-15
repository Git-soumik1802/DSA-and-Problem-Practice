package LinkedList;

public class FlattenaMultilevelDoublyLinkedList {

    // Make Node STATIC
    static class Node {
        int val;
        Node prev;
        Node next;
        Node child;

        Node(int val) {
            this.val = val;
        }
    }

    public Node flatten(Node head) {

        if (head == null) {
            return null;
        }

        flattenList(head);

        return head;
    }

    private Node flattenList(Node head) {

        Node curr = head;
        Node last = head;

        while (curr != null) {

            Node next = curr.next;

            if (curr.child != null) {

                Node child = curr.child;

                Node childTail = flattenList(child);

                curr.next = child;
                child.prev = curr;

                curr.child = null;

                if (next != null) {
                    childTail.next = next;
                    next.prev = childTail;
                }

                last = childTail;

            } else {
                last = curr;
            }

            curr = next;
        }

        return last;
    }

    public static void main(String[] args) {

        Node n1 = new Node(1);
        Node n2 = new Node(2);
        Node n3 = new Node(3);
        Node n4 = new Node(4);
        Node n5 = new Node(5);
        Node n6 = new Node(6);

        Node n7 = new Node(7);
        Node n8 = new Node(8);
        Node n9 = new Node(9);
        Node n10 = new Node(10);

        Node n11 = new Node(11);
        Node n12 = new Node(12);

        // Level 1
        n1.next = n2;
        n2.prev = n1;

        n2.next = n3;
        n3.prev = n2;

        n3.next = n4;
        n4.prev = n3;

        n4.next = n5;
        n5.prev = n4;

        n5.next = n6;
        n6.prev = n5;

        // Level 2
        n7.next = n8;
        n8.prev = n7;

        n8.next = n9;
        n9.prev = n8;

        n9.next = n10;
        n10.prev = n9;

        // Level 3
        n11.next = n12;
        n12.prev = n11;

        // Child connections
        n3.child = n7;
        n8.child = n11;

        // Create object
        FlattenaMultilevelDoublyLinkedList obj =
                new FlattenaMultilevelDoublyLinkedList();

        Node head = obj.flatten(n1);

        // Print
        Node curr = head;

        while (curr != null) {
            System.out.print(curr.val + " ");
            curr = curr.next;
        }
    }
}