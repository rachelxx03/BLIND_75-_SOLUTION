import java.util.HashMap;
import java.util.Scanner;

public class AwkwardParty {

    public static void main (String[] args){
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt(); // Read value from user
        int []array = new int[a];
        for(int i = 0 ; i< a ; i++){
            int b = scan.nextInt();

            array[i] = b;
        }
        System.out.println(solution(array));
    }
    public static int solution(int[] array){
        int result = 0 ;
        HashMap<Integer, Integer> checkPositon= new HashMap<Integer, Integer>();
        for(int i = 0 ; i < array.length ; i++ ){
            if(!checkPositon.containsKey(array[i])){
                checkPositon.put(array[i], i);
            }else {
                System.out.println(i);
                result =  (result ==0 ) ? (i - checkPositon.get(i)) : Math.min(result ,i - checkPositon.get(i));

                checkPositon.put(array[i], i);
            }
        }
        if (result == 0 ) return array.length ;

        return  result;

    }

}
