package com.itheima.operator;

public class Operator2 {
    public static void main(String[] args) {
        int a = 10;
        System.out.println(a);
        a++;
        System.out.println(a);
        a--;
        System.out.println(a);

        System.out.println("----------------------------");
        // 1. ++i与i++的区别
        int b = 3;
        int c = ++b;  //先加
        System.out.println(b);
        System.out.println(c);

        int d = b++;  //后加
        System.out.println(b);
        System.out.println(d);
    }
}