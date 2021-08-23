package portfolio.javamasterclass;

public class NumberOfDaysInMonth {
    public static boolean isLeapYear(int year) {
        if(year < 1 || year > 9999) {
            return false;
        }
        else if(year % 4 == 0) {
            if(year % 100 == 0) {
                if(year % 400 == 0) {
                    return true;
                }
            } else {
                return true;
            }
        }

        return false;
    }

    public static int getDaysInMonth(int month, int year) {
        if ((month < 1 || month > 12) || (year < 1 || year > 9999)) {
            return -1;
        } else {
            int numberOfDays;
            switch (month) {
                case 4: case 6: case 9: case 11:
                    numberOfDays = 30;
                    break;

                case 2:
                    if (isLeapYear(year))
                        numberOfDays = 29;
                    else
                        numberOfDays = 28;
                    break;

                default:
                    numberOfDays = 31;
                    break;

            }
            return numberOfDays;
        }
    }
}
