package portfolio.javamasterclass;

public class Main {
    public static void main1(String[] args) {
        Account timsAccount = new Account("Tim");
        timsAccount.deposit(1000);
        timsAccount.withdraw(500);
        timsAccount.withdraw(-200);
        timsAccount.deposit(-20);
        timsAccount.calculateBalance();

        System.out.println("Balance in account is " + timsAccount.getBalance());
    }

    public static int multiplier = 7;

    public static void main2(String[] args) {
        StaticTest firstInstance = new StaticTest("Ist Instance");
        System.out.println(firstInstance.getName() + " is instance number " + StaticTest.getNumInstances());

        StaticTest secondInstance = new StaticTest("2nd Instance");
        System.out.println(secondInstance.getName() + " is instance number " + StaticTest.getNumInstances());

        StaticTest thirdInstance = new StaticTest("3rd Instance");
        System.out.println(thirdInstance.getName() + " is instance number " + StaticTest.getNumInstances());

        int answer = multiply(6); // non-static methods or fields cannot be accessed from a static method
        System.out.println("The answer is " + answer);
        System.out.println("Multiplier is " + multiplier);
    }

    public static int multiply(int number) {
        return number * multiplier;
    }

    public static void main3(String[] args) {
        SomeClass one = new SomeClass("one");
        SomeClass two = new SomeClass("two");
        SomeClass three = new SomeClass("three");

        System.out.println(one.getInstanceNumber());
        System.out.println(two.getInstanceNumber());
        System.out.println(three.getInstanceNumber());

        System.out.println(Math.PI); // public static final double

        int pw = 674312;
        Password password = new Password(pw);
        // Password password = new ExtendedPassword(pw);
        password.storePassword();
        password.letMeIn(pw);
        password.letMeIn(123456);
    }

    public static void main(String[] args) {
        System.out.println("Main method called");
        SIBTest test = new SIBTest();
        test.someMethod();
        System.out.println("Owner is " + SIBTest.owner);
    }
}