package se.dank.Queue;

import java.util.Arrays;

public class ArrayQueue {
    private int[] items;
    private int count = 0;
    private int front;
    private int rear;
    private int capacity;
    //enqueue
    //dequeue
    //peek
    //isEmpty
    //isFull

    public ArrayQueue() {
        this.items = new int[10];
        capacity = 10;
    }

    public ArrayQueue(int capacity) {
        this.items = new int[capacity];
        this.capacity = capacity;
    }


    //! First in First out
    //& [0,  0, 0,  0,  0, 0]
    //*  F
    //*  R
    //? enqueue(30)
    //& [30, 0, 0,  0,  0, 0]
    //*  F   R
    //? enqueue(40)
    //? enqueue(50)
    //? enqueue(60)
    //& [30,40,50, 60,  0, 0]
    //*  F         R
    //? dequeue()
    //&[0 ,40,50, 60]
    //*    F       R
    public void enqueue(int item) {
        if(count == items.length) throw new IllegalStateException();
        this.items[rear] = item;
        rear = (rear + 1) % items.length;
        count++;
    }

    public void dequeue() {
        if(isEmpty()) throw new IllegalStateException();
        this.items[front] = 0;
        front = (front + 1) % items.length;
        count--;
    }

    private void decrement() {
        //Scenario
        //  [0, 20, 30, 40]
        //*     F       R
        //?  enqueue(50) -> decrement();
        //  [50, 20, 30, 40]
        //*  R   F
        //? enqueue(60) -> incrCapacity() -> decrement();
        //  [20, 30, 40, 50, 60, 0, 0, 0, 0, 0] (2x capacity)
        //*  F               R
//        if ((rear >= items.length - 1) && count >= capacity)
//            rear = 0;
//        else
//            rear++;
//        return rear = (rear + 1) % items.length;
    }

    private void increment() {
        if (front >= items.length - 1 && count <= capacity) {

        }
    }


    public int[] toArray() {
        return items;
    }

    public void printPositions() {
        System.out.println("F: " + front + " R: " + rear);
    }

    public boolean isEmpty() {
        return (front == rear && count == 0);
    }
}
