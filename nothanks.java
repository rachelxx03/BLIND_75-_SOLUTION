public class nothanks {
    public static void main (String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt(); // Read value from user
        int[] counts= new int[n];
        for ( int i = 0 ;  i < n ; i++ ){
            int number = scan.nextInt(); // Read value from user
            counts[i] = number;
        }
        nothanks(counts);
    }


    public static void nothanks(int[] numbers) {
        int[] counts= new int[90000];
        for (int number : numbers){
            counts[number-1] = 1;
        }

    }
}
