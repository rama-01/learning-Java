package com.itheima.exercises;

public class Case5 {
    public static void main(String[] args) {
        int count = 0;
        for (int i = 101; i < 200; i++) {
            if (isPrime(i)) {
                count++;
                System.out.println(i);
            }
        }
        System.out.println("总共有" + (count) + "个素数");
    }

    public static boolean isPrime(int num) {
        if (num <= 1) return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) return false;
        }
        return true;
    }
}