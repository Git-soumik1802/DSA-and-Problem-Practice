package ImplementationOfCFW;

public class ArrayList {
	private Object arr[];
	private int size;

	public ArrayList() {
		arr = new Object[10];
		size = 0;
	}

	public void add(Object ele) {
		if (size == arr.length) {
			grow();
		}
		arr[size] = ele;
		size++;
	}

	public Object get(int index) {
		if (index < 0 || index >= arr.length) {
			throw new IndexOutOfBoundsException();
		}
		return arr[index];
	}

	public void set(int index, Object ele) {
		if (index < 0 || index >= arr.length) {
			throw new IndexOutOfBoundsException();
		}
		arr[index] = ele;
	}

	public Object remove(int index) {
		if (index < 0 || index >= arr.length) {
			throw new IndexOutOfBoundsException();
		}
		Object remEle = arr[index];
		for (int i = index; i < size - 1; i++) {
			arr[i] = arr[i + 1];
		}
		arr[size - 1] = null;
		size--;
		return remEle;
	}

	public int size() {
		return size;
	}

	// Check if empty
	public boolean isEmpty() {
		return size == 0;
	}

	// Search element
	public boolean contains(Object element) {
		for (int i = 0; i < size; i++) {
			if (arr[i].equals(element)) {
				return true;
			}
		}
		return false;
	}

	private void grow() {
		int newCap = arr.length * 2;
		Object[] newArr = new Object[newCap];
		for (int i = 0; i < arr.length; i++) {
			newArr[i] = arr[i];
		}
		arr = newArr;
	}

	public void display() {

		System.out.print("[");

		for (int i = 0; i < size; i++) {

			System.out.print(arr[i]);

			if (i < size - 1) {
				System.out.print(", ");
			}
		}

		System.out.println("]");
	}

	public static void main(String[] args) {
		ArrayList list = new ArrayList();

		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);

		list.display();

		System.out.println("Element: " + list.get(1));

		list.set(1, 100);

		list.display();

		list.remove(2);

		list.display();

		System.out.println("Size: " + list.size());

		System.out.println("Contains 40: " + list.contains(40));
	}

}
