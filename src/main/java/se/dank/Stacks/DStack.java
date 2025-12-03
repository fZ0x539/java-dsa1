package se.dank.Stacks;

import java.util.Arrays;
import java.util.EmptyStackException;

public class DStack {
    //Push
    //Pop
    //Peek
    //Empty
    //! Last in First out LIFO
    private int[] stack;
    private int count = 0;

    public DStack() {
        this.stack = new int[10];
    }

    public int push(int number) {
        if (count >= stack.length) {
            this.stack = (Arrays.copyOf(stack, 2 * count));
        }
        return stack[count++] = number;
    }

    public int pop() {
        if (isEmpty()) throw new EmptyStackException();
        int popped = stack[count];
        stack[count--] = 0;
        return popped;
    }

    public int peek(){
        if(isEmpty()) throw new EmptyStackException();
        return stack[count];
    }


    public int[] toArray() {
        if (isEmpty()) throw new EmptyStackException();
        return (Arrays.copyOf(stack, count));
    }

    public boolean isEmpty() {
        return count < 0;
    }


    @Override
    public String toString(){
        if (isEmpty()) throw new EmptyStackException();
        return Arrays.toString((Arrays.copyOf(stack, count)));
    }
}
