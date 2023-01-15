import java.util.HashMap;
import java.util.Objects;

public class Valid_Anagram {
    public static void main (String[] args){
        System.out.println(isAnagram1("rat","car"));
    }

    public static boolean isAnagram1(String s, String t) {
        if (s.length()==t.length()){
            int [] count = new int[26];
            for (int i = 0 ; i < s.length();i++){
                count[s.charAt(i)-'a'] ++;
                count[t.charAt(i)-'a'] --;
            }
            for (int i = 0 ; i < s.length();i++){
                if(count[s.charAt(i)-'a'] != 0){
                    return false;
                }
            }
            return true;
        }

        return false;

    }




// O(2n) solution using hash map
//    O(2n) space complexity
     public static boolean isAnagram(String s, String t) {
        if (s.length()==t.length()){
            HashMap<Character, Integer> MapS = new HashMap<>();
            HashMap<Character, Integer> MapT = new HashMap<>();

            for (int i = 0 ; i  < s.length() ; i++){
                if (!MapS.containsKey(s.charAt(i))){
                    MapS.put(s.charAt(i),1);
                }else {
                    MapS.put(s.charAt(i),MapS.get(s.charAt(i))+1);
                }

                if (!MapT.containsKey(t.charAt(i))){
                    MapT.put(t.charAt(i),1);
                }else {
                    MapT.put(t.charAt(i),MapT.get(t.charAt(i))+1);
                }
            }

            for (int i = 0 ; i  < s.length() ; i++){
                if(!Objects.equals(MapS.get(s.charAt(i)), MapT.get(s.charAt(i)))){
                    return false;
                }
            }
            return  true;

        }

        return false;

    }
}
