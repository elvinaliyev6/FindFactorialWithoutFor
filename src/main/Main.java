package main;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        int a = sc.nextInt();

        int n = findFactorial(a);
        System.out.println(n);

    }

    public static int findFactorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }

        return n * findFactorial(n - 1);
    }

}
