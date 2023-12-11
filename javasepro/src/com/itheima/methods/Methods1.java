package com.itheima.methods;

public class Methods1 {
    public static void main(String[] args) {
        int a = sum(12, 21);
        System.out.println(a);
        int b = sum(3, 43);
        System.out.println(b);
    }

    public static int sum(int a, int b) {
        int c = a + b;
        return c;
    }
}