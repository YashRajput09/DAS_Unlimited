import java.util.*;

public class Linear_search {

    public static int LS(String heroes[], String search){
        for(int i = 0; i < heroes.length; i++){
            if(heroes[i].equals(search)){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args){
        String heroes[] = {"Iron man", "captain america", "spiderman", "thor"};
        String search = "spiderman";
        int result = LS(heroes, search);
        
        if(result != -1){
            System.out.println("Element is present at index " + result);
        } else {
            System.out.println("Element is not present in array");
        }
    }
}
