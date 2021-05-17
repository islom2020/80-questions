package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("n=");
        int n = scanner.nextInt();
        int max= scanner.nextInt();
        int min=max;
        int a;
        for (int i = 0; i < n-1; i++) {
            a=scanner.nextInt();
            if (min > a){
                min = a;
            }
            if (max < a){
                max = a;
            }
        }
        System.out.println(min + " " + max);
    }
}
