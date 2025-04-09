public class NumberParamid {
    public static void NP(int n){
        for(int i=0; i<=n; i++){
            for(int j=0; j<=n-i; j++){
                System.out.print(" ");
            }
            for(int j=1; j<=i; j++){
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args){
        NP(5);
    }
}
