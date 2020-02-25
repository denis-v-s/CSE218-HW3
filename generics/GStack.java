package generics;

import java.util.*;

public class GStack<T> {
  private ArrayList<T> sArray;
  
  public GStack() {
    sArray = new ArrayList<>();
  }
  
  public void push(T value) {
    sArray.add(value);
  }
  
  public void pushAll(T[] items) {
    Arrays.stream(items).forEach(i -> push(i));
  }
  
  public T pop() {
    if (sArray.size() == 0) throw new EmptyStackException();
    return sArray.remove(sArray.size() - 1);
  }
  
  public ArrayList<T> popAll() {
    ArrayList<T> items = new ArrayList<>();
    while(!isEmpty()) {
      items.add(pop());
    }
    
    return items;
  }
  
  public T peek() {
    return sArray.get(sArray.size() - 1);
  }
  
  public boolean isEmpty() {
    return sArray.size() == 0;
  }
    
  public static void main(String[] args) {
    GStack<Integer> stack = new GStack<>();
    stack.push(1);
    stack.push(2);
    stack.push(3);
    stack.pushAll(new Integer[] { 4, 5, 6 });
    
    while (!stack.isEmpty()) {
      System.out.println(stack.pop());
    }
  }
}
