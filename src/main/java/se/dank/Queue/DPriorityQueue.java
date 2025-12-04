package se.dank.Queue;

public class DPriorityQueue {
    //insert(5)
    //[5]
    //insert(2)
    //[2, 5]
    // ^
    //insert(7)
    //[2, 5, 7]
    //       ^
    //insert(1)
    //[1, 2, 5, 7]
    // ^
    //insert(9)
    //[1, 2, 5, 7, 9]
    //             ^
    //! insert(6)
    //* [1, 2, 5, 6, 7, 9]
    //*           ^

    private int[] items;
    private int capacity;
    private int count = 0;

    public DPriorityQueue(int capacity){
        this.capacity = capacity;
        this.items = new int[capacity];
    }

    public DPriorityQueue(){
        new DPriorityQueue(5);
    }


    private void add(int item){
        if(count < 1)
            items[0] = item;
        else {
            for(int i = 0; i < items.length)
        }
    }

}
