package se.dank.LinkedLists;

import java.util.Arrays;
import java.util.NoSuchElementException;

public class DLinkedList<T> {
  private Node<T> head;
  private Node<T> tail;
  private int length;

  public DLinkedList() {
  }

  //addFirst
  //addLast
  //deleteFirst
  //deleteLast
  //contains
  //indexOf

  public void addFirst(T item) {
    var newHead = new Node<T>(item);
    if (head == null) { // Empty
      head = newHead;
      tail = newHead;
    } else {
      var tmpNode = head;
      newHead.setNext(tmpNode);
      head = newHead;
    }
    length++;
  }


  public void addLast(T item) {
    var newNode = new Node<T>(item);
    if (tail != null) {
      tail.setNext(newNode);
    }
    tail = newNode;

    if (head == null) // Empty
      head = newNode;

    length++;
  }

  public void removeFirst() {
    if(isEmpty()) throw new NoSuchElementException();
    head = head.getNext();
    length--;
  }

  public void removeLast() {
    if(isEmpty()) throw new NoSuchElementException();

    Node<T> currentNode = head;
    Node<T> nextNode;
    boolean runLoop = true;
    while (runLoop) {
      nextNode = currentNode.getNext();

      if(nextNode.getNext() == null){ // if nextNode is tail
        runLoop = false;
        currentNode.setNext(null);
        tail = currentNode;
        length--;
      } else {
        currentNode = nextNode;
      }
    }
  }

  public int indexOf(T item){
    Node<T> tmpNode = head;
    boolean runLoop = true;
    int index = 0;
    while (runLoop) {
      if(tmpNode.getValue().equals(item)) return index;
      index++;
      tmpNode = tmpNode.getNext();
      if (tmpNode == null) runLoop = false;
    }
    return -1;
  }

  public boolean contains(T item){
    Node<T> tmpNode = head;
    boolean runLoop = true;
    while (runLoop) {
      if(tmpNode.getValue().equals(item)) return true;
      tmpNode = tmpNode.getNext();
      if (tmpNode == null) runLoop = false;
    }
    return false;
  }

  public void print() {
    if(isEmpty()) throw new NoSuchElementException();

    Node<T> nextNode = head;
    boolean runLoop = true;
    while (runLoop) {
      System.out.println(nextNode.getValue());
      nextNode = nextNode.getNext();
      if (nextNode == null) runLoop = false;
    }
  }

  private boolean isEmpty(){
    return head == null;
  }


  public int size() {
    return length;
  }
}
