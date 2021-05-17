package uz.gita1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float x, y;
        System.out.print("x= ");
        x = scanner.nextFloat();
        System.out.print("y= ");
        y = scanner.nextFloat();
            x = (x + y) / 2;
            y = (x*2-y)*y*2;

        if (x > y) {
            x = x + y;
            y = x - y;
            x = x - y;
        }
        System.out.println(x + " " + y);
    }
}
