package com.samsung;

import java.util.Scanner;

public class CharP2_IDK {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        char a=in.next().charAt(0);
        char res= (char)(a+1024);
        System.out.println(res);
    }
}
