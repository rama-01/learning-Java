package com.itheima.exercises;

import java.util.Random;
import java.util.Scanner;

public class Case4 {
    public static void main(String[] args) {
        getLottery(new int[]{234, 456, 666, 123, 536});
    }

    public static void getLottery(int[] arr) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        for (int i = 0; i < 5; i++) {
            System.out.println("请输入任意内容抽奖");
            scanner.next();  // 按下回车键才往下走
            while (true) {
                int r = random.nextInt(arr.length);  // 生成随机索引
                if (arr[r] != 0) {
                    System.out.println("恭喜中奖了");
                    arr[r] = 0;  // 标记数组元素已被访问了
                    break;
                }
            }
        }
        System.out.println("活动结束！");
    }
}