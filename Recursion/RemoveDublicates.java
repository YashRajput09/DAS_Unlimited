public class RemoveDublicates {
    public static void main(String[] args){
        String str = "yaashh";
        remove(str, 0, new StringBuilder(""), new boolean[26]);
    }
    public static void remove(String str, int i, StringBuilder newStr, boolean map[]){
        if(i == str.length()){
            System.out.println(newStr);
            return;
        }

        char currChar = str.charAt(i);
        if(map[currChar - 'a'] == true){
            remove(str, i+1, newStr, map);
        } else{
            map[currChar - 'a'] = true;
            remove(str, i+1, newStr.append(currChar), map);
        }
    }
}
