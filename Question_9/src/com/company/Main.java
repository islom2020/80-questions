package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int count=0;
        int sum=0;
        while(n>0){
            sum += n % 10;
            count++;
            n=n/10;
        }
        System.out.println(count +" " + sum);
    }
}
