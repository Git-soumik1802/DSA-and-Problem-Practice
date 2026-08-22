package DSA;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Stack;

public class Mock4Dsa {

    public static void main(String[] args) {

        // Input Stack (Top -> Bottom)
        Stack<Integer> inIntStack = new Stack<>();
        inIntStack.push(5);
        inIntStack.push(45);
        inIntStack.push(9);
        inIntStack.push(20);
        inIntStack.push(15);

        // Input Queue (Front -> Rear)
        Queue<Integer> inIntQueue = new ArrayDeque<>();
        inIntQueue.add(20);
        inIntQueue.add(10);
        inIntQueue.add(33);
        inIntQueue.add(35);
        inIntQueue.add(40);

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

       while(!inQueue.isEmpty()&& !inStack.isEmpty()) {
    	   int a=inStack.pop();
    	   int b=inQueue.poll();
    	   String str="";
    	   if(b<a) {
    		   str=a+""+b;
//    		   System.out.println(str);
    		   help.push(Integer.parseInt(str));
    	   }
    	   else {
    		   str=b+""+a; 
    		   help.push(Integer.parseInt(str));
    	   }
       }
       while(!help.isEmpty()) {
    	   outStack.push(help.pop());
       }

        return outStack;
    }
}
