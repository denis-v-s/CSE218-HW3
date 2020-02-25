package recursion;

public class IsMember {
  private static <T> boolean isMember(T[] data, T needle) {
    return isMember(data.length - 1, data, needle);
  }
  
  private static <T> boolean isMember(int index, T[] data, T needle) {
    if (index < 0) return false;
    
    if ((data[index]).equals(needle)) return true;
    
    return isMember(--index, data, needle);
  }
  
  public static void main(String[] args) {
    Integer[] data = {1, 2, 3, 4, 5};
    
    // search for a 5
    System.out.println(isMember(data, 5));  // true
    
    // search for a 10
    System.out.println(isMember(data, 10)); // false
  }
}
