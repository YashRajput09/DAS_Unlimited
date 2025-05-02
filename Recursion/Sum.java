public class Sum {
    public static void main(String[] args){
        System.out.print(calcSum(5));
    }
    public static int calcSum(int n){
        if (n==1) {
            return 1;
        }
        int nm1 = calcSum(n-1);
        n = n + nm1;
        return n;
    }
}
