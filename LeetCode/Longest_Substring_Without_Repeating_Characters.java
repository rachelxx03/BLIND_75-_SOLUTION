import java.util.Scanner;

public class Longest_Substring_Without_Repeating_Characters {

    public static void main (String[] args){
        Scanner scan = new Scanner(System.in);
        String a = scan.next(); // Read value from user
        System.out.println(lcswre(a));
    }

    public static int lcswre(String word){
        int highest = 0 ;
        int tempHight=0;
        int[]  words = new int[26] ;
        for (int i = 0; i < word.length(); i++) {
            int position =  word.charAt(i) -'a'  ;
            if( words[position] ==0 ){
                words[position]++;
                tempHight++;
            }else{
                 words = new int[26] ;
                words[position]++;
                if(tempHight> highest){
                     highest = tempHight;
                 }
                 tempHight = 1 ;
            }

        }

        return highest;

    }
}
