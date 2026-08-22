package DSA;

import java.util.*;

public class Mock7Dsa {

    
    public static Stack<String> processStackAndQueue(Stack<String> inStrStack, Queue<Integer> inIntQueue) {
        Stack<String> outStrStack = new Stack<>();
        Stack<String> tempDataStructure = new Stack<>();

        while (!inIntQueue.isEmpty() && !inStrStack.isEmpty()) {
            int data1 = inIntQueue.poll();
            int data2 = inIntQueue.poll();
            String str = inStrStack.pop();
            int sum = data1 + data2;
            int lastDigit = sum % 10;

         
            if (str.contains(String.valueOf(sum))) {
                outStrStack.push(str);
            }

            
            if (str.contains(String.valueOf(lastDigit))) {
                outStrStack.push(str + (lastDigit * 2));
            } else if (!str.contains(String.valueOf(sum))) {
               
                tempDataStructure.push(str);
            }
        }

        
        while (!tempDataStructure.isEmpty()) {
            outStrStack.push(tempDataStructure.pop());
        }

        return outStrStack;
    }

    public static void main(String[] args) {
        // Sample input
        Stack<String> inStrStack = new Stack<>();
        inStrStack.push("999");
        inStrStack.push("tr5");
        inStrStack.push("kile8");
        inStrStack.push("123"); // Top element

        // Queue for integers
        Queue<Integer> inIntQueue = new LinkedList<>();
        Collections.addAll(inIntQueue, 3, 6, 17, 8, 31, 6, 8, 9);

        // Call the function
        Stack<String> outStrStack = processStackAndQueue(inStrStack, inIntQueue);

        // Print output stack (Top -> Bottom)
        System.out.println("outStrStack (Top -> Bottom):");
        for (int i = outStrStack.size() - 1; i >= 0; i--) {
            System.out.println(outStrStack.get(i));
        }
    }
}
