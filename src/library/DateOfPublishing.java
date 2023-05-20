package library;

public class DateOfPublishing {

    private int day;

    private int month;

    private final int year;

    public DateOfPublishing(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public DateOfPublishing(int year) {
        this.year = year;
    }

    public String getDate() {
        if (day == 0 && month == 0) {
            return "year of Publishing: " + year;
        }
        return "date of publishing: " + day + "/" + month + "/" + year;
    }
}
