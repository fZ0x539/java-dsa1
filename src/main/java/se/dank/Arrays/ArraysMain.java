package se.dank.Arrays;

public class ArraysMain {
  public static void main(String[] args) {
    DArray moshArray = new DArray(3);
    moshArray.insert(5);
    moshArray.insert(10);
    moshArray.insert(15);
    moshArray.insert(20);
    moshArray.insert(200);
    moshArray.insert(200);
    moshArray.insert(200);
    moshArray.insert(200);
    moshArray.insert(200);
    moshArray.removeAt(2);
    System.out.println(moshArray.indexOf(20));
    moshArray.print();
  }
}
