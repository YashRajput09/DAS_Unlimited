public class MaxSubArraySum {
    public static void MSAS(int arr[]){
        int max = Integer.MIN_VALUE;
        for(int i=0; i<=arr.length; i++){
            for(int j=i; j<=arr.length; j++){
                int sum=0;
                for(int k=i; k<j; k++){
                    sum = sum + arr[k];
                }
               if(max< sum){
                max = sum;
               }
            }
        }
        System.out.print("max : "+ max);
    }
    public static void main(String[] args){
        // int arr[] = {1, -2, 6, -1, 3};
        int arr[] = {2, 4, 6, 8, 10};
        MSAS(arr);
    }
}
