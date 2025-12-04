package se.dank.Queue;

import java.util.*;

public class QMain {
    public static void main(String[] args) {
//        Queue<Integer> queue = new ArrayDeque<>();
//        queue.add(10);
//        queue.add(20);
//        queue.add(30);
//        System.out.println(queue);
////        reverse(queue);
//        queue.remove();
//        queue.remove();
//        System.out.println(queue);
        // [10, 20, 30]
        // [30, 20, 10]
//        ArrayQueue queue = new ArrayQueue(5);
//        queue.enqueue(10);
//        queue.enqueue(20);
//        queue.enqueue(30);
//        queue.enqueue(40);
//        queue.enqueue(50);
//        queue.printPositions();
//        System.out.println(Arrays.toString(queue.toArray()));
//        queue.dequeue();
//        queue.enqueue(60);
//        queue.printPositions();
////        queue.enqueue(70);
//        System.out.println(Arrays.toString(queue.toArray()));
//        queue.dequeue();
//        queue.printPositions();
//        queue.enqueue(90);
//        queue.dequeue();
//        System.out.println(Arrays.toString(queue.toArray()));
//        queue.printPositions();
//        queue.dequeue();
//        System.out.println(Arrays.toString(queue.toArray()));

        PriorityQueue<Integer> queue = new PriorityQueue<>();
        queue.add(5);
        queue.add(1);
        queue.add(3);
        queue.add(2);

        while(!queue.isEmpty()){
            System.out.println(queue.remove());
        }




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
