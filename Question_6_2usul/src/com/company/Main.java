package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k;
        boolean t = true;
        for (int i = 2; i <= n; i++) {
            k = (int) Math.sqrt(i);
            for (int j = 2; j <= k; j++) {
                if (i % j == 0) {
                    t = false;
                    j = k + 1;
                }
            }
            if (t) {
                System.out.println(i);
            }
            t = true;
        }
    }
}
