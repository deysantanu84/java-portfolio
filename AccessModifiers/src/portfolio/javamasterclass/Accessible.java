package portfolio.javamasterclass;

interface Accessible { // package-private
    int SOME_CONSTANT = 100; // all interface variables are public static final
    public void methodA(); // public method
    void methodB(); // all interface methods are automatically public
    boolean methodC(); // all interface methods are automatically public
}
