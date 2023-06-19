package out.production.LeetCode;

import java.util.Hashtable;

public class LongestSubstringWithoutRepeatingCharactersMedium {
    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring( " "));
    }

    public static int lengthOfLongestSubstring(String s) {
        int max = 0 ;
        int tempmax =0;
        Hashtable<Character,Integer> table = new Hashtable<>();
        for(int  i = 0 ; i < s.length() -1 ; i++){
            System.out.println("char ");

            if(Character.compare(s.charAt(i),' ') ==0){
                System.out.println("meo");
                table.put(null,1);
                tempmax++;
                if(tempmax > max){
                    max = tempmax;
                }

            }
            else if(!table.containsKey(s.charAt(i))){
                table.put(s.charAt(i),1);
               tempmax++;
                if(tempmax > max){
                    max = tempmax;
                }
            }else {
                tempmax =1;
                table = new Hashtable<>();
                table.put(s.charAt(i),1);
                if(tempmax > max){
                    max = tempmax;
                }

            }

        }
        return max;
    }
}
