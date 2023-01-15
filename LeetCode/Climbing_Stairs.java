import java.util.ArrayList;

public class Climbing_Stairs {
    public static void main (String[] args){
        System.out.println(limbStairs( 3));
    }
//    dynamic

    private static int limbStairs(int n) {
        int[] arr = new int[n+2];
        arr[0]=0;
        arr[1]=1;
        for (int i = 2 ; i<=n+1 ;i++){
            arr[i]= arr[i-1]+arr[i-2];
        }
        return arr[arr.length-1];
    }


}
