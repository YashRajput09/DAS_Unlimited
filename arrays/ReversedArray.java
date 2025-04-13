import java.util.*;

public class ReversedArray {

    public static void RA(int arr[]){
        int start=0;
        int end=arr.length-1;
        while(start < end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
    public static void main(String[] args) {
        int array[] = {7, 6, 0, 2, 8, 1};

        RA(array);
       for(int i=0; i<array.length; i++){
         System.out.print(array[i]+" ");
       }

    }
}
