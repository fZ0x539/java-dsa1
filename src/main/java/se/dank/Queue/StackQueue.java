package se.dank.Queue;

import java.util.Stack;

public class StackQueue {
    //! LIFO (Stack) -> FIFO (Queue)
    private Stack<Integer> S1;
    private Stack<Integer> S2;

    //& Queue
    //& IN -> [10, 20, 30] -> OUT
    //& Stack
    //& IN-OUT <-> [10, 20, 30]



    //Q  []
    //S1 []
    //q.enqueue(10); S1.push(10);
    //q.enqueue(20); S1.push(20);
    //q.enqueue(30); S1.push(30);
    //Q  [10, 20, 30]
    //S1 [10, 20, 30]
    //q.dequeue(); s1.pop();
    //Q  [10, 20]
    //S1 [20, 30]
    //FIX
    //reverseAndPop()
    public void enqueue(int item){

    }

    private void reverse(){
        Stack<Integer> input;
        Stack<Integer> output;
        if(S1.isEmpty()){
            input = S2; output = S1;
        }
        else {
            input = S1; output = S2;
        }
        while(!input.isEmpty()){
            output.push(input.pop());
        }
    }

}
