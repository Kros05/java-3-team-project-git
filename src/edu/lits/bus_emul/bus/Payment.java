package edu.lits.bus_emul.bus;

import java.util.Objects;


// ----------- Конструктор класу----------------
public class Payment {
    private int year = 0;
    private int month = 0;
    private int day = 0;
    private int payment = 0;

    public Payment() {
    }

    public Payment(int year, int month, int day, int payment) {
        this.year = year;
        this.month = month;
        this.day = day;
        this.payment = payment;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getPayment() {
        return payment;
    }

    public void setPayment(int payment) {
        this.payment = payment;
    }

    @Override
    public String toString() {
        return "Bus{" +
                "year=" + year +
                ", month=" + month +
                ", day=" + day +
                ", payment=" + payment +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Payment busClass = (Payment) o;
        return year == busClass.year &&
                month == busClass.month &&
                day == busClass.day &&
                payment == busClass.payment;
    }

    @Override
    public int hashCode() {
        return Objects.hash(year, month, day, payment);
    }

// ------------------ кінець конструктора класу ----------------------


// ------------------ методи виведення дня в році --------------------

    // -------------- 1. перевірка чи день не виходить за межі місяця виклик метода checkLegalDay()
    // -------------- 2. відповідно до місяця проводимо розрахунок
    public int dayOfYear() {
        int dayOfYear = 0;
        if (checkLegalDay(month, day)) {
            switch (month) {
                case 1:
                    dayOfYear = day;
                    break;
                case 2:
                    dayOfYear = day + 31;
                    break;
                case 3:
                    dayOfYear = day + 59;
                    break;
                case 4:
                    dayOfYear = day + 90;
                    break;
                case 5:
                    dayOfYear = day + 120;
                    break;
                case 6:
                    dayOfYear = day + 151;
                    break;
                case 7:
                    dayOfYear = day + 181;
                    break;
                case 8:
                    dayOfYear = day + 212;
                    break;
                case 9:
                    dayOfYear = day + 243;
                    break;
                case 10:
                    dayOfYear = day + 273;
                    break;
                case 11:
                    dayOfYear = day + 304;
                    break;
                case 12:
                    dayOfYear = day + 334;
                    break;
            }
        }
        return dayOfYear;
    }


    //-------------- метод перевірки чи день не виходить за межі місяця
    boolean checkLegalDay(int currentMonth, int currentDay) {
        boolean statusLegal = false;
        if (currentMonth == 1 || currentMonth == 3 || currentMonth == 5 || currentMonth == 7 || currentMonth == 8
                || currentMonth == 10 || currentMonth == 12) {
            if (currentDay > 0 && currentDay < 32) {
                statusLegal = true;
            }
        } else if (currentMonth == 4 || currentMonth == 6 || currentMonth == 9 || currentMonth == 11) {
            if (currentDay > 0 && currentDay < 31) {
                statusLegal = true;
            }
        } else {
            if (currentDay > 0 && currentDay < 29) {
                statusLegal = true;
            }
        }
        if (!statusLegal) {
            System.out.println("Not legal day of current month");
        }
        return statusLegal;
    }

// ------------------ закінчення блоку методів виведення дня в році --------------------

}
