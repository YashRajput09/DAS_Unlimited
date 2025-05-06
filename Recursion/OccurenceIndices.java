public class OccurenceIndices {
    public static void main(String[] args){
        int arr[] = {3, 2, 4, 5, 6, 2, 7, 2, 2};
        int key = 2;
        indices(arr, 0, key);
    }

    public static void indices(int arr[], int i, int key){
        if(i == arr.length){
            return;
        }
        if(arr[i] == key){
            System.out.print(i); 
        }
        indices(arr, i+1, key);
    }
}
