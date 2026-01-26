import java.util.ArrayList;
import java.util.Collections;

public class jobSequence {

    static class Job {
        int deadline;
        int profit;
        int id;

        Job(int id, int deadline, int profit) {
            this.id = id;
            this.deadline = deadline;
            this.profit = profit;
        }
    }

    public static void main(String args[]) {

        int jobsInfo[][] = {{4, 20}, {1, 10}, {1, 40}, {1, 30}};
        ArrayList<Job> jobs = new ArrayList<>();

        // FIXED: loop condition
        for (int i = 0; i < jobsInfo.length; i++) {
            jobs.add(new Job(i + 1, jobsInfo[i][0], jobsInfo[i][1]));
        }

        // Sort by profit descending
        Collections.sort(jobs, (a, b) -> b.profit - a.profit);

        ArrayList<Integer> seq = new ArrayList<>();
        int time = 0;

        for (int i = 0; i < jobs.size(); i++) {
            Job curr = jobs.get(i);
            if (curr.deadline > time) {
                seq.add(curr.id);
                time++;
            }
        }

        // Output
        System.out.println("Max jobs: " + seq.size());
        for (int id : seq) {
            System.out.print("J" + id + " ");
        }
    }
}
