package com.samsung;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        char c = '\u3313';
        c++;
        int num = 122;
        double f = 123.33;
        double newnum = (int) 123.33d;
        final int g = 1;
        int[] arr = new int[10];
        int[] arra = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println(c / 1);
        //Character.toCodePoint('l'); //not working
        System.out.println(Arrays.toString(arr));
        System.out.println((float) num / 3d);
        System.out.println(c);
        System.out.println(Arrays.toString(arra));
    }
}
