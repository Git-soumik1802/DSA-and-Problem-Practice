package practiceimplementation;

public class stack {

    ArrayList al = new ArrayList();

   public void push(Object data) {
	   al.add(data);
   }
   public Object pop() {
	   if(al.isEmpty()) {
		   System.out.println("stack is empty");
		   return null;
	   }
	   return al.remove(al.size()-1);
   }
   public Object peek() {
	   if(al.isEmpty()) {
		   System.out.println("stack is empty");
		   return null;
	   }
	   return al.get(al.size()-1);
   }
   public int size() {
	   return al.size();
   }
   public boolean isEmpty() {
	   return al.size()==0;
   }
   public boolean contains(Object data) {
	  return al.contains(data);
   }
   public void display() {

	    al.display();

	}
    public static void main(String[] args) {

        stack s = new stack();

        s.push(10);
        s.push(20);
        s.push(30);
        s.push(40);

        s.display();

        System.out.println("Top: " + s.peek());

        System.out.println("Removed: " + s.pop());

        s.display();

        System.out.println("Top: " + s.peek());

        System.out.println("Size: " + s.size());

        System.out.println("Contains 20: " + s.contains(20));

        System.out.println("Is Empty: " + s.isEmpty());
    }
}