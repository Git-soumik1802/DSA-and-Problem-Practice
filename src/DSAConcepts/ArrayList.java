package DSAConcepts;

public class ArrayList {
	
private Object[]arr;
private  int size;
public ArrayList() {
	arr=new Object[10];
	size=0;
}
// add element
public void add(Object ele) {
	if(size==arr.length) {
		grow();
	}
	arr[size++]=ele;
}
private void grow() {
	Object[]temp=new Object[arr.length*2];
	for(int i=0;i<arr.length;i++) {
		temp[i]=arr[i];
	}
	arr=temp;
	
}
public Object get(int index) {
	if (index<0 || index>=size) {
		throw new IndexOutOfBoundsException();
	}
	return arr[index];
}
public void set(int index,Object ele ) {
	if (index<0 || index>=size) {
		throw new IndexOutOfBoundsException();
	}
	arr[index]=ele;
}

public Object remove (int index) {
	if(index<0 || index>=size) {
		throw new IndexOutOfBoundsException();
	}
	Object removed=arr[index];
	for(int i=index;i<size-1;i++) {
		arr[i]=arr[i+1];
	}
	arr[--size]=null;
	return removed;
}
public boolean contains(Object ele) {
	 for (int i = 0; i < size; i++) {
	        if (ele == null) {
	            if (arr[i] == null) {
	                return true;
	            }
	        } else if (ele.equals(arr[i])) {
	            return true;
	        }
	    }
	    return false;
}
public int size() {
	return size;
}
public boolean isEmpty() {
	
	    return size == 0;
}
public void clear() {
	for(int i=0;i<size;i++) {
		arr[i]=null;
	}
	size=0;
}
public void display() {
	System.out.print("[ ");
	for(int i=0;i<size;i++) {
		System.out.print(arr[i]);
		if(i<size-1) {
			System.out.print(", ");
		}
	}
	System.out.print(" ]");
}

}
