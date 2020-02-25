package recursion;

public class MaxElement {
  private static <T extends Comparable<T>> T maxElement(T[] data) {
    int index = data.length - 1;
    return maxElement(data, index, data[index]);
  }
  
  private static <T extends Comparable<T>> T maxElement(T[] data, int index, T max) {
    if (index < 0) return max;
    
    if (max.compareTo(data[index]) < 0) {
      max = data[index];
    }
    return maxElement(data, --index, max);
  }
  
  public static void main(String[] args) {
    Integer[] data = {1, 2, 3, 4, 5};
    System.out.println(maxElement(data)); // 5
  }

}
