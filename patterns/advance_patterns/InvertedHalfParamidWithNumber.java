// package patterns.advance_patterns;

public class InvertedHalfParamidWithNumber {
    public static void ihpwn(int n){
        for (int i=1; i<=n; i++){
            for(int j=1; j<=n-i+1; j++){
                System.out.print(j+" ");
            }
            System.out.println(" ");
        }

    }
    public static void main(String[] args){
        ihpwn(5);
    }
}
