// package patterns.advance_patterns;

public class hollow_pattern {
    public static void h_pattern(int r, int c){

   for(int i=1; i<=r; i++){
    for (int j=1; j<=c; j++){
        if(i==1 || i==r || j==1 || j==c){
            System.out.print("* ");
        }else{
            System.out.print("  ");
        }
    }
    System.out.println();
   }
}

public static void main(String[] args){
    h_pattern(5, 5);
}
}

