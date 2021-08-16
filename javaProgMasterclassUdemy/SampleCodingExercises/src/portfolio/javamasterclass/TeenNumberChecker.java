package portfolio.javamasterclass;

public class TeenNumberChecker {
    public static boolean hasTeen(int A, int B, int C) {
        return isTeen(A) || isTeen(B) || isTeen(C);
    }

    public static boolean isTeen(int X) {
        return (13 <= X && X <= 19);
    }
}
