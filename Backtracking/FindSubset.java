public class FindSubset {
    public static void main(String[] srgs){
        String str = "abc";
        subSet(str, 0, "");    
    }

    public static void subSet(String str,int i, String ans){
        if(i == str.length()){
            System.out.println(ans);
            return;
        }

        subSet(str, i+1, ans+str.charAt(i)); //yes choice
        subSet(str, i+1, ans); //no choice
    }


}
