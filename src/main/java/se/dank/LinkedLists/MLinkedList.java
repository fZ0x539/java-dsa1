package se.dank.LinkedLists;

import java.util.NoSuchElementException;

public class MLinkedList {
    private class Node {
        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }
    }

    private Node head;
    private Node tail;
    private int size = 0;

    public void addFirst(int item) {
        var node = new Node(item);
        if (isEmpty())
            head = tail = node;

        else {
            node.next = head;
            head = node;
        }
        size++;
    }

    public void addLast(int item) {
        var node = new Node(item);
        if (isEmpty()) {
            head = tail = node;
        } else {
            tail.next = node;
            tail = node;
        }
        size++;
    }

    public int indexOf(int item) {
        int index = 0;
        var current = head;
        while (current != null) {
            if (current.value == item) return index;
            current = current.next;
            index++;
        }
        return -1;
    }

    public boolean contains(int item) {
        return indexOf(item) != -1;
    }

    public void removeFirst() {
        if (isEmpty()) throw new NoSuchElementException();
        var newHead = head.next;
        head.next = null;
        head = newHead;
        size--;
    }

    public void removeLast() {
        if (isEmpty()) throw new NoSuchElementException();

        if (head.equals(tail)) {
            head = tail = null;
            size--;
            return;
        }

        var newTail = getPrevious(tail);
        if (newTail != null) {
            newTail.next = null;
            tail = newTail;
            size--;
        }
    }

    public int[] toArray() {
        int[] arr = new int[size];
        var current = head;
        int index = 0;
        while (current != null) {
            arr[index++] = current.value;
            current = current.next;
        }

        return arr;
    }

    public int getKthNode(int k) {
        if(isEmpty()) throw new NoSuchElementException();
        if (k > size || k < 0) return -1;
        // [10, 20, 30, 40, 50]
        //          *        *    K = 3
        //  *                *    K = 5
        // K = 1 (50)
        // K = 2 (40)
        // K = 3 (30)
        Node reference = head;
        Node k_ref = head;
        int index = 1;
        while (reference != null) {
            if (index < k) {
                System.out.println("Index: " + index + " Current k_ref.value: " + k_ref.value);
                k_ref = k_ref.next;
            }
            reference = reference.next;
            index++;
        }

        return k_ref.value;
    }


    public void reverse() {
        if (isEmpty()) throw new NoSuchElementException();

        Node previous = null;
        Node current = head;
        Node tmpHead = head;
        while (current != null) {
            Node next = current.next;  // Save the next node
            current.next = previous;   // Reverse the pointer
            previous = current;        // Move previous forward
            current = next;            // Move current forward
        }
        head = tail;
        tail = tmpHead;
    }


    public int size() {
        return size;
    }


    private Node getPrevious(Node node) {
        var current = head;
        while (current != null) {
            if (current.next.equals(node)) return current;
            current = current.next;
        }
        return null;
    }


    private boolean isEmpty() {
        return head == null;
    }
}
