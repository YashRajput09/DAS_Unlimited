public class ReverseTriangle {
    public static void main(String[] args){
        int n=5;
        for(int i=1; i<=5; i++){
            for(int j=1; j<=(n-i+1); j++){
                System.out.print('*');
            }
            // for(int j=5; j>=i; j--){
            //     System.out.print('*');
            // }
            System.out.println();
        }
    }
}
