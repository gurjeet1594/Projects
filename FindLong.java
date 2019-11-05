public class FindLong {

  public static String getString(String[] array) {
      int maxLength = 0;
      String longestString = null;
      for (String s : array) {
          if (s.length() > maxLength) {
              maxLength = s.length();
              longestString = s;
          }
      }
      return longestString;
  }
  
  public static void main(String[] args) {
      String[] X = {"Hello", "Friends", "I", "Hate","You"};
      String longestString = getString(X);
      System.out.println("longest string:"+ longestString);
  }
}

