package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int year;
        int m1, m2, m3;
        year = scanner.nextInt();
        m1 = scanner.nextInt();
        m2 = scanner.nextInt();
        m3 = scanner.nextInt();
        System.out.println(MonthDays(m1, year) + " " + MonthDays(m2, year) + " " + MonthDays(m3, year));
    }

    static boolean IsLeapYear(int year) {
        if (year % 100 == 0 && year % 400 != 0) {
            return false;
        }
        return year % 4 == 0;
    }

    static int MonthDays(int month, int year) {
        if (month == 2 && IsLeapYear(year)) {
            return 29;
        }
        if (month == 2) {
            return 28;
        }
        if (month < 8 && month % 2 == 1 || month > 7 && month % 2 == 0) {
            return 31;
        }
        return 30;
    }
}
