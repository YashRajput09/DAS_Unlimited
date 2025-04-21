
public class getIthBit {
    public static void IthBit(int n, int p){
        int bitMask = 1<<p;
        if((n & bitMask) == 0){
            System.out.println("0");
        }else{
            System.out.println("1");
        }
    }
    public static void main(String[] args){
        IthBit(10, 2);
    }
}
