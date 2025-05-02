public class CheckShortedArrOrNot {
    public static void main(String[] args){
        int arr[] = {1, 2, 8, 4 ,5};
        System.out.println( checkShortedArr(arr, 0));
    }

        public static boolean checkShortedArr(int arr[], int i){
            if(i == arr.length-1){
                return true;
            }
            if(arr[i] > arr[i+1]){
                return false;
            }

            return checkShortedArr(arr, i+1);
        }
}
