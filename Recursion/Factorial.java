public class Factorial {
    public static void main(String[] args){
        System.out.print(fact(5));
    }

    public static int fact(int n){
        if(n==0){
            return 1;
        }
        int nm1 = fact(n-1);
         n = n * nm1;
        return n ;
    }
}
