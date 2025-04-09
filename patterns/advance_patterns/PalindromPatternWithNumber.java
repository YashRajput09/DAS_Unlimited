public class PalindromPatternWithNumber {
    public static void PPWN(int n){
        for(int i=1; i<=n; i++){
            // spaces
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }

            // decending order
            for(int k=i; k>=1; k--){
                System.out.print(k);
            }

            // accesnding order
            for(int k=2; k<=i; k++){
                System.out.print(k);
            }
            System.out.println();
        }
    }

    public static void main(String[] args){
        PPWN(5);
    }
    
}