package RaveeshMock;

import java.util.Arrays;

public class ArrayList {
	private Object arr[];
	private int size;
	ArrayList() {
		arr=new Object[10];
		size=0;
	}
	public void add(Object ele) {
		if(size==arr.length) {
			grow();
		}
		arr[size++]=ele;
		
	}
	private void grow() {
		arr=Arrays.copyOf(arr, arr.length*2);
		
	}
	public void add(int idx,Object ele) {
		if(idx<0||idx>size) {
			throw new IndexOutOfBoundsException();
		}
		if(size==arr.length) {
			grow();
		}
		for(int i=size;i>idx;i--) {
			arr[i]=arr[i-1];
		}
		arr[idx]=ele;
		size++;
	}
	public Object get(int idx) {
		if(idx<0||idx>=size) {
			throw new IndexOutOfBoundsException();
		}
		return arr[idx];
	}
	public void set(int idx,Object ele) {
		if(idx<0||idx>=size) {
			throw new IndexOutOfBoundsException();
		}
		arr[idx]=ele;
	}
	public Object remove(int idx) {
		if(idx<0||idx>=size) {
			throw new IndexOutOfBoundsException();
		}
		Object removed=arr[idx];
		for(int i=idx;i<size-1;i++) {
			arr[i]=arr[i+1];
		}
		arr[--size]=null;
		return removed;
	}
	public int size() {
		return size;
	}
	public boolean contains(Object ele) {
		
		for(int i=0;i<size;i++) {
			if(arr[i]==null) {
				if( ele==null) {
				return true;
				
			}}
			else if(arr[i].equals(ele)) {
				return true;
			}
		}
		return false;
	}
	public void display() {
		for(int i=0;i<size;i++) {
			System.out.print(arr[i]+" ");
		}
	}
	public static void main(String[] args) {
		 ArrayList list = new ArrayList();

	        list.add(10);
	        list.add(20);
	        list.add(30);

	        list.display();

	        list.add(1, 15);
	        list.display();

	        System.out.println("Element at index 2: " + list.get(2));

	        list.set(2, 25);
	        list.display();

	        System.out.println("Removed: " + list.remove(1));
	        list.display();

	        System.out.println("Contains 25? " + list.contains(25));

	        System.out.println("Size = " + list.size());

	}

}
