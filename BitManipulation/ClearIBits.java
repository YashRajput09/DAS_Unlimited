public class ClearIBits {
    public static void ClearBits(int n, int p){
        int bitMask = ~(0) << p;
        int result = n & bitMask;
        System.out.println(result);
    }
    public static void main(String[] args){
        ClearBits(15, 2);

    }
}
