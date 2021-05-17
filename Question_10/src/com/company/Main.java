package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        while (a!=b){
            if (a>b){
                a=a-b;
            } else {
                b = b-a;
            }
        }
        System.out.println(a);
    }
}
