package generics;

import java.util.*;

public class GBag<T extends Identifiable> {
  private ArrayList<T> items = new ArrayList<>();
  
  public void insert(T item) {
    items.add(item);
  }
  
  public boolean deleteByID(String id) {
    T item = findByID(id);
    return items.remove(item);
  }
  
  public T findByID(String id) {
    for (T element : items) {
      if (id.equals(element.getId())) {
        return element;
      }
    }
    return null;
  }
  
  public void display() {
    items.stream().forEach(i -> System.out.print(i + " "));
    System.out.println();
  }
  
  public static void main(String[] args) {
    // TEST STUDENTS
    GBag<Identifiable> bag = new GBag<>();
    bag.insert(new Student("Joe", 2.5));
    bag.insert(new Student("Carol", 3.5));
    bag.insert(new Student("Mike", 3.2));
    bag.insert(new Student("Janice", 3.2));
    bag.insert(new Student("Aaron", 3.2));
    
    bag.display();
    bag.deleteByID("1");
    bag.display();
    
    System.out.println(bag.findByID("2")); // Mike
    System.out.println(bag.findByID("5")); // Null
    
    // TEST FACULTY
    GBag<Identifiable> facultyBag = new GBag<>();
    facultyBag.insert(new Faculty("(F) Joe", 28.5));
    facultyBag.insert(new Faculty("(F) Carol", 35.5));
    facultyBag.insert(new Faculty("(F) Mike", 35.2));
    facultyBag.insert(new Faculty("(F) Janice", 35.2));
    facultyBag.insert(new Faculty("(F) Aaron", 35.2));
    
    facultyBag.display();
    facultyBag.deleteByID("1");
    facultyBag.display();
    
    System.out.println(facultyBag.findByID("3")); // (F) Janice
    System.out.println(facultyBag.findByID("5")); // Null
  }
}