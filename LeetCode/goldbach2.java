import java.util.ArrayList;
import java.util.Scanner;

public class goldbach2 {
    public static void main (String[] args){
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt(); // Read value from user

        for (int i = 0; i < a; i++  ){
            int b = scan.nextInt(); // Read value from user
            goldback(b);

        }
        }
        public static void goldback(int b){
        int count =0;
        ArrayList<Integer> arrList = new ArrayList<Integer>() ;
            for(int i = 2 ; i<= b/2 ; i++){

                    int pointer1 = i;
                    int pointer2 = b - i ;

                    if(isprime(pointer1)&& isprime(pointer2)){

                        count++;
                        arrList.add(pointer1);
                        arrList.add(pointer2);
                    }
            }
            System.out.println(Integer.toString(b)+" has "+ Integer.toString(count)+ " representation(s)" );

            for (int i = 0 ; i < arrList.size(); i+=2){
                System.out.println(arrList.get(i)+"+"+ arrList.get(i+1) );
            }
            System.out.println();
        }

        public static boolean isprime(int c){

            for(int i = 2; i <= (int)  Math.sqrt(c);i++){

                if( c % i == 0){
                    return false;
                }
            }
            return true;
        }

    }



