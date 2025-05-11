public class NumsOrder {
    public static void main(String[] args){
        printDec(10);
        printInc(10);
    }

    public static int printDec(int n){
         if(n==1){
            System.out.print(n + " ");
            return n;
        }
        System.out.print(n+ " ");
        printDec(n-1);
        return n;
    }

    public static int printInc(int n){
        if(n==1){
            System.out.print(n+" ");
            return n;
        }
        printInc(n-1);
        System.out.print(n + " ");
        return n;
    }
}
