package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        float sum = scanner.nextFloat();
        float p = scanner.nextFloat();
        float sum2 = sum;
        int k=0;

        while (sum * 2 >= sum2) {
            sum2 = sum2 * (1 + (p / 100));k++;
        }

        System.out.println(k + " oyda " + sum2 + " so'm");
    }
}
