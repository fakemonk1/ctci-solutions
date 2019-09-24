import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/**
 * Created by g.ashish on 2019-09-25.
 */
public class Q2_isPermutation {

  public boolean isPermutation_1(String str1, String str2){
    if (str1.length() != str2.length()){
      return false;
    }

    return sort(str1).equals(sort(str2));
  }

  private boolean isPermutation_2(String str1, String str2){
    Map<Character, Integer> countMap1 = getCountMap(str1);
    Map<Character, Integer> countMap2 = getCountMap(str2);
    Set<Entry<Character, Integer>> entries = countMap1.entrySet();
    for (Entry<Character, Integer> entry : entries) {
      Character key1 = entry.getKey();
      Integer integer1 = countMap1.get(key1);
      Integer integer2 = countMap2.get(key1);
      if (!integer1.equals(integer2)){
        return false;
      }
    }
    return true;
  }

  private Map<Character, Integer> getCountMap(String str){
    Map<Character, Integer> countMap = new HashMap<>();
    for (int i = 0; i < str.length(); i++) {
      Character ch = str.charAt(i);
      if (countMap.containsKey(str.charAt(i))){
        countMap.put(ch, countMap.get(ch)+1);
      }else{
        countMap.put(ch, 1);
      }
    }

    return countMap;
  }
  private String sort(String str){
    if (str == null){
      return str;
    }

    char[] chars = str.toCharArray();
    Arrays.sort(chars);
    return new String(chars);
  }

  public static void main(String[] args) {
    Q2_isPermutation q2 = new Q2_isPermutation();
    System.out.println(
    q2.isPermutation_2("god", "dof")
    );
  }
}
