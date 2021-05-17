package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int k=0;
        for (int i = 0; i < 3; i++) {
            if (IsLeapYear(scanner.nextInt())){
                k++;
            }
        }
        System.out.println(k);
    }

    static boolean IsLeapYear(int year) {
        if (year % 100 == 0 && year % 400 != 0) {
            return false;
        }
        return year % 4 == 0;
    }
}
