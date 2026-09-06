package StackandQueue;
import java.util.*;
public class ImplementStackusingQueues {
	 Queue<Integer> q = new LinkedList<>();
	    public ImplementStackusingQueues() {
	        
	    }
	    
	    public void push(int x) {
	        q.add(x);
	        int size=q.size();
	        for(int i=0;i<size-1;i++){
	            q.add(q.remove());
	        }
	    }
	    
	    public int pop() {
	        return q.remove();
	    }
	    
	    public int top() {
	      return   q.peek();
	    }
	    
	    public boolean empty() {
	        return q.isEmpty();
	    }
	    public static void main(String[] args) {

	        ImplementStackusingQueues stack = new ImplementStackusingQueues();

	        stack.push(10);
	        stack.push(20);
	        stack.push(30);

	        System.out.println("Top: " + stack.top());

	        System.out.println("Pop: " + stack.pop());

	        System.out.println("Top: " + stack.top());

	        System.out.println("Is Empty: " + stack.empty());

	        System.out.println("Pop: " + stack.pop());
	        System.out.println("Pop: " + stack.pop());

	        System.out.println("Is Empty: " + stack.empty());
	    }

}
