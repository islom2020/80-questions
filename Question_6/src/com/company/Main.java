package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k;
        for (int i = 1; i <= n; i++) {
            k = 0;
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    k++;
                }
            }
            if (k == 2) {
                System.out.println(i + " ");
            }
        }
    }
}
