package web.model;

public class Car {
    private int year;
    private String mark;
    private int number;

    public Car() {
    }

    public Car(int year, String mark, int number) {
        this.year = year;
        this.mark = mark;
        this.number = number;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getYear() {
        return year;
    }

    public String getMark() {
        return mark;
    }

    public int getNumber() {
        return number;
    }
}
