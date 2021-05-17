package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int k, n;
        System.out.print("k=");
        k = scanner.nextInt();
        System.out.print("n=");
        n = scanner.nextInt();
        System.out.println(DigitN(k, n));
    }

    static int DigitN(int k, int n) {
        String m = String.valueOf(k);
        if (m.length() < n) {
            return -1;
        }
        return m.charAt(n-1)-48;
    }
}
