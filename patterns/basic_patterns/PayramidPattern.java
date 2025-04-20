public class PayramidPattern {
    public static void PP(int num){
        for(int i=0;i<num;i++){
            for(int j=0; j<num-i; j++){
                System.out.print(" ");
            }
            for(int k=0; k<2*i-1; k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
        PP(6);
    }
}
