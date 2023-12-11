package com.itheima.exercises;

public class Case3 {
    public static void main(String[] args) {
        // System.out.println(encrypt(1983));
    }

    public static int encrypt(int password) {
        // 分别获取分位数值
        int ones = password % 10;
        int tens = (password / 10) % 10;
        int hundreds = (password / 100) % 10;
        int thousands = password / 1000;

        ones = (ones + 5) % 10;
        tens = (tens + 5) % 10;
        hundreds = (hundreds + 5) % 10;
        thousands = (thousands + 5) % 10;

        int res = thousands + hundreds * 10 + tens * 100 + ones * 1000;
        return res;
    }
}