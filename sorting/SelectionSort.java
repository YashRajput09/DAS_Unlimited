public class SelectionSort {

    public static void SS(int arr[]){
        for(int i=0; i<arr.length-1; i++){
            int min = i;
            for(int j=i+1; j<arr.length; j++){
                if(arr[j]<arr[min]) {
                    min = j;    
                }

            }
            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }
    }
    public static void main(String[] args){
        // int arr[] = {5, 4, 1, 3, 2};
        int arr[] = {3, 6, 2, 1, 8, 7, 4, 5, 3, 1};
        SS(arr);
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
            }

    
    }
}
