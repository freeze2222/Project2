package com.samsung;

public class func {
    static int sum(int a, int b) {
        int summary;
        summary = a + b;
        return summary;
    }

    static void print() {
        System.out.println("Hello World!");

    }

    static boolean isEven(int a, int b) {
        /*if (a==b){
            return true;
        }
        else {
            return false;
        }
        */
        if (a == b) {
            return true;
        }
        return false;


    }

    public static void main(String[] args) {
        System.out.println(sum(5, 6));
        System.out.println("-------------");
        print();
        System.out.println("-------------");
        System.out.println((isEven(9, 9)));
    }
}
