public class FirstLatterCapital {
    public static void CapitalLatter(String str){
        StringBuffer sb = new StringBuffer("");
        char ch = Character.toUpperCase(str.charAt(0));
        sb.append(ch);
        for(int i=1; i<str.length(); i++){
            if (str.charAt(i) == ' ' && i<str.length()-1) {
                sb.append(str.charAt(i));
                i++;
                sb.append(Character.toUpperCase(str.charAt(i)));
            }else{
                sb.append(str.charAt(i));
            }
        }
        System.out.print(sb);
    }
    public static void main(String[] args){
        String str = "radhe radhe";
        CapitalLatter(str);

    }
}
