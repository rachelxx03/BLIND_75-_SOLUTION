public class Two_Sum_II {

    public int[] twoSum(int[] numbers, int target) {
        int[] solution = new int[2];
        int upperPointer  = 0 ;
        int lowerPointer = numbers.length-1;
        while (true){
            if (numbers[upperPointer] + numbers[lowerPointer] == target){
                solution[0] = numbers[upperPointer];
                solution[1] = numbers[lowerPointer];
                return solution;
            }
            else if (numbers[upperPointer] + numbers[lowerPointer] < target){
                upperPointer++;
            }else if (numbers[upperPointer] + numbers[lowerPointer] > target){
                upperPointer--;
            }
        }
    }
}
