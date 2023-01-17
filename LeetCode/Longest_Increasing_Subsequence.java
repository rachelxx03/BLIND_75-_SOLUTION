public class Longest_Increasing_Subsequence {
    public static void main (String[] args){
        int[] array = {0,1,0,3,2,3};
        System.out.println(lengthOfLIS(array));
    }

    public static int lengthOfLIS(int[] nums) {
        int longestsub = 0;
        int currentlongest = 0;
        for (int i =  1 ; i < nums.length; i++){
            if(nums[i]>nums[i-1]){
//                System.out.println(nums[i]);
                currentlongest++;
                if(currentlongest>longestsub){
                    longestsub=currentlongest;
                }
            }else {
                currentlongest = 1;
            }
        }
        return  longestsub;
    }
}
