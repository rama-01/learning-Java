package com.itheima.random;

import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    public static void main(String[] args) {
        Random r = new Random();
        int luckNumber = r.nextInt(100) + 1;
        Scanner sc = new Scanner(System.in);
        while(true) {
            System.out.println("请输入猜测数据");
            int guessNumber = sc.nextInt();
            if (guessNumber > luckNumber){
                System.out.println("猜大了");
            }else if (guessNumber < luckNumber) {
                System.out.println("猜小了");
            }else {
                System.out.println("恭喜，猜对了！");
                break;
            }
        }
    }
}