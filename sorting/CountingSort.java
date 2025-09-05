public class CountingSort {
    public static void CS(int arr[]){
        int largest = Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++){
            if(arr[i] > largest){
                largest = arr[i];
            }
        }
        int count[] = new int[largest+1];

        for(int i=0; i<arr.length; i++){
            count[arr[i]]++;
        }

        int index=0;
        for(int i=0; i<count.length; i++){
            while(count[i] > 0){
                arr[index] = i;
                index++;
                count[i]--;
            }
        }
    }
    public static void main(String[] args){
        int arr[] = {1, 4, 1, 3 ,2 ,4, 3, 7};
        CS(arr);
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
            }

    }
}


// for Descending order
// public class CountingShort {
//     public static void CS(int arr[]){
//         int largest = arr[0];
//         // int largest = Integer.MAX_VALUE;
//         for(int i=0; i<arr.length; i++){
//             if(arr[i] > largest){
//                 largest = arr[i];
//             }
//         }
//         int count[] = new int[largest+1];

//         for(int i=0; i<arr.length; i++){
//             count[arr[i]]++;
//         }

//         int index=0;
//         // for(int i=0; i<count.length; i++){
//         for(int i=count.length -1; i>=0; i--){
//             while(count[i] > 0){
//                 arr[index] = i;
//                 index++;
//                 count[i]--;
//             }
//         }
//     }
//     public static void main(String[] args){
//         int arr[] = {1, 4, 1, 3 ,2 ,4, 3, 7};
//         CS(arr);
//         for(int i=0; i<arr.length; i++){
//             System.out.print(arr[i] + " ");
//             }

//     }
// }