package com.samsung;


import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int res = 1;
        for (int i = 2; i < a + 1; i++) {
            System.out.println(res);
            res *= i;
        }
        System.out.println(res);
    }
}
