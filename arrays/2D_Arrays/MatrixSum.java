import java.util.Scanner;

public class MatrixSum {
    public static void findSum(int arr[][]){
        int sum = 0;
        for(int i =0; i<arr.length; i++){
            for(int j=0; j<arr.length; j++){
                sum += arr[i][j];
            }
        }
        System.out.println("Sum of matrix is: "+sum);
    }

    public static void main(String[] args){
        int matrix[][] = new int[3][3];
        int n = matrix.length;
        int m = matrix[0].length;
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < m; j++) {
                matrix[i][j] = sc.nextInt();
                }
                }
                findSum(matrix);
     }
}
