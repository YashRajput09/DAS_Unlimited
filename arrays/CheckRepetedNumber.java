public class CheckRepetedNumber {
    public static Boolean CRN(int nums[]){
        for(int i=0; i<nums.length; i++){
            for(int j=i+1; j<nums.length; j++){
                if(nums[i] == nums[j]){
                    //  System.out.println("True");
                     return true;
            }
        }
    }
    //  System.out.println("false");
     return false;
}
    public static void main(String[] args){
        // int nums[] = {1, 2, 3, 1};
        int nums[] = {1, 2, 3, 4};
        Boolean result =  CRN(nums);
        System.out.println(result); //Timecomplexity O(n2) 
     }
}
