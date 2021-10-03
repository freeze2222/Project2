package com.samsung;


import java.util.Scanner;

public class CharP3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        char g = in.next().charAt(0);
        System.out.println(g ^= 32);
    }
}
