import java.util.Scanner;
import java.lang.Math;


public class nothanks {
    public static void main (String[] args){
        Scanner scan = new Scanner(System.in);
        while (true){
            int a = scan.nextInt(); // Read value from user
            int b = scan.nextInt(); // Read value from user
            int c = scan.nextInt(); // Read value from user
            if( (a*a +b*b) == c*c || Math.abs(a*a - b*b) == c*c ){
                System.out.println("right");
            } else if (a ==0 && b ==0 && c==0) {
                break;

            } else{
                System.out.println("wrong");

            }

        }
    }


    public static int nothanks(int[] numbers) {
        int[] unionArray = new int[90001];
        int sum = 0 ;
        for (int number : numbers) {
            unionArray[number] = 1;
        }
        for(int i = 1 ; i < unionArray.length ; i++){
          if(unionArray[i-1]!= 1 && unionArray[i] == 1){
              sum+= i;
          }
        }
        return sum ;


    }
}
