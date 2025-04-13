public class MaxSubArraySumTwo {
    public static void MSAST(int arr[]) {
        int currSum = 0;
        int max = Integer.MIN_VALUE;
        int prefix[] = new int[arr.length];
        prefix[0] = arr[0];

        // calculate perfix array
        for (int i = 1; i < prefix.length; i++) {
            prefix[i] = prefix[i - 1] + arr[i];
        }

        for (int i = 0; i < prefix.length; i++) {
            int start = i;
            for (int j = i; j < prefix.length; j++) {
                int end = j;
                currSum = start == 0 ? prefix[end] : prefix[end] - prefix[start - 1];
            }
            if (currSum > max) {
                max = currSum;
        }
    }
    System.out.println("max : "+ max);
}

    public static void main(String[] args) {
        int arr[] = { 2, 4, 6, 8, 10 };
        MSAST(arr);
    }
}

