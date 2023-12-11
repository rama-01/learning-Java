package com.itheima.loop;

public class Loop1 {
    public static void main(String[] args) {
        int sum = 0;
        int sum1 = 0;
        int sum2 = 0;
        for (int i = 0; i < 100; i++) {
            System.out.println(i);
            sum += i;
            if (i % 2 == 1){
                sum1 += i;
            }else {
                sum2 += i;
            }
        }
        System.out.println(sum);
        System.out.println(sum1);
        System.out.println(sum2);
    }
}