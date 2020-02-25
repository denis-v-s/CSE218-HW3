package recursion;

public class StringReverser {
  private static void reverse(String s) {
    reverse(s, s.length() - 1);
  }
  
  private static void reverse(String s, int index) {
    if (index < 0) return;
    
    System.out.print(s.charAt(index));
    reverse(s, --index);
  }
  
  public static void main(String[] args) {
    reverse("abcdef"); // fedcba
  }
}
