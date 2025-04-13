import java.util.*;

public class BinarySearch {
    public static int BS(int ar[], int target){
       int st=0; 
       int end = ar.length - 1;
       while(st <= end){
        int mid = (st + end)/2;
        if (ar[mid] == target) {
            return mid;
        }else if (ar[mid] < target) {
             st = mid + 1;
        }else{
             end = mid - 1;
        }
       }
       return -1; //not found

    }
        public static void main(String[] args){
            int arr[] = {8, 4, 1, 3, 6, 6, 4, 1};
            Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

           int result =  BS(arr, 3);
           System.out.println(result);
        }
}
