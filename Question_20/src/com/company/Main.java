package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int min1 = scanner.nextInt();
        int min2 = scanner.nextInt();
        int a;
        for (int i = 0; i < n - 2; i++) {
            a = scanner.nextInt();
            if (a < min1) {
                min1 = a;
            }
            if (a > min1 && a < min2) {
                min2 = a;
            }
        }
        System.out.println(min1 + " " + min2);
    }
}
