import java.util.HashSet;
import java.util.Scanner;

public class Union_find {
    public static void main (String[] args){
        int[] array = {7,1,5,3,6,4};
        Scanner scanner =new Scanner(System.in);

        while (true){
           int a = scanner.nextInt();
           int b = scanner.nextInt();
           if(a!= -1 || b!= -1) {
               findDirect(a, b);
               System.out.println(uf.CheckWinnerBlack());
           }
           else {
               break;
           }

        }



    }

    public static UF uf = new UF(17);







    public static void findDirect(int row, int col){
        int position = 4*row+col +1 ;
        uf.initialize(position);

        int crow =row-1;
        int ccol =col-1;
        for (int  i = 0 ; i< 4 ; i++){
            if (i%2 == 0){
                crow+=1;
            }else {
                ccol+=1;
            }
            if(crow <4 && ccol <4 && crow >=0 && ccol >=0){
                int Temposition = 4*crow+ccol +1 ;
                if(!uf.canPlay(crow, ccol)){
                    uf.unionForBlack(Temposition,position);
                    uf.printAllValue();
                }
            }
        }
        for (int  i = 0 ; i< 4 ; i++){

            if (i%2 == 0){
                crow-=1;
            }else {
                ccol-=1;
            }

            if(crow <4 && ccol <4 && crow >=0 && ccol >=0){
                int Temposition = 4*crow+ccol +1 ;
                if(!uf.canPlay(crow, ccol)){
                    uf.unionForBlack(Temposition,position);
                    uf.printAllValue();
                    System.out.println("count "+uf.count());
                }
            }

            }


    }
    }

