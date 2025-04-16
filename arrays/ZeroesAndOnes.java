public class ZeroesAndOnes {
    public static void ZAO(int arr[]){
        int first = 0;
        int last = arr.length-1;
        // System.out.println(last);
        while (first < last) {
            if(arr[first] == 0){
        first++;
        } else if(arr[last] == 1){
            last--;
        }else {
            int temp = arr[first];
            arr[first] = arr[last];
            arr[last] = temp;
            first++;
            last--;
        }
    }
    }
    public static void main(String[] args){
        int[] arr = {1, 0, 1, 0, 1, 0, 1};
        ZAO(arr);
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
