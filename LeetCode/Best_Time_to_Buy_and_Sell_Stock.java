public class Best_Time_to_Buy_and_Sell_Stock {
    public static void main (String[] args){
        int[] array = {7,1,5,3,6,4};
        System.out.println(maxProfit(array));
    }


    public static int maxProfit(int[] prices) {
        int buy = prices[0];
        int sell =0;
        for (int i = 0 ; i< prices.length;i++){
             int current_sell =prices[i]-buy;
             if(sell<0){
                 sell =0;
             }else if(sell<current_sell){
                 sell=current_sell;
             }
             if(prices[i]<buy){
                 buy=prices[i];
             }

        }
        return sell;

    }
}
