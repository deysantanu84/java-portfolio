import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

/*
Consider a part of the positive number line starting at 0 and ending at 10^9. You start at 0.
There are N tasks that you can perform. The ith task is located at point Li(integer) and requires time Ti(integer)
to be performed. To perform the ith task you have to reach point Li and spend time Ti at that location.
It takes one second to travel one unit on the path i.e. going from 1 to 3 will take 2 seconds.
You are given T seconds of time, in this time you have to perform as many tasks as you can AND return to the start
position. Find the maximum number of tasks you can perform in time T.

Example:
Consider n=3, t=10, task[] = [[1, 3], [2, 2]]
If we perform the 1st task total time consumed is 1 (to travel) + 3 (to do the task) = 4.
The remaining time is 10 - 4 = 6.
Now if we perform the 2nd task consecutively, the total time taken is 1 (to travel) + 2 (to do the task) = 3.
The time remaining is 6 - 3 = 3.
Now if we return from 2 to 0, total time taken is 2. The remaining time is 3 - 2 = 1.
Therefore, we can safely complete both tasks in a given time. So the answer is 2.

Constraints:
1 <= N <= 10^5
0 <= T <= 10^8
0 <= Li, Ti <= 10^9
* */
public class Hurry {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter wr = new PrintWriter(System.out);
        String[] line = br.readLine().split(" ");
        int n = Integer.parseInt(line[0]);
        int t = Integer.parseInt(line[1]);
        int[][] task = new int[n][2];
        for(int i_task = 0; i_task < n; i_task++)
        {
            String[] arr_task = br.readLine().split(" ");
            for(int j_task = 0; j_task < arr_task.length; j_task++)
            {
                task[i_task][j_task] = Integer.parseInt(arr_task[j_task]);
            }
        }

        int out_ = solve(n, t, task);
        System.out.println(out_);

        wr.close();
        br.close();
    }

    static int solve(int n, int t, int[][] task){
        int result = 0;
        int travelTimeTaken = 2 * task[n-1][0];
        int timeRemaining = t - travelTimeTaken;
        for (int i = 0; i < n; i++) {
            if (task[i][1] <= timeRemaining) {
                result += 1;
            }
        }
        return result;
    }
}
