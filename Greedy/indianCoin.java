public class indianCoin {
    public static void main(String args[]){
        int coins[] = {1, 2, 5, 10, 20, 50, 100, 500, 2000};
        int amount = 590;
        
        int count = 0;
        for(int i=coins.length-1; i>=0; i--){
            if(coins[i] <= amount){
                while (coins[i] <= amount) {
                    count++;
                    amount -= coins[i];
                    System.out.print(coins[i]+ " ");
                }
            }
        }
        System.out.println();
        System.out.println("Count: "+ count);
    }
}
