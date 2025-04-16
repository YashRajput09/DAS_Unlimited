public class ArraySum {
    public static void sum(int nums[]){
        int sum = 0;
        for(int i=0; i<nums.length; i++){
            sum = sum + nums[i];
        }
        System.out.println("Sum of array elements: " + sum);
    }
    public static void main(String[] args){
        int nums[] = {1, 2, 3, 4, 5};
        sum(nums);
    }
}
