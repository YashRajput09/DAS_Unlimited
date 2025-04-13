import java.util.*;
public class SubArrays {
    public static void SA(int arr[]){
        int totalSubArrays = 0;
        int sum = 0;
        for(int i=0; i<=arr.length; i++){
            for(int j=i; j<=arr.length; j++){
                for(int k=i; k<j; k++){
                    System.out.print("["+arr[k]+"]");
                    sum = sum + arr[k];
                }
                totalSubArrays++;
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("Total SubArrays: "+totalSubArrays);
        System.out.println("Total sum: "+sum);
    }

    public static void main(String[] args) {
        int arr[] = {2, 4, 6, 8, 10};
        SA(arr);
    }
}
