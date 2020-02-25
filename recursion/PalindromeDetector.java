package recursion;

public class PalindromeDetector {
  private static boolean isPalindrome(String s) {
    return isPalindrome(s, 0);
  }
  
  private static boolean isPalindrome(String s, int index) {
    if (index > s.length() / 2) return true;
    
    if (s.charAt(index) != s.charAt(s.length() - index - 1)) {
      return false;
    }
    
    return isPalindrome(s, ++index);
  }
  
  public static void main(String[] args) {
    System.out.println(isPalindrome("asdsa")); // true
    
    System.out.println(isPalindrome("asdsaa")); // false
  }

}
