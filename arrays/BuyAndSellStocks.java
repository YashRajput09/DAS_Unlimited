public class BuyAndSellStocks {
    public static void BASS(int sp[]){
        int bp = Integer.MAX_VALUE;
        int maxProfit = 0;
        for(int i=0; i<sp.length; i++){
            if(bp < sp[i]){
                int profit = sp[i] - bp;
                maxProfit = Math.max(maxProfit, profit);
            } else{
                bp = sp[i];
            }
        }
        System.out.println(maxProfit);
    }
    public static void main(String[] args){
        int stockPrices[] = {7,1,5,3,6,4};
        BASS(stockPrices);
    }
}
