import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static java.lang.Math.max;


public class k99problems {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String originalPrice = scanner.nextLine();
        System.out.println(reducePrice(originalPrice));


    }
    public static int reducePrice(String originalPrice){

        int price = Integer.parseInt(originalPrice);
        int lowerPrice, higherPrice;
        int nintynight  = (int) Math.pow(10,(originalPrice.length() -1))-1;

        if(price<100){
            return 99;
        }
        int boundery = Integer.parseInt(String.valueOf(originalPrice.charAt(0)));

            lowerPrice = (int)   (price-  ((1)*Math.pow(10,originalPrice.length()-1) )) -100- price%100 +99;

        higherPrice =price- price%100 +99;
        System.out.println(lowerPrice);
        System.out.println(higherPrice);


        if( (price - lowerPrice) < (higherPrice- price)){
            return  lowerPrice;
        } else if ((price - lowerPrice) > (higherPrice- price)) {
            return higherPrice;
        }else{
            return max(lowerPrice,higherPrice);
        }


    }
}
