public class MaximumSubarray {

    public static void main (String[] args){
        int[] array = {-2,-1,-3,-4,-1,-2,-1,-5,-4};
        System.out.println(MaximunSubarraySolutionOn(array));
    }

//    o(n^2) solution
    public static int MaximunSubarraySolution(int[] array){
        int global_Max = array[0];
        for(int j=0 ; j< array.length;j++) {
            int local_Max = 0;
            for (int i = j; i < array.length; i++) {

                local_Max += array[i];
                if(global_Max< local_Max){
                    global_Max = local_Max;
                }
            }
        }
        return global_Max;

    }

    public static int MaximunSubarraySolutionOn(int[] array){

        int maxSub = array[0];
        int curSum =0;

        for (int  i=0 ; i< array.length ; i++){
            if (curSum<0){
                curSum =0 ;
            }
            System.out.println("curent before "+curSum);
            System.out.println("max before"+ maxSub);
            curSum+= array[i];
            if(curSum> maxSub){
                maxSub= curSum;
            }
            System.out.println("curent "+curSum);
            System.out.println("max "+ maxSub);
        }
        return maxSub;

    }
}

