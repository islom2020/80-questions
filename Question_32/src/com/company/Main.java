package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int d, m, y;
        d = scanner.nextInt();
        m = scanner.nextInt();
        y = scanner.nextInt();
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

    static String PrevDate(int d, int m, int y) {
        if (d > 1){
            return (d-1) + "." + m +" " + y;
        }
        if (d ==1 ){
            return 0;
        }
    }
}
