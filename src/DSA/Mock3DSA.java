package DSA;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Stack;

public class Mock3DSA {

    public static void main(String[] args) {

        // Input Stack (Top -> Bottom)
        Stack<Integer> inIntStack = new Stack<>();
        inIntStack.push(7);
        inIntStack.push(24);
        inIntStack.push(9);
        inIntStack.push(12);

        // Input Queue (Front -> Rear)
        Queue<Integer> inIntQueue = new ArrayDeque<>();
        inIntQueue.add(15);
        inIntQueue.add(25);

        Stack<Integer> outIntStack =
                generateOutIntStack(inIntStack, inIntQueue);

        System.out.println("outIntStack (Top -> Bottom):");
        while (!outIntStack.isEmpty()) {
            System.out.print(outIntStack.pop() + " ");
        }
    }

    // ---------------- METHOD ----------------
    public static Stack<Integer> generateOutIntStack(
            Stack<Integer> inStack,
            Queue<Integer> inQueue) {

        Stack<Integer> outStack = new Stack<>();
        Stack<Integer> help = new Stack<>();

       while(!inStack.isEmpty()&&!inQueue.isEmpty()) {
    	   int a=inStack.pop();
    	   int b=inStack.pop();
//    	   System.out.println(a+"ne");
//    	   System.out.println(b);
    	   int c=inQueue.poll();
    	   if(a*a+b*b==c*c) {
    		   outStack.push(c*c);
    		   outStack.push(a);
    		   outStack.push(b);
    		   
    	   }
    	   if(a*a+b*b!=c*c) {
    		   
    		   outStack.push(a*b);
    	   }
    	  
       }
       while(!inStack.isEmpty()) {
    	   outStack.push(inStack.pop());
       }
       while(!inQueue.isEmpty()) {
    	   outStack.push(inQueue.poll());
       }

        return outStack;
    }
}

