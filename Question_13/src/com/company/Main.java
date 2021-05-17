package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("n=");
        int n = scanner.nextInt();
        int min = scanner.nextInt();
        int a;
        int k=1;
        for (int i = 0; i < n - 1; i++) {
            a = scanner.nextInt();
            if (min > a) {
                min = a;
                k=i+2;
            }
        }
        System.out.println(min + " " + k);
    }
}
