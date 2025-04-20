public class CountElementAppearanceNo {
    public static void CountElement(int matrix[][], int key){
        int count=0;
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[i].length; j++){
                if(matrix[i][j] == key){
                    count++;
                    }
                    }   
        }
        System.out.println("Count of " + key + " is " + count);
    }
    public static void main(String[] args){
        int matrix[][] = {{4, 7, 8}, 
                          {8, 8, 7}};
        CountElement(matrix, 8);
    }
}
