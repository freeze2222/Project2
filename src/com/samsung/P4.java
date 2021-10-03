package com.samsung;

public class P4 {
    static int a = 111;

    public static void main(String[] args) {
        int a = 0;
        for (int i = 0; i < 10; i++) {
            if (i % 2 == 0) {
                continue; //break;
            }
            System.out.println("Numer: " + i);
        }
        System.out.println(a);
        //System.out.println(Basic.a); Должно было работать
        boolean isStop = true;
        label:
        while (isStop) {
            while (true) {
                while (true) {
                    while (true) {
                        while (true) {
                            isStop = false;
                            break label;//"Можно писать, но использовать нельзя"  (в тестах можно)
                        }
                    }
                }
            }
        }
    }
}
