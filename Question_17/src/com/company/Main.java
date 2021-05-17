package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("n=");
        int n = scanner.nextInt();
        int min = 0;
        int a;
        int k=n;
        for (int i = 0; i < n; i++) {
            a = scanner.nextInt();
            if (a > 0) {
                min = a;
                k=++i;
                i=n;
            }
        }
        for (int i = k; i <n; i++) {
            a=scanner.nextInt();
            if (a>0 && a<min){
                min = a;
            }
        }
        System.out.println(min);
    }
}
