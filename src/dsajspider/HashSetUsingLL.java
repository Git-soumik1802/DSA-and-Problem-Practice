package dsajspider;

class HashNode {
    int data;
    HashNode next;

    public HashNode(int data) {
        this.data = data;
        this.next = null;
    }
}

public class HashSetUsingLL {

    private HashNode[] buckets;
    private int size;

    public HashSetUsingLL() {
        buckets = new HashNode[10];
        size = 0;
    }

    private int hash(int data) {
        return Math.abs(data) % buckets.length;
    }

    // Add element
    public void add(int data) {
        int index = hash(data);

        HashNode temp = buckets[index];

        while (temp != null) {
            if (temp.data == data) {
                return; // Duplicate not allowed
            }
            temp = temp.next;
        }

        HashNode newNode = new HashNode(data);
        newNode.next = buckets[index];
        buckets[index] = newNode;
        size++;
    }

    // Remove element
    public void remove(int data) {
        int index = hash(data);

        HashNode curr = buckets[index];
        HashNode prev = null;

        while (curr != null) {
            if (curr.data == data) {
                if (prev == null) {
                    buckets[index] = curr.next;
                } else {
                    prev.next = curr.next;
                }
                size--;
                System.out.println(data + " removed");
                return;
            }

            prev = curr;
            curr = curr.next;
        }

        System.out.println(data + " not found");
    }

    // Check if element exists
    public boolean contains(int data) {
        int index = hash(data);

        HashNode temp = buckets[index];

        while (temp != null) {
            if (temp.data == data) {
                return true;
            }
            temp = temp.next;
        }

        return false;
    }

    // Size
    public int size() {
        return size;
    }

    // Is Empty
    public boolean isEmpty() {
        return size == 0;
    }

    // Clear
    public void clear() {
        buckets = new HashNode[10];
        size = 0;
    }

    // Display
    public void display() {
        if (isEmpty()) {
            System.out.println("HashSet is Empty");
            return;
        }

        for (int i = 0; i < buckets.length; i++) {
            HashNode temp = buckets[i];

            while (temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {

        HashSetUsingLL hs = new HashSetUsingLL();

        hs.add(10);
        hs.add(20);
        hs.add(30);
        hs.add(40);
        hs.add(20); // Duplicate ignored

        System.out.print("Elements: ");
        hs.display();

        System.out.println("Contains 20: " + hs.contains(20));
        System.out.println("Contains 50: " + hs.contains(50));

        hs.remove(20);

        System.out.print("After Remove: ");
        hs.display();

        System.out.println("Size: " + hs.size());
        System.out.println("Is Empty: " + hs.isEmpty());

        hs.clear();

        System.out.println("After Clear:");
        hs.display();
    }
}