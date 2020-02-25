package generics;

import java.util.*;

public class NumberBag<T extends Number> {
  private ArrayList<T> items = new ArrayList<>();
  
  public void insert(T item) {
    items.add(item);
  }
  
  public boolean remove(T item) {
    return items.remove(item);
  }
  
  public boolean find(T item) {
    for (T element : items) {
      if (item.equals(element)) {
        return true;      
      }
    }
    return false;
  }
  
  public void display() {
    items.stream().forEach(i -> System.out.print(i + " "));
    System.out.println();
  }
  
  public static void main(String[] args) {
    NumberBag<Integer> bag = new NumberBag<>();
    bag.insert(1);
    bag.insert(2);
    bag.insert(3);
    bag.insert(4);
    
    bag.display();
    bag.remove(4);
    bag.display();
    
    System.out.println(bag.find(1)); // true
    System.out.println(bag.find(5)); // false
  }
}