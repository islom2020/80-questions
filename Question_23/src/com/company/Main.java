package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int k;
        System.out.print("k=");
        k = scanner.nextInt();
        System.out.println(DigitCount(k));
    }

    static int DigitCount(int k) {
        int n = 0;
        while (k > 0) {
            k /= 10;
            n++;
        }
        return n;
    }

}
