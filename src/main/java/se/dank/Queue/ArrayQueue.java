package se.dank.Queue;

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
    // First in First out
    // [0,  0,  0,  0,  0,  0,  0,  0,  0,  0]
    // [0,  0,  0,  0,  0,  10, 20, 30, 40]
    //                      F            R
    //                                      arrayQueue.enqueu e(5);
    // [0,  0,  0,  0,  5,  10, 20, 30, 40]
    //                  F                R
    public void enqueue(){

    }
}
