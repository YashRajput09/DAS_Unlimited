public class TrappingRainwater {
    public static void TR(int arr[]){
        int leftMaxBoundry[] = new int[arr.length];
        leftMaxBoundry[0] = arr[0];
        for(int i=1; i<arr.length; i++){
            leftMaxBoundry[i] = Math.max(leftMaxBoundry[i-1], arr[i]);
        }

        int rightMaxBoundry[] = new int[arr.length];
        rightMaxBoundry[arr.length-1] = arr[arr.length-1];
        for(int i=arr.length-2; i>=0; i--){
           rightMaxBoundry[i] = Math.max(arr[i], rightMaxBoundry[i+1]);
        }

        int water = 0;
        for(int i=0; i<arr.length; i++){
            int min = Math.min(leftMaxBoundry[i], rightMaxBoundry[i]);
             water += min - arr[i];
            }
            System.out.println("Water trapped: " + water);
    }
    public static void main(String[] args){
        int height[] = {4, 2, 0, 6, 3, 2, 5};
        TR(height);
    }
}
