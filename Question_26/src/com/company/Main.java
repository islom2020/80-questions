package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a;
        int b;
        a = scanner.nextInt();
        b = scanner.nextInt();
        System.out.println(EKUB(a, b));
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
}
