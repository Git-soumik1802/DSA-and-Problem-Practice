package practiceimplementation;


public class ArrayList {

   private Object arr[];
   private int size;
   
   

    // Constructor
    public ArrayList() {
    	arr=new Object[10];
    	size=0;
    }

    // Add element
    public void add(Object ele) {
          if(size==arr.length) {
        	  grow();
          }
          arr[size]=ele;
          size++;
      
    }

    // Get element
    public Object get(int index) {
    	if(index<0||index>=size) {
    		throw new IndexOutOfBoundsException();
    	}
    	return arr[index];
       
    }

    // Update element
    public void set(int index, Object ele) {
    	if(index<0||index>=size) {
    		throw new IndexOutOfBoundsException();
    	}
    	arr[index]=ele;
       
    }

    // Remove element
    public Object remove(int index) {

    	if(index<0||index>=size) {
    		throw new IndexOutOfBoundsException();
    	}
    	
    	Object rem=arr[index];
    	for(int i=index;i<size-1;i++) {
    		arr[i]=arr[i+1];
    	}
    	arr[size-1]=null;
    	size--;
    	return rem;

       
    }

    // Return size
    public int size() {
return size;
       
    }

    // Check if empty
    public boolean isEmpty() {
    	return size==0;
        
    }

    // Search element
    public boolean contains(Object element) {
    	for(int i=0;i<size;i++) {
    		if (element == null && arr[i] == null) {
                return true;
            }

            if (element != null && element.equals(arr[i])) {
                return true;
            }
    	}
    	return false;
    	
       
    }

    // Increase capacity
    private void grow() {
    	int newcapcity=arr.length*2;
    	Object newArr[]=new Object[newcapcity];
    	for(int i=0;i<arr.length;i++) {
    		newArr[i]=arr[i];
    	}
    	arr=newArr;
      
    }

    // Display
    public void display() {
    	 System.out.print("[");
    	for(int i=0;i<size;i++) {
    		 System.out.print(arr[i]);

             if (i < size - 1) {
                 System.out.print(", ");
             }
    	}
    	  System.out.println("]");
    }

    // Main
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

        System.out.println(
            "Contains 40: " + list.contains(40)
        );
    }
}