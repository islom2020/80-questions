package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k;
        for (int i = 1; i <= n; i++) {
            k = Sum.sum(i);
            if (Sum.sum(k) == i && i < k) {
                System.out.println(i + " " + k);
            }
        }
    }
}

class Sum {
    static int sum(int n) {
        int s = 0;
        for (int i = 1; i < n; i++) {
            if (n % i == 0) {
                s += i;
            }
        }
        return s;
    }
}
