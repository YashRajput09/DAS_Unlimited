public class KadaneAlgorithmMaxSubArrSum{
    public static int maxSubArray(int[] arr) {
        int max = Integer.MIN_VALUE;
        int currSum = 0;
        for (int i = 0; i < arr.length; i++) {
        currSum = currSum + arr[i];
        if (currSum < 0) {
           currSum = 0;
        }
        if (currSum > max) {
            max = currSum;
        }
    }
    return max;
}
public static void main(String[] args) {
    int[] arr = {-2, -3, 4, -1, -2, 1, 5, -3};
    int result = maxSubArray(arr);
    System.out.println("max : "+ result);
    }
}