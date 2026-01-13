public class ElementSum{

    public static void sum(int arr[]){
        int sum = 0;
        for(int i=0; i<arr.length; i++){
            if(arr[i] == 6){
                while (arr[i] != 7) {
                    // continue;
                    i++;
                }
            } else{
                sum += arr[i];
            }
        }
        System.out.println(sum);
    }
    
    public static void main(String[] args) {
        // int arr[] = {1, 3, 5, 6, 99, 77, 7, 9};
        int arr[] = {6, 3, 5, 6, 99, 77, 77, 7};
        sum(arr);
    }
}