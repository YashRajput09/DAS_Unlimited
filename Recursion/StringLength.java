public class StringLength {
    public static void main(String[] args){
        String str = "yassh rajput";
        System.out.println(strLength(str, 0));
    }

    public static int strLength(String str, int i){
        if (i == str.length()) {
            return i;
        }
        return strLength(str, i+1);
    }
}
