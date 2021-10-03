package com.samsung;


import java.util.Scanner;

public class calculator {
    static int sum(int a, int b) {
        return (a + b);
    }

    static int minus(int a, int b) {
        return (a - b);
    }

    static int del(int a, int b) {
        return (a / b);
    }

    static int dubl(int a, int b) {
        return (a * b);
    }

    static void print() {
        Scanner in = new Scanner(System.in);
        System.out.println("enter first num");
        int a = in.nextInt();
        System.out.println("enter second num");
        int b = in.nextInt();
        System.out.println("+ - / *");
        char action = in.next().charAt(0);

        switch (action) {
            case '+':
                System.out.println(sum(a, b));
                break;
            case '-':
                System.out.println(minus(a, b));
                break;
            case '/':
                System.out.println(del(a, b));
                break;
            case '*':
                System.out.println(dubl(a, b));
        }
    }

    public static void main(String[] args) {
        print();
    }
}
