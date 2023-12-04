package com.itheima.operator;

public class Operator4 {
    public static void main(String[] args) {
        System.out.println(true ^ true);
        System.out.println(true ^ false);
        System.out.println(false ^ true);
        System.out.println(false ^ false);
        System.out.println(true | false);
        System.out.println(true & false);
        System.out.println(true & true);
        System.out.println(!true);
        System.out.println(!false);

        // 实际开发中，短路与，短路或，非运算符使用更多
        // 短路与，前一个条件为假时，后面的不执行；短路或，前一个条件为真时，后面的不执行

        // 三元运算符
        int a = 10;
        int b = 12;
        System.out.println(a < b?"hello":"world");
    }
}