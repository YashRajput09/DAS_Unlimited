public class TransposeMatrix {
    // public static void TM(int matrix[][]){
    //     for(int i=0; i<matrix.length; i++){
    //         for(int j=0; j<matrix[0].length; j++){
    //             int temp = matrix[i][j];
    //             matrix[i][j] = matrix[j][i];
    //             matrix[j][i] = temp;
    //         }
    //     }
    // }

    public static void TM(int matrix[][]){
        int row = 2, col = 3;
        int[][] transposed = new int[col][row];
        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                transposed[j][i] = matrix[i][j];
        }
    }
    for(int i=0; i<transposed.length; i++){
        for(int j=0; j<transposed[0].length; j++){
            System.out.print(transposed[i][j] + " ");
            }
            System.out.println();
            }

}
    public static void main(String[] args){
        int matrix[][] = {
            {11, 12, 13},
            {21, 22, 23}
        };
        TM(matrix);
        
    }
}
