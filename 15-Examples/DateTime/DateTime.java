public class DateTime {
    private Time time;
    private Date date;

    public DateTime() { }

    public DateTime(Time t, Date d) {
        time = t;
        date = d;
    }

    public DateTime(int y, int m, int d, int H, int M, int S) {
        time = new Time(H, M, S);
        date = new Date(y, m, d);
    }

    public void setTime(int h, int m, int s) {
        time = new Time(h, m, s);
    }

    public void setTime(int h, int m) {
        time = new Time(h, m);
    }

    public void setTime(Time t) {
        time = t;
    }

    public Time getTime() {
        return time;
    }

    public void setDate(int y, int m, int d) {
        date = new Date(y, m, d);
    }

    public void setDate(Date d) {
        date = d;
    }

    public Date getDate() {
        return date;
    }

    public String toString() {
        return String.format("%d/%d/%dT%02d:%02d:%02d", date.getYear(), date.getMonth(), date.getDay(), time.getHour(), time.getMinute(), time.getSecond());
    }

    public static void main(String[] args) {
        Time t = new Time(13, 14, 15);
        Date d = new Date(2017, 11, 13);

        Time t2 = new Time(9, 10, 11);

        DateTime dt = new DateTime(t, d);
        System.out.print(dt.toString());
        System.out.println();

        dt.setTime(t2);
        System.out.print(dt.toString());
    }
}