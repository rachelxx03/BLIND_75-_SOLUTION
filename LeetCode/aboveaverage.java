import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class aboveaverage {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfclass = scanner.nextInt();
        for (int i = 0 ; i < numberOfclass ; i++){
            float totalScore = 0;
            int numberOfStudents= scanner.nextInt();
            float[] scores = new float [numberOfStudents];
            for (int j = 0 ;  j < numberOfStudents ; j ++){
                float score = scanner.nextInt();
                totalScore+= score;
                scores[j] = score;
            }
            System.out.println(percentageAvarage(scores , totalScore));


        }
    }

    static String percentageAvarage( float [] scores, float total){
        float  averageTotal = total/ scores.length;
        int aboveAverageNumber = 0;
        Arrays.sort(scores);
        for (int i = scores.length -1 ; i >= 0 ; i -- ){
            if(scores[i] > averageTotal ){
                aboveAverageNumber++;
            }
        }

        String formattedNumbers = String.format("%.3f", ((float)aboveAverageNumber/ (float) scores.length)*100)+"%";




        return formattedNumbers ;
    }
}
