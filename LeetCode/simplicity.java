import java.util.Arrays;
import java.util.Scanner;

public class simplicity {
    public static void main (String[] args){
        Scanner scan = new Scanner(System.in);
        String a = scan.next(); // Read value from user
        System.out.println(simplicity(a));
    }

    static int simplicity(String word){
        int noRepeated = 0 ;
        int[]  words = new int[26] ;
        int res = 0;
        for (int i = 0; i < word.length(); i++) {
           int position =  word.charAt(i) -'a'  ;
           words[position]++;
           if(words[position] == 1){
               noRepeated++;
           }
        }
        int loopTime = noRepeated - 2;
        if(loopTime<=0){ return 0 ;}
        Arrays.sort(words);

        for(int i: words){
            if(i!= 0){
                loopTime--;
                res+= i ;
                if(loopTime == 0 ) break ;

            }
        }


        return  res;
    }

}
