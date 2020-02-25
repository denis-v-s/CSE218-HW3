package recursion;

public class CharacterCounter {
  private static int countChar(String s, char c) {
    return countChar(s, c, 0, 0);
  }
  
  private static int countChar(String s, char c, int index, int counter) {
    if (index == s.length()) return counter;
    
    if (s.charAt(index) == c) {
      counter++;
    }
    
    return countChar(s, c, ++index, counter);
  }
  
  public static void main(String[] args) {
    System.out.println(countChar("aaabc", 'a')); // 3
    System.out.println(countChar("abc", 'a'));   // 1
    System.out.println(countChar("cabc", 'c'));  // 2
  }

}
