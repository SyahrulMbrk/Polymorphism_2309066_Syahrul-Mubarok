package soal2;

public class MyDate {
    private int year;
    private int month;
    private int day;

    public MyDate() {
        this.year = 2020;
        this.month = 0;
        this.day = 1;
    }

    public MyDate(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public int getYear() { return year; }
    public int getMonth() { return month; }
    public int getDay() { return day; }
}