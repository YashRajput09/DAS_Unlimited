
public class SetIthBit {
    public static void SetBit(int n, int p){
        int bitMask = 1 << p;
        n = n | bitMask;
        System.out.println(n);
    }
    public static void main(String[] args){
        SetBit(10, 2);
    }
}
