public class Time {
    private int hour;
    private int minute;
    private int second;

    // Time constructor that allows the caller to set the hour and minute variables.
    // The second variable is defaulted to 0
    public Time(int h, int m) {
        setHour(h);
        setMinute(m);
    }

    // Time constructor that allows the caller to set the hour, minute and second variables
    public Time(int h, int m, int s) {
        setHour(h);
        setMinute(m);
        setSecond(s);
    }

    // Returns the hour variable to the caller
    public int getHour() {
        return hour;
    }

    // Sets the hour variable after checking bounds
    public void setHour(int h) {
        if (validHour(h)) {
            hour = h;
        } 
    }

    // Validates a provided hour is within bounds
    private boolean validHour(int h) {
        if (h >= 0 && h <= 23) {
            return true;
        }
        return false;
    }

    // Returns the minute variable value to the caller
    public int getMinute() {
        return minute;
    }

    // Sets the minute varaible after checking bounds
    public void setMinute(int m) {
        if (validMinute(m)) {
            minute = m;
        }
    }

    // Validates the minutes input by the user
    private boolean validMinute(int m) {
        if (m >= 0 && m <= 59) {
            return true;
        }
        return false;
    }

    // Returns the value of the second variable to the caller
    public int getSecond() {
        return second;
    }

    // Sets the second variable after checking bounds
    public void setSecond(int s) {
        if (validSecond(s)) {
            second = s;
        }
    }

    // Validates the user provided seconds
    private boolean validSecond(int s) {
        if (s >= 0 && s <= 59) {
            return true;
        }
        return false;
    }

    // Create a string representatino of a Time object
    public String toString() {
        return String.format("%02d:%02d:%02d", hour, minute, second);
    }

    /*public static void main(String[] args) {
        Time t = new Time(15, 30);
        System.out.println(t.toString());
        t.setHour(25);
        t.setSecond(45);
        System.out.println(t.toString());
    }*/
}