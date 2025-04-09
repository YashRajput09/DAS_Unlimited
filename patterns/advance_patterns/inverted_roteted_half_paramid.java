// package patterns.advance_patterns;

public class inverted_roteted_half_paramid {
        public static void irhp(int n){
            for(int i=1; i<=n; i++){
                // print spaces
                for(int j=1; j<=n-i; j++){
                    System.out.print(" ");
                }
                // print stars 
                for(int j=1; j<=i; j++){
                    System.out.print("*");
                }
                System.out.println();
            }
        }

        public static void main(String[] args){
            irhp(5);
        }
}
