public class ClearRangeOfBits{
    public static int ClearBits(int n, int s, int e){
        int a = (1) << (e+1);
        int b = (1 << s) -1;
        int bitMask = a | b;
        return n & bitMask;
    }
    public static void main(String[] args) {
       System.out.println(ClearBits(10, 2, 7)); 
    }
}