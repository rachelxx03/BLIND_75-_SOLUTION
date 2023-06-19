import java.util.Scanner;

public class zoom {
    public static void main (String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt(); // Read value from user
        int k = scan.nextInt(); // Read value from user

        int[] counts= new int[n];
        for ( int i = 0 ;  i < n ; i++ ){
            int number = scan.nextInt(); // Read value from user
             counts[i] = number;
        }
        zoom(counts,k,n);
    }


    public static void zoom(int[] number, int k,int n) {
        int q = n / k ;

        for (int i = 1 ; i <= q ; i++  ){
            String result = String.format("%2d ",number[i*k-1]);
            System.out.print(result);
        }
    }
}
