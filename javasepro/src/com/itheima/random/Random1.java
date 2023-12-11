package com.itheima.random;

import java.util.Random;

public class Random1 {
    public static void main(String[] args) {
        Random r = new Random();
        for (int i = 0; i < 20; i++) {
            int data = r.nextInt(100);
            System.out.println(data);
        }
    }
}