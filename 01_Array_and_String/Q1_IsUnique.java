import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by g.ashish on 2019-09-17.
 */
public class Q1_IsUnique {

  public static boolean isUnique1(String input){
    HashSet<Character> charSet = new HashSet<>();
    for (int i = 0; i <input.length(); i++) {
      charSet.add(input.charAt(i));
    }

    return charSet.size() == input.length();
  }

  public static boolean isUnique2(String input){
    char[] chars = input.toCharArray();
    Arrays.sort(chars);
    for (int i = 0; i < chars.length-1; i++) {
      if (chars[i] == chars[i+1]){
        return false;
      }
    }
    return true;
  }

  public static void main(String[] args) {
    boolean ans = isUnique2("Ashi");
    System.out.println(ans);
  }
}
