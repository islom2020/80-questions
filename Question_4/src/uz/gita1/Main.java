package uz.gita1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int day;
        int month;
        day = scanner.nextInt();
        month = scanner.nextInt();

        int[] months = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        if (month > 12) {
            System.out.println("Bunday oy yo`q");
            return;
        }

        if (months[month] < day) {
            System.out.println("Bunday sana yo`q");
            return;
        }

        int nextDay = ++day % months[month];

        if (nextDay < 10) {
            System.out.print("0" + nextDay + ".");
        } else {
            System.out.print(nextDay + ".");
        }
        if (nextDay == 1) {
            month = ++month % 12;
        }
        if (month < 10) {
            System.out.println("0" + month);
        } else {
            System.out.println(month);
        }
    }
}

