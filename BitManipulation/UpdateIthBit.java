public class UpdateIthBit {
    public static int ClearBit(int n, int p){
        int bitMask = ~(1 << p);
        n = n & bitMask;
        return n;
    }
     public static int SetBit(int n, int p){
        int bitMask = 1 << p;
        n = n | bitMask;
            return n;
     }

     public static int UpdateBit(int n, int p, int newBit){
    // if (newBit == 0) {
    //     return ClearBit(n, p);
    // }else{
    //     return SetBit(n, p);
    // }
    

        n = ClearBit(n, p);
        int bitMask = newBit << p;
        n = n | bitMask;
        return n;

     }
    public static void main(String[] args){
       System.out.println(UpdateBit(10, 2, 1));
    }
}
