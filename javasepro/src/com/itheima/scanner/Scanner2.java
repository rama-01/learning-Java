package com.itheima.scanner;
import java.util.Scanner;
public class Scanner2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("please input your age");
        int age = sc.nextInt();
        System.out.println("please input your name");
        String name = sc.next();
        System.out.println(name + ",welcome comeback");
    }
}