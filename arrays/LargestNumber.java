import java.util.*;;
public class LargestNumber {
    public static int LGN(int num[]){
        int max = Integer.MIN_VALUE; //-Infiity
        int min = Integer.MAX_VALUE; //+Infinity
        for(int i = 0; i< num.length; i++){
            if(num[i]>max){
                max = num[i];
            }
            // return max;
        }
        System.out.println("max : "+max);
        for(int i=0; i< num.length; i++){
            if(num[i]<min){
                min = num[i];
            }
            
        }
        System.out.println("min : "+min);
        return 1;
    }

    public static void main(String[] args){
        int nums[] = {1, 6, 3, 4, 9, 0};

        int result = LGN(nums);
        // System.out.println(result);
    }

}
