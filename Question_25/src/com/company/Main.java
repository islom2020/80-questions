package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int k = 0;
        for (int i = 0; i < 3; i++) {
            if (IsPalindrom(scanner.nextInt())) {
                k++;
            }
        }
        System.out.println(k);

    }

    static boolean IsPalindrom(int n) {
        int a = DigitCount(n);
        for (int i = 1; i <= a / 2; i++) {
            if (DigitN(n, i) != DigitN(n, a + 1 - i)) {
                return false;
            }
        }
        return true;
    }

    static int DigitCount(int k) {
        int n = 0;
        while (k > 0) {
            k /= 10;
            n++;
        }
        return n;
    }

    static int DigitN(int k, int n) {
        String m = String.valueOf(k);
        if (m.length() < n) {
            return -1;
        }
        return m.charAt(n - 1) - 48;
    }
}
