import java.util.Scanner;
import java.lang.Math;

public class egypt {
    public static void main (String[] args){
        Scanner scan = new Scanner(System.in);
        while (true){
            int a = scan.nextInt(); // Read value from user
            int b = scan.nextInt(); // Read value from user
            int c = scan.nextInt(); // Read value from user
            if (a ==0 && b ==0 && c==0) {
                break;
            }
            if( (a*a +b*b) == c*c || Math.abs(a*a - b*b) == c*c ){
                System.out.println("right");
            }  else{
                System.out.println("wrong");
            }
        }
    }
}
