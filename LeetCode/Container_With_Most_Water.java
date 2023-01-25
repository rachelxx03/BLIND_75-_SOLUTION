public class Container_With_Most_Water {
    public static void main (String[] args){
        int[] array = {2,3,4,5,18,17,6};
        System.out.println(maxArea(array));
    }

    public static int maxArea(int[] height) {
        int max = 0;
        int leftP = 0;
        int rightP = height.length-1;
        while (leftP!= rightP){
            int currentMax = (rightP -leftP) * Math.min(height[rightP],height[leftP]);
            if (currentMax > max ){
                max = currentMax;
            }
            if(height[rightP] >height[leftP]){
                leftP++;
            }else  {
                rightP--;
            }


        }
        return  max;


    }
}
