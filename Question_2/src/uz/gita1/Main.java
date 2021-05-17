package uz.gita1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("yilni kiriting: ");
        int n = scanner.nextInt();
        if (n%100 == 0 && n % 400 !=0){
            System.out.println(365);
            return;
        }
        if (n%4 == 0){
            System.out.println(366);
        }

    }
}
