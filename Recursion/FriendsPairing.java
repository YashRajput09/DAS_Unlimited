public class FriendsPairing {
  public static void main(String[] args){
    System.out.println(FP(4));
  }   

  public static int FP(int n){
    // Base cases
    if(n == 0 || n == 1) return 1;
    if(n == 2 ) return 2;

    // if preson stand single then calculate for FP(n-1)
    // if preson stand in pair then calculate for FP(n-2),  choices is (n-1) 

    return FP(n-1) + (n-1) * FP(n-2); 
}
}
