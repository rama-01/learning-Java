package com.itheima.array;

import java.util.Random;
import java.util.Scanner;

public class RandomRank {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] idArr = new int[5];
        for (int i = 0; i < 5; i++) {
            System.out.println("第" + (i + 1) + "次输入员工工号");
            int id = sc.nextInt();
            idArr[i] = id;
        }
        Random rand = new Random();
        for (int i = 0; i < 5; i++) {
            int r = rand.nextInt(4);
            int tmp = idArr[i];
            idArr[i] = idArr[r];
            idArr[r] = tmp;
        }

        // 输出乱序/随机数组元素
        for (int i = 0; i < 5; i++) {
            System.out.println(idArr[i]);
        }
    }
}