public class Fibonacci {
    public static void main(String[] args){
        System.out.println(fib(15));
    }

    public static int fib(int n){
        if(n == 0 || n == 1){  // base cases
            return n;
        }

        int nm1 = fib(n-1);
        int nm2 = fib(n-2);
        return nm1 + nm2;
    }
}
