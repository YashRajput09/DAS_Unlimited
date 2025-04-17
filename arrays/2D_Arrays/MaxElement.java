import java.util.Scanner;

public class MaxElement {
    public static void findMax(int arr[][]) {
        int max = Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++){
            for (int j=0; j<arr.length; j++){
                if(arr[i][j] > max ){
                    max = arr[i][j];
                }
            }
        }
        System.out.print(max+" ");
    }
    public static void main(String[] args){
         int matrix[][] = new int[3][3];
         int n = matrix.length; 
         int m = matrix[0].length;
         Scanner sc =  new Scanner(System.in);
         for(int i=0; i<n; i++){
            for (int j=0; j<m; j++){
                matrix[i][j] = sc.nextInt();
            }
         } 
         findMax(matrix);
    }
}
