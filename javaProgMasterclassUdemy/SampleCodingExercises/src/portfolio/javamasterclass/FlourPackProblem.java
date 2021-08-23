package portfolio.javamasterclass;

public class FlourPackProblem {
    public static boolean canPack(int bigCount, int smallCount, int goal) {
        if (bigCount < 0 || smallCount < 0 || goal < 0) {
            return false;
        }
        int temp = bigCount * 5;
        if (temp + smallCount == goal) {
            return true;
        } else if ((temp >= goal && temp % goal == 0) ||
                (temp >= goal && goal % 5 <= smallCount)) {
            return true;
        } else if (smallCount >= goal) {
            return true;
        } else return temp + smallCount > goal && goal % temp <= smallCount;
    }
}
