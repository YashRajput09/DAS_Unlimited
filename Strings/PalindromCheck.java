public class PalindromCheck {
    public static boolean PC(String str){
        int n=str.length();
        for(int i=0; i<str.length()/2; i++){
            if(str.charAt(i) != str.charAt(n-i-1)){
                System.out.println("Not palindrom");
                return false;
            }
        }
        System.out.println("palindrom");
        return true;
    }
    public static void main(String[] args) {
        String str = "racecar";
        PC(str);
    }
}