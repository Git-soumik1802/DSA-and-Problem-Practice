package DSA;

import java.util.*;

public class Mock6Dsa {

    // Function (logic)
    public static Queue<String> allocateCodes(
            Stack<String> inStack,
            ArrayList<String> arrList) {

        Queue<String> outQueue = new ArrayDeque<>();
        Queue<String> temp = new ArrayDeque<>();
        while (!inStack.isEmpty()) {
        	String code1=inStack.pop();
        	String code2=inStack.pop();
        	String combineCode=code1+code2;
        	boolean found=false;
        	for(int i=0;i<arrList.size();i++) {
        		String s=arrList.get(i);
        		if(s.contains(combineCode)) {
        			outQueue.add(combineCode);
        			found=true;
        			break;
        		}
        	}
        	if(!found){
        		temp.add(code1);
        	}
        }
        while(!temp.isEmpty()) {
        	outQueue.add(temp.poll());
        }
        return outQueue;
    }

 
    public static void main(String[] args) {

        Stack<String> inStack = new Stack<>();

        
        inStack.push("F6");
        inStack.push("A6");
        inStack.push("F6");
        inStack.push("E5");
        inStack.push("D4");
        inStack.push("C3");
        inStack.push("B2");
        inStack.push("A1");

        ArrayList<String> arrList = new ArrayList<>();
        arrList.add("X-A1B2-Y");
        arrList.add("Z-C4D4");
        arrList.add("Q-E4D4-W");
        arrList.add("Z-E5F6-P");

        Queue<String> outQueue = allocateCodes(inStack, arrList);

        System.out.println("Output Queue (Front -> Rear):");
        for (String s : outQueue) {
            System.out.print(s + " ");
        }
    }
}
