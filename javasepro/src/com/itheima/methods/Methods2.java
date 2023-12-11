package com.itheima.methods;

public class Methods2 {
    public static void main(String[] args) {
        int a = getSum(10);
        System.out.println(a);
        int b = getSum(100);
        System.out.println(b);

        System.out.println(oddOrEven(12));
        System.out.println(oddOrEven(43));
    }

    public static int getSum(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }

    public static String oddOrEven(int a) {
        if (a % 2 == 1) {
            return "a is an " + "odd number";
        } else {
            return "a is an " + "even number";
        }
    }
}