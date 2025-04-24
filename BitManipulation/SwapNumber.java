public class SwapNumber {
    public static void Swap(int a, int b){
        a = a ^ b;
        System.out.println(a+" "+b);
        b = a ^ b;
        System.out.println(a+ " "+b);
        a = a ^ b;
        System.out.println(a+" "+ b);
    }
    public static void main(String[] args) {
        Swap(2, 3);
    }
}
