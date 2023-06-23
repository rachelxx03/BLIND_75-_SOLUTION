import java.util.Scanner;

public class polygonarea {

    public static void main (String[] args){
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt(); // Read value from user
        while (a!=0) {
            double[][] array = new double[a + 1][2];
            for (int i = 0; i < a; i++) {
                double[] vertex = new double[2];

                double x = scan.nextDouble();
                double y = scan.nextDouble();

                vertex[0] = x;
                vertex[1] = y;
                array[i] = vertex;

                if (i == 0) {
                    array[a] = array[0];
                }
            }
            System.out.println(gassianFormula(array, a));
             a = scan.nextInt(); // Read value from user
        }
    }


    public static String gassianFormula(double [][]array,int size){
        String result ;
        double area =  0.0;
        for (int i =0 ; i < size; i++){
            double xn  = array[i][0];
            double yn = array[i][1];
            double xn1  = array[i+1][0];
            double yn1 = array[i+1][1];


            area += (xn*yn1)- (xn1*yn);
        }
        area/=2;
        if(area< 0){
            return "CW "+ Math.abs(area);
        }else {
            return "CCW "+ Math.abs(area);
        }

    }
}
