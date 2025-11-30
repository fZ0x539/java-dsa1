package se.dank.LinkedLists;

import java.util.Arrays;
import java.util.LinkedList;

public class LLMain {
  public static void main(String[] args) {
    LinkedList<Integer> linkedList = new LinkedList<>();
//    list.addLast(10);
//    list.addLast(20);
//    list.addLast(50);
//    list.addFirst(5);
//    System.out.println("Contains(10): " + list.contains(10));
//    System.out.println("indexOf(50): " + list.indexOf(50));
//    System.out.println("Size: " + list.size());
//    var arr = list.toArray();
//    System.out.println(Arrays.toString(arr));

    DLinkedList<Integer> list = new DLinkedList<>();
//    list.addFirst(3);
//    list.addLast(4);
//    list.addLast(5);
//    list.addLast(6);
//    list.addFirst(2);
//    list.addLast(7);
//    list.addFirst(1);
//    list.print();
//    System.out.println("Length: " + list.size());
//
//    list.print();
//    System.out.println("Length: " + list.size());
//    System.out.println("Index of: " + list.indexOf(8));
//    System.out.println("Contains 1: " + list.contains(1));
//    System.out.println("Contains 7: " + list.contains(7));
//    System.out.println("Contains -1: " + list.contains(-1));
//    System.out.println("Contains 10: " + list.contains(10));
    list.addLast(10);
    list.removeFirst();
    list.print();
  }
}
