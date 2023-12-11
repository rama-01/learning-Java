package com.itheima.exercises;

public class Case6 {
    public static void main(String[] args) {
        print();
        printStars();
    }

    public static void print() {
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print((i) + "*" + (j) + "=" + (i * j) + " ");
            }
            System.out.println();
        }
    }

    public static void printStars() {
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("☆" + " ");
            }
            System.out.println();
        }
    }
}