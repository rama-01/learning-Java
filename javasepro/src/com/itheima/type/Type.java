package com.itheima.type;

public class Type {
    public static void main(String[] args) {
        // 自动类型转换的形式
        // byte short int long float double;char int
        byte a = 0;
        System.out.println(a);
        short b = a;
        int c = a;
        System.out.println(b);
        System.out.println(c);
        char d = 97;
        // short d1 = d;  //类型转换错误
        System.out.println(d);
        // System.out.println(d1);
    }
}