public class ConvertToString {
    static String digits[] = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
    public static void main(String[] args) {

        numbers(1947);
    }

    public static void numbers(int n){
        if(n == 0){
            return;
        }
        int lastDigit = n%10;
        numbers(n/10);
        System.out.print(digits[lastDigit] + " ");
    }
}
