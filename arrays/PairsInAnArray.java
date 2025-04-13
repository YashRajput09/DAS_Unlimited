import java.util.*;

public class PairsInAnArray{

    public static void PIAA(int arr[]){
        for(int i=0; i<arr.length; i++){
            for(int j=i+1; j<arr.length; j++){
                System.out.print("("+arr[i]+","+arr[j]+")"+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        // int array[] = {1, 2, 3, 4, 5};
        int array[] = {2, 4, 6, 8, 10};

        PIAA(array);
    }
}