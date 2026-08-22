package DSA;

import java.util.*;

public class Mock5Dsa {

    public static Queue<String> allocateCabins(
            Stack<Integer> inIntStack,
            Queue<String> inStrQueue) {

        Queue<String> outStrQueue = new ArrayDeque<>();

        Queue<String> s = new ArrayDeque<>();
        Queue<String> f = new ArrayDeque<>();
        Queue<String> m = new ArrayDeque<>();
        Queue<Integer> cc = new ArrayDeque<>();

       
        while (!inIntStack.isEmpty()) {
            cc.add(inIntStack.pop());
        }
        while (!inStrQueue.isEmpty()) {
            String str = inStrQueue.poll();

            if (str.contains("S")) {
                s.add(str);
            } else if (str.contains("F")) {
                f.add(str);
            } else if (str.contains("M")) {
                m.add(str);
            }
        }
        while (!s.isEmpty()) {
            outStrQueue.offer(s.poll() + "-" + cc.poll());
        }
 
        while (!f.isEmpty()) {
            int cabin = cc.poll();
            outStrQueue.offer(f.poll() + "-" + cabin);

            if (!f.isEmpty()) {
                outStrQueue.offer(f.poll() + "-" + cabin);
            }
        }

        while (!m.isEmpty()) {
            int cabin = cc.poll();
            outStrQueue.offer(m.poll() + "-" + cabin);

            if (!m.isEmpty()) {
                outStrQueue.offer(m.poll() + "-" + cabin);
            }
        }

        return outStrQueue;
    }


    public static void main(String[] args) {

        Stack<Integer> inIntStack = new Stack<>();
        inIntStack.push(101);
        inIntStack.push(102);
        inIntStack.push(103);
        inIntStack.push(104);
        inIntStack.push(105);

        Queue<String> inStrQueue = new ArrayDeque<>();
        inStrQueue.add("6BS89F");
        inStrQueue.add("12M008F");
        inStrQueue.add("123F956F");
        inStrQueue.add("1234M757");
        inStrQueue.add("78F67F");
        inStrQueue.add("56S78");

        Queue<String> result = allocateCabins(inIntStack, inStrQueue);

        System.out.println("Output Queue:");
        while (!result.isEmpty()) {
            System.out.println(result.poll());
        }
    }
}
