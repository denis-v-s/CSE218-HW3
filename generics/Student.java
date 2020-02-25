package generics;

public class Student implements Identifiable {
  private int id;
  private static int _id = 0;
  private String name;
  private double gpa;

  public Student(String name, double gpa) {
    super();
    id = _id++;
    this.name = name;
    this.gpa = gpa;
  }

  public String getId() {
    return String.valueOf(id);
  }
  
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public double getGpa() {
    return gpa;
  }

  public void setGpa(double gpa) {
    this.gpa = gpa;
  }
  
  @Override
  public boolean equals(Object o) {
    if (o == null) return false;
    
    Student s = (Student) o;
    return this.getId().equals(s.getId());
  }

  @Override
  public String toString() {
    return "(id " + getId() + ") " + getName();
  }
}
