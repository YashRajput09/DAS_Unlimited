import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class maxActivities {
    public static void main(String args[]){
        int start[] = {1, 3, 0, 5, 8, 5};
        int end[] = {3, 5, 1, 6, 2, 8};
        // int end[] = {2, 4, 6, 7, 9, 9};

        // sorting end time
        int activities[][] = new int[start.length][3];
        for(int i=0; i<start.length; i++){
            activities[i][0] = i;
            activities[i][1] = start[i];
            activities[i][2] = end[i];
        }

        // lambda function -> we use for sorting 
        Arrays.sort(activities, Comparator.comparingDouble(s -> s[2]));

        ArrayList<Integer> ans = new ArrayList<>();
        int maxAct = 1;
        ans.add(activities[0][0]);
        int lastIdx = activities[0][2];
        for(int i=1; i<activities.length; i++){
            if(activities[i][1] >= lastIdx){
                maxAct++;
                ans.add(activities[i][0]);
                lastIdx = activities[i][2];
            }
        }
        System.out.println("Max Activities: "+ maxAct);
        for(int i=0; i<ans.size(); i++){
            System.out.print("A"+ ans.get(i) + " ");
        }
    }
}
