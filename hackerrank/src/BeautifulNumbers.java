/*
You are given two numbers L and R. Your task is to determine the sum of all the beautiful numbers from
the range [L, R]. A number represents a beautiful number if it satisfies the following condition:
If the number becomes 1 at some point by replacing it repeatedly with the sum of squares of  its digits.
Note: If the number never becomes 1, then the provided number is not a beautiful number.
For further clarification, please refer to the explanation of the sample test case.
Example
Consider L=1, R=2. You have to determine the sum of all the beautiful numbers from the range [L, R].
Here the answer is 1 as 2 is not a beautiful number.

Function description:
Complete the solve function provided in the editor. This function takes the 2 parameters L and R, and
returns the sum of all the beautiful numbers from the range [L, R].

Constraints:
1 <= L <= R <= 10^6
* */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.HashSet;

public class BeautifulNumbers {
    static long[] resultArray = new long[1000005];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter wr = new PrintWriter(System.out);

        preProcessing();

        int T = Integer.parseInt(br.readLine().trim());
        for(int t_i = 0; t_i < T; t_i++)
        {

            String[] str = br.readLine().split(" ");
            int l = Integer.parseInt(str[0]);
            int r = Integer.parseInt(str[1]);

            long out_ = solve(l, r);
            System.out.println(out_);

        }

        wr.close();
        br.close();
    }

    static boolean isNumBeautiful(long num, HashSet<Long> hashSet) {
        while (true) {
            if (num == 1) {
                return true;
            } else if (hashSet.contains(num)) {
                return false;
            }

            hashSet.add(num);
            long temp = 0;
            while (num > 0) {
                temp += (num % 10) * (num % 10);
                num /= 10;
            }
            num = temp;
        }
    }

    static void preProcessing() {
        for (int i = 1; i <= 1000000; i++) {
            HashSet<Long> hashSet = new HashSet<>();
            if (isNumBeautiful(i, hashSet)) {
                resultArray[i] = i;
            }
        }

        for (int i = 1; i <= 1000000; i++) {
            resultArray[i] += resultArray[i - 1];
        }
    }

    static long solve(int l, int r){
        return resultArray[r] - resultArray[l - 1];
    }
}
