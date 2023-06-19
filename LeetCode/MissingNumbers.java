import java.util.Scanner;

public class MissingNumbers {
    public static void main (String[] args){
        Scanner scan = new Scanner(System.in);
        int numbers = scan.nextInt(); // Read value from user
        int[] counts= new int[numbers];
        for ( int i = 0 ;  i < numbers ; i++ ){
            int number = scan.nextInt(); // Read value from user
            counts[i] = number;
        }
        missingNumber(counts);

    }


    public static void missingNumber(int[] number) {
        int p0 = 0;
        int p1 = 1;
        int True = 0 ;
        while (p0 < number.length){
            True ++;
            if(number[p0] == p1){
                p1++;
                p0++;
            }else {
                System.out.println(p1);
                p1++;
            }
        }
        if(True == number.length){
            System.out.println("good job");
        }
    }
}
