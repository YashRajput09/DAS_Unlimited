public class QuickSort {
    public static void main(String[] args){
        int arr[] = {6, 3, 9, 8, 2, 5};
        sorting(arr, 0, arr.length-1);

        // print array elements
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]);
        }
    }

    public static void sorting(int arr[], int si, int ei){
        // base case
        if(si >= ei){
            return;
        }

        // work
        int pIdx = partition(arr, si, ei);
        sorting(arr, si, pIdx-1); //for left part of array
        sorting(arr, pIdx+1, ei); //for right part of array
    }

    public static int partition(int arr[], int si, int ei){
        int pivot = arr[ei];
        int i = si-1; //to make place for smaller element than pivot element

        for(int j=si; j<ei; j++){
            if(arr[j] <= pivot){
                i++;
                // swap
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }
        i++;
        // swap for pivot element
        int temp = pivot;
        arr[ei] = arr[i];
        arr[i] = temp;
        return i;
    }
}
