public class TilingProblem {
    public static void main(String[] args){
        System.out.println(ways(4));
    }
    public static int ways(int n){
      if(n==0 || n==1) return 1;
      int nm1 = ways(n-1);
      int nm2 = ways(n-2);
      return nm1 + nm2;
    }
}
