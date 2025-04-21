public class PowerOfTwoOrNot {
    public static boolean Power(int n){
        return ((n&(n-1)) == 0);  
    }
    public static void main(String[] args){
       System.out.println(Power(8)); 
    }
}
