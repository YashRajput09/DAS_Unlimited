import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class chocolaProblem {
    public static void main(String args[]){
        Integer costHor[] = {1, 2};
        Integer costVer[] = {3};
        Arrays.sort(costHor, Collections.reverseOrder());
        Arrays.sort(costVer, Collections.reverseOrder());
        int h = 0, v = 0;
        int hp = 1, vp = 1;
        int cost = 0;

        while(h < costHor.length && v < costVer.length){
            if(costVer[v] <= costHor[h]){
                cost += (costHor[h] * vp);
                hp++;
                h++;
            } else{
                cost += (costVer[v] * hp);
                vp++;
                v++;
            }
        }

        while(h < costHor.length){
            cost +=(costHor[h] * vp);
            hp++;
            h++;
        }

        while(v < costVer.length){
            cost += (costVer[v] * hp);
            vp++;
            v++;
        }

        System.out.println("Minimum cost: "+ cost);
    }
}
