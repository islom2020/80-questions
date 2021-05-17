package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int a;
        int b;
        int c;
        a = scanner.nextInt();
        b = scanner.nextInt();
        c = scanner.nextInt();
        System.out.println(EKUB3(a, b, c));
    }

    static int EKUB(int a, int b) {
        while (a != b) {
            if (a > b) {
                a -= b;
            } else {
                b -= a;
            }
        }
        return a;
    }

    static int EKUB3(int a, int b, int c) {
        return EKUB(EKUB(a, b), c);
    }
}
