package DSAConcepts;

public class Tester {
	public static void main(String[] args) {
		
	
    ArrayList list = new ArrayList();

    // Adding elements
    list.add(10);
    list.add(20);
    list.add(30);
    list.add(40);

    System.out.println("After adding elements:");
    list.display();

    // Size
    System.out.println("\n\nSize: " + list.size());

    // Get
    System.out.println("Element at index 2: " + list.get(2));

    // Set
    list.set(1, 25);
    System.out.println("\nAfter setting index 1 to 25:");
    list.display();

    // Contains
    System.out.println("\n\nContains 30: " + list.contains(30));
    System.out.println("Contains 50: " + list.contains(50));

    // Remove
    System.out.println("\nRemoved element: " + list.remove(2));
    System.out.println("After removal:");
    list.display();

    // isEmpty
    System.out.println("\n\nIs Empty: " + list.isEmpty());

    // Clear
    list.clear();
    System.out.println("\nAfter clear:");
    list.display();

    System.out.println("\nSize: " + list.size());
    System.out.println("Is Empty: " + list.isEmpty());
}
}
