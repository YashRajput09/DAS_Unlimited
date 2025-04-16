public class ArrayLeftRotationByOne {
    public static void ALRBO(int arr[]){
        int first = arr[0];
        for(int i=1 ;i<arr.length; i++){
            arr[i-1] = arr[i];
        }
        arr[arr.length-1] = first;
    }
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5};
        ALRBO(arr);
        for(int i=0 ;i<arr.length; i++){
            System.out.print(arr[i] + " ");
            }
            
    }
}
