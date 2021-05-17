package com.company;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        int k = 0;
        System.out.print("n=");
        n = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            if (IsPrime(scanner.nextInt())) {
                k++;
            }
        }
        System.out.println(k);
    }

    static boolean IsPrime(int n) {
        for (int i = 2; i <= (int) Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return n != 1;
    }
}
