public class BubbleShort {
    public static void BS(int arr[]){
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr.length-i-1; j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }

    }
    public static void main(String[] args){
        // int arr[] = {5, 4, 1, 3, 2};
        int arr[] = {3, 6, 2, 1, 8, 7, 4, 5, 3, 1};
        BS(arr);
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
            }

    }
}
