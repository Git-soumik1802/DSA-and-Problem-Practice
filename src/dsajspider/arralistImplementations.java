package dsajspider;

public class arralistImplementations {

    private int[] arr;
    private int size;

    public arralistImplementations() {
        arr = new int[5];
        size = 0;
    }

    // Add element
    public void add(int data) {
        if (size == arr.length) {
            grow();
        }
        arr[size++] = data;
    }

    // Increase array size
    private void grow() {
        int[] temp = new int[arr.length * 2];

        for (int i = 0; i < arr.length; i++) {
            temp[i] = arr[i];
        }

        arr = temp;
    }

    // Get element
    public int get(int index) {
        if (index < 0 || index >= size) {
            System.out.println("Invalid Index");
            return -1;
        }
        return arr[index];
    }

    // Update element
    public void set(int index, int data) {
        if (index < 0 || index >= size) {
            System.out.println("Invalid Index");
            return;
        }
        arr[index] = data;
    }

    // Remove element
    public int remove(int index) {
        if (index < 0 || index >= size) {
            System.out.println("Invalid Index");
            return -1;
        }

        int removed = arr[index];

        for (int i = index; i < size - 1; i++) {
            arr[i] = arr[i + 1];
        }

        size--;
        return removed;
    }

    // Size of ArrayList
    public int size() {
        return size;
    }

    // Check Empty
    public boolean isEmpty() {
        return size == 0;
    }

    // Display elements
    public void display() {
        if (isEmpty()) {
            System.out.println("ArrayList is Empty");
            return;
        }

        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    // Clear ArrayList
    public void clear() {
        size = 0;
    }

    public static void main(String[] args) {

        arralistImplementations list = new arralistImplementations();

        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        list.add(60);

        System.out.print("Elements: ");
        list.display();

        System.out.println("Element at index 2: " + list.get(2));

        list.set(1, 25);

        System.out.print("After Update: ");
        list.display();

        System.out.println("Removed Element: " + list.remove(3));

        System.out.print("After Remove: ");
        list.display();

        System.out.println("Size: " + list.size());

        System.out.println("Is Empty: " + list.isEmpty());

        list.clear();

        System.out.println("After Clear:");
        list.display();
    }
}