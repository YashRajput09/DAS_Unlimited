
public class MaxElement {
    public static void max(int arr[]){
        int max=Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        System.out.println("max element of the array: "+ max);
    }
    public static void main(String[] args){
        int arr[] = {1, 2, 3, -4, -1};
        max(arr);
    }
}
