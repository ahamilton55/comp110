public class Date {
    private int year;
    private int month;
    private int day;

    private int[] monthDays = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    // Constructor that takes in a year, month and day
    public Date (int y, int m, int d) {
        setYear(y);
        setMonth(m);
        setDay(d);
    }

    // Setter for the year
    public void setYear(int y) {
        if (validYear(y)) {
            year = y;
        }
    }

    // Validate that the provided year is within bounds
    private boolean validYear(int y) {
        if (y >= 0 && y <= 3000) {
            return true;
        }
        return false;
    }

    // Returns the value for the year
    public int getYear() {
        return year;
    }

    // Determines if the provided year is a leap year
    // This is a static method so it can be used without instantiating a Date object
    public static boolean isLeapYear(int y) {
        if (y % 4 != 0) {
            return false;
        } else if (y % 100 != 0) {
            return true;
        } else if (y % 400 != 0) {
            return false;
        } 
        return true;
    }

    // Set the value for the private month variable
    public void setMonth(int m) {
        if (validMonth(m)) {
            month = m;
        }
    }

    // Checks to see if the month is within bounds
    private boolean validMonth(int m) {
        if (m >= 1 && m <= 12) {
            return true;
        }
        return false;
    }

    // Returns the value of the month variable to the user
    public int getMonth() {
        return month;
    }

    // Sets the day variable
    public void setDay(int d) {
        if (validDay(d)) {
            day = d;
        }
    }

    // Checks to see if a valid day was provided by the user
    private boolean validDay(int d) {
        if (isLeapYear(year) && month == 2) {
            if (d >= 0 && d <= 29) {
                return true;
            }
            return false;
        }
        if (d >= 0 && d <= monthDays[month-1]) {
            return true;
        }
        return false;
    }

    // Returns the value of the day varaible to the user
    public int getDay() {
        return day;
    }

    // Creates a string representation of the object to be returned to the user
    public String toString() {
        return String.format("%d/%02d/%02d", year, month, day);
    }

    /*public static void main(String[] args) {
        Date d = new Date(2017, 11, 8);
        System.out.println(d.toString());
    }*/
}