public class Hello {
    public static void main(String[] args) {
        System.out.println("Hello World");

        int myFirstNumber = 10 + 5;
        int mySecondNumber = 12;
        int myThirdNumber = myFirstNumber * 2;
        int myTotal = myFirstNumber + mySecondNumber + myThirdNumber;

        System.out.println("myFirstNumber"); // string
        System.out.println(myFirstNumber);
        System.out.println(myTotal);

        int myLastOne = 1000 - myTotal;
        System.out.println(myLastOne);
    }
}
