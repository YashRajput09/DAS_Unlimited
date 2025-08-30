import java.util.Arrays;

public class OptimiseCheckRepetedNumber {
    public static boolean CRN(int nums[]){
     int arr[] = new int[Arrays.stream(nums).max().getAsInt() + 1];
    for(int i=0; i<nums.length; i++){
        arr[nums[i]] = arr[nums[i]] + 1;
    }

    for(int i=0; i<arr.length; i++){
         if(arr[i] > 1){
            return true;
         }
        }
        return false;
    }
    public static void main(String[] args){
        int nums[] = {1, 2, 3, 1};
        // int nums[] = {1, 2, 3, 4};
        Boolean result =  CRN(nums);
        System.out.println(result); //Timecomplexity O(n) 
    }
}