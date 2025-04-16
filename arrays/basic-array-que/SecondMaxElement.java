
public class SecondMaxElement {
    public static void SecMax(int arr[]){
        int max = Integer.MIN_VALUE;
        int secmax = Integer.MIN_VALUE;
        
        for(int i=0; i<arr.length; i++){
            if(arr[i] > max){
                // secmax = max;
                max = arr[i];
            } else if(arr[i] < max && arr[i] > secmax){
                secmax = arr[i];
            } else{
                // do nothing
            }
        }
        System.out.println("Second max element in this array : "+ secmax);
    }

    public static void main(String[] args){
        // int arr[] = {1, 2, 9, 4, -3}; 
        int arr[] = {-1, -2, -9, -4, -3};
        SecMax(arr);
    }
}
