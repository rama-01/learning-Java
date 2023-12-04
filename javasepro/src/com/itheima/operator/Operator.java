package com.itheima.operator;

public class Operator {
    public static void main(String[] args) {
        int a = 10;
        int b = 2;
        int c = 3;
        // 两个整数相除的结果仍然是整数
        // 若要保留小数结果，可以乘以1.0
        System.out.println(1.0 * a / c);
        System.out.println(1.0 * b / c);

        // 使用+作为连接符
        // 原则：能加则加，单个字符对应ASCII数值
        int d = 12;
        System.out.println(d + 'a');
        System.out.println(d + "a");
    }
}