public class ContiguousSubstringCount{
    public static void main(String[] args){
        String str = "abcab";
        int n = str.length();
        System.out.println(countSubstrings(str, 0, n-1, n));
    }

    public static int countSubstrings(String str, int i, int j, int n){
        if(n == 1){
            return 1;
        }
        
        if(n < 0){
            return 0;
        }

        int res = countSubstrings(str, i+1, j, n-1) +
                  countSubstrings(str, i, j-1, n-1) - 
                  countSubstrings(str, i+1, j-1, n-2);

        if(str.charAt(i) == str.charAt(j)){
            res++;
        }
        return res;
    }
}