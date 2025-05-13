public class MergeSort {
    public static void main(String[] args){
        int arr[] = {6, 3, 9, 5, 2, 8};
        sorting(arr, 0, arr.length-1);
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
    int mid = si+(ei-si)/2; // or (si + ei)/2
    sorting(arr, si, mid);
    sorting(arr, mid+1, ei);
    merge(arr, si, mid, ei);
   }

   public static void merge(int arr[], int si, int mid, int ei){

    // merge and store elements to temp array
    int temp[] = new int[ei-si+1];
    int i = si; //index for 1st sorted part 
    int j = mid+1; //index for 2nd sorted part
    int k = 0; //index for temp
    while (i<=mid && j<=ei){
        
    if (arr[i] < arr[j]) {
        temp[k] = arr[i];
        i++;
    } else{
        temp[k] = arr[j];
        j++;
    }
    k++;
    }

    // for remaining elements of left array
    while (i <= mid) {
        temp[k++] = arr[i++];
    }

    // for remaining elements of rigth array
    while (j <= ei) {
        temp[k++] = arr[j++];
    }

    //copy temp arr to original array
    for(k=0, i=si; k<temp.length; k++, i++){
        arr[i] = temp[k];
    }
    
   }
}
