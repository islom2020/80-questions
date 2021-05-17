package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int n1 = scanner.nextInt();
        int a;
        int s = 0;
        for (int i = 0; i < n - 1; i++) {
            a = scanner.nextInt();
            if (a + n1 > s) {
                s = a + n1;
            }
            n1 = a;
        }
        System.out.println(s);
    }
}
