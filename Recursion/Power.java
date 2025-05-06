public class Power {
    public static void main(String[] args){
        System.out.println( power(2, 5));
    }

    public static int power(int x, int n){
        if(n == 0) return 1;
        return x * power(2, n-1);
        // int nm1 = power(2, n-1);
        // int xn = x * nm1;
        // return xn;
    }
}
