package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int max = 0;
        int a;
        int k=0;
        for (int i = 0; i < n ; i++) {
            a = scanner.nextInt();
            if (a >= max) {
                max = a;
                k=i+1;
            }
        }
        System.out.println(max + " " + (n-k));
    }
}
