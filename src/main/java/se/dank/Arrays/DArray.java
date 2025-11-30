package se.dank.Arrays;

import java.util.Arrays;

public class DArray {
  private int[] items;
  private int count;

  public DArray(int length) {
    this.items = new int[length];
    this.count = 0;
  }

  public void insert(int number) {
    if (count >= items.length - 1) {
      setValue(Arrays.copyOf(items, items.length + 1));
    }
    this.items[count++] = number;
  }

  public void removeAt(int idx) {
    if (idx < 0 || idx >= count)
      throw new IllegalArgumentException();

    // [10, 20, 30, 40]
    // idx: 1
    // [10, 30, 40, 0]
    // newArr = [10, 30, 40]
    for (int i = idx; i < getLength(); i++) {
      items[i] = items[i + 1];
    }
//    items = Arrays.copyOfRange(items, 0, items.length - 2);
    count--;
  }

  public int indexOf(int number) {
    for(int i = 0; i < count; i++){
      if(items[i] == number)
        return i;
    }
    return -1;
  }


  public int[] getValue() {
    return items;
  }

  private int getLength() {
    return items.length - 1;
  }

  public void setValue(int[] newItems) {
    this.items = newItems;
  }

  public void setValueAt(int number, int idx) {
    if (this.items.length > idx)
      this.items[idx] = number;
    else
      System.err.println("Out of bounds motherfucker");
  }

  public void print() {
    for (int i = 0; i < count; i++)
      System.out.println(items[i]);
  }
}
