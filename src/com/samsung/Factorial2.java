package com.samsung;

import java.util.Scanner;

public class Factorial2 {
    static int i = 2;

    static void res(int a, int res) {

        if (i < a + 1) {
            res *= i;
            i++;
            res(a, res);
        } else {
            System.out.println(res);
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        res(a, 1);
    }
}
