package uz.gita1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float a, b, c;
        System.out.print("1-son: ");
        a = scanner.nextFloat();
        System.out.print("2-son: ");
        b = scanner.nextFloat();
        System.out.print("3-son: ");
        c = scanner.nextFloat();

        System.out.println(a < b && a < c ? a : b < c ? b : c);
    }
}

