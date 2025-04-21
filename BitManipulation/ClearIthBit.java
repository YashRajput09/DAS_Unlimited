public class ClearIthBit {
    public static void ClearBit(int n, int p){
        int bitMask = ~(1 << p);
        int result = n & bitMask;
        System.out.println(result);
    }
    public static void main(String[] args){
        ClearBit(10, 1);
    }
}
