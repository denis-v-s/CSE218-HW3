package generics;

public class Faculty implements Identifiable {
  private int id;
  private static int _id = 0;
  private String name;
  private double salary;
  
  public Faculty(String name, double salary) {
    super();
    id = _id++;
    this.name = name;
    this.salary = salary;
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
  public double getSalary() {
    return salary;
  }
  public void setSalary(double salary) {
    this.salary = salary;
  }
  
  @Override
  public boolean equals(Object o) {
    if (o == null) return false;
    
    Faculty f = (Faculty) o;
    return this.getId().equals(f.getId());
  }
  
  @Override
  public String toString() {
    return "(id " + getId() + ") " + getName();
  }
}
