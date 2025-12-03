package se.dank.Queue;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Stack;

public class QMain {
    public static void main(String[] args) {
        Queue<Integer> queue = new ArrayDeque<>();
        queue.add(10);
        queue.add(20);
        queue.add(30);
        System.out.println(queue);
        reverse(queue);
        System.out.println(queue);
        // [10, 20, 30]
        // [30, 20, 10]

    }

    public static void reverse(Queue<Integer> queue){
        //add
        //remove
        //isEmpty
        Stack<Integer> stack = new Stack<>();
        while(!queue.isEmpty()){
            stack.push(queue.remove());
        }

        while(!stack.isEmpty()){
            queue.add(stack.pop());
        }
    }
}
