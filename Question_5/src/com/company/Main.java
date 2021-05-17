package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int s;
        for (int i = 2; i <= n; i++) {
            s = 0;
            for (int j = 1; j < i; j++) {
                if (i % j == 0) {
                    s += j;
                }
            }
            if (s == i) {
                System.out.print(i + " ");
            }
        }
    }
}

