
public class ShortestPath {
    public static void SP(String path){
        int x = 0;
        int y = 0;
        for(int i=0; i<path.length(); i++){
            if(path.charAt(i) == 'E'){
                x++;
            }else if(path.charAt(i) == 'W'){
                x--;
            }else if(path.charAt(i) == 'N'){
                y++;
            }else{
                y--;
            }
            
        }
        int x2 = x * x;
        int y2 = y * y;
        float displacement = (float)Math.sqrt(x2 + y2);
        System.out.println(displacement);
        // return displacement;
    }
    public static void main(String[] args){
        String path = "WNEENESENNN";
        SP(path);
    }
}
