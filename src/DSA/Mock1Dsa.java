package DSA;

import java.util.*;

public class Mock1Dsa {

    // Method to generate outStrStack
    public static Stack<String> getOutStrStack(Stack<String> inStrStack, Queue<Integer> inIntQueue) {

        Stack<String> outStrStack = new Stack<>();
        Stack<String>help=new Stack<>();
        String res="";
       while(!inStrStack.isEmpty()&& !inIntQueue.isEmpty()) {
    	   String str=inStrStack.pop();
    	   String []s=str.split(":");
    	   String x=s[0];
    	   int y=Integer.parseInt(s[1]);
    	   int z=inIntQueue.poll();
    	   if(x.length()==y) {
    		   if(y*y==z) {
    			   res=y+":"+z;
    			   help.push(res);
    		   }
    		   else {
    			   res=y+":"+"D";
    			  help.push(res);
    		   }
    	   }
    	   else {
    		   res="D";
    		   help.push(res);
    	   }
       }
      while(!help.isEmpty()) {
    	  outStrStack.push(help.pop());
      }

        return outStrStack;
    }

    // Main method
    public static void main(String[] args) {

        Stack<String> inStrStack = new Stack<>();
        inStrStack.push("Mumbai:8");
        inStrStack.push("Mysore:7");
        inStrStack.push("Kuala Lumpur:12");
        inStrStack.push("Tokyo:5");
        inStrStack.push("Rome:4");

        Queue<Integer> inIntQueue = new ArrayDeque<>();
        inIntQueue.add(16);
        inIntQueue.add(23);
        inIntQueue.add(144);
        inIntQueue.add(49);
        inIntQueue.add(62);

        Stack<String> result = getOutStrStack(inStrStack, inIntQueue);

        System.out.println("outStrStack (Top -> Bottom): " + result);
    }
}
