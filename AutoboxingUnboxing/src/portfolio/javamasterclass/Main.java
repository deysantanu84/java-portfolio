package portfolio.javamasterclass;

import java.util.ArrayList;

class IntClass {
    private int myValue;

    public IntClass(int myValue) {
        this.myValue = myValue;
    }

    public int getMyValue() {
        return myValue;
    }

    public void setMyValue(int myValue) {
        this.myValue = myValue;
    }
}

public class Main {

    public static void main1(String[] args) {
        String[] strArray = new String[10];
        int[] intArray = new int[10];

        ArrayList<String> strArrayList = new ArrayList<String>();
        strArrayList.add("Tim");

        ArrayList<IntClass> intClassArrayList = new ArrayList<IntClass>();
        intClassArrayList.add(new IntClass(54));
        Integer integer = new Integer(54);
        Double doubleValue = new Double(12.25);

        ArrayList<Integer> intArrayList = new ArrayList<Integer>();
//        for (int i = 0; i <= 10; i++) {
//            intArrayList.add(Integer.valueOf(i));
//        }
//
//        for (int i = 0; i <= 10; i++) {
//            System.out.println(i + " --> " + intArrayList.get(i).intValue());
//        }

        Integer myIntValue = 56; // Integer.valueOf(56);
        // int myInt = myIntValue; // myInt.intValue();
        int myInt = myIntValue.intValue(); // myInt.intValue();

        ArrayList<Double> myDoubleValues = new ArrayList<Double>();
        for (double dbl = 0.0; dbl <= 10.0; dbl += 0.5) {
            //myDoubleValues.add(Double.valueOf(dbl));
            myDoubleValues.add(dbl);
        }

        for (int i = 0; i < myDoubleValues.size(); i++) {
            //double value = myDoubleValues.get(i).doubleValue();
            double value = myDoubleValues.get(i);
            System.out.println(i + " --> " + value);
        }
    }

    public static void main(String[] args) {
        Bank bank = new Bank("State Bank Of India");

        if (bank.addBranch("Varthur")) {
            System.out.println("Varthur branch created");
        }

        bank.addCustomer("Varthur", "Santanu", 5000.50);
        bank.addCustomer("Varthur", "Tom", 15000.50);
        bank.addCustomer("Varthur", "Jon", 50000.50);

        if (bank.addBranch("Gunjur")) {
            System.out.println("Gunjur branch created");
        }

        bank.addCustomer("Gunjur", "Kim", 12000);
        bank.addCustomer("Gunjur", "Bob", 10000);

        bank.addCustomerTransaction("Gunjur", "Kim", 2000);
        bank.addCustomerTransaction("Varthur", "Tom", 1000);
        bank.addCustomerTransaction("Varthur", "Santanu", 2500);

        bank.listCustomers("Varthur", false);
        bank.listCustomers("Gunjur", false);

        if (bank.addBranch("Whitefield")) {
            System.out.println("Whitefield branch created");
        }

        if (!bank.addCustomer("Whitefield", "Brian", 5000)) {
            System.out.println("Error Whitefield branch does not exist");
        }

        if (!bank.addBranch("Varthur")) {
            System.out.println("Varthur branch already exists");
        }

        if (!bank.addCustomerTransaction("Varthur", "Jack", 1500)) {
            System.out.println("Customer does not exist in this branch");
        }

        if (!bank.addCustomer("Gunjur", "Bob", 4000)) {
            System.out.println("Customer Bob already exists");
        }
    }
}
