package StackandQueue;

import java.util.Stack;

public class ImplementQueueusingStacks {

    class MyQueue {

        Stack<Integer> s1;
        Stack<Integer> s2;

        public MyQueue() {
            s1 = new Stack<>();
            s2 = new Stack<>();
        }

        public void push(int x) {
            s1.push(x);
        }

        public int pop() {

            while (!s1.isEmpty()) {
                s2.push(s1.pop());
            }

            int ans = s2.pop();

            while (!s2.isEmpty()) {
                s1.push(s2.pop());
            }

            return ans;
        }

        public int peek() {

            while (!s1.isEmpty()) {
                s2.push(s1.pop());
            }

            int ans = s2.peek();

            while (!s2.isEmpty()) {
                s1.push(s2.pop());
            }

            return ans;
        }

        public boolean empty() {
            return s1.isEmpty();
        }
    }

    public static void main(String[] args) {

        ImplementQueueusingStacks obj =
                new ImplementQueueusingStacks();

        MyQueue queue = obj.new MyQueue();

        queue.push(10);
        queue.push(20);
        queue.push(30);

        System.out.println(queue.peek());  // 10
        System.out.println(queue.pop());   // 10
        System.out.println(queue.pop());   // 20

        queue.push(40);

        System.out.println(queue.peek());  // 30
        System.out.println(queue.empty()); // false
    }
}