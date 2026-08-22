package PracticeSet;
import java.util.Arrays;
public class Arraylist {
	private  int a[]=new int [10];
	private  int size=0;
	
	
	public void add(int ele) {
		if(a.length==size) {
			grow();
		}
		a[size]=ele;
		size++;
	}
	private void grow() {
		int regrow[]=new int[a.length*2];
		for(int i=0;i<a.length;i++) {
			regrow[i]=a[i];
		}
		a=regrow;
		
	}
	public int get(int idx) {
		if(idx>=size || idx<0)throw new IndexOutOfBoundsException();
		return a[idx];
		
	}
	public void remove() {
		if(size==0)return;
		size--;
	}
	public int size() {
		return size;
	}
	public void display() {
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]);
		}
		System.out.println();
	}
	
	public static void main(String[] args) {

		Arraylist l = new Arraylist();

        l.add(10);
        l.add(20);
        l.add(30);
        l.add(40);
        l.add(50);
        l.add(60);

        l.display();

        System.out.println("Element at index 2: " + l.get(2));

        l.remove();

        l.display();

        System.out.println("Size: " + l.size());
	}

}
