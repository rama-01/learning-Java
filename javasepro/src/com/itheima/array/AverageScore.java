package com.itheima.array;

import java.util.Scanner;

public class AverageScore {
    public static void main(String[] args) {
        double[] scores = new double[3];
        Scanner sc = new Scanner(System.in);
        int n = scores.length;
        for (int i = 0; i < n; i++) {
            System.out.println("请第" + (i + 1) + "次打分");
            double score = sc.nextDouble();
            scores[i] = score;
        }

        double sumScore = 0;
        for (int i = 0; i < n; i++) {
            sumScore += scores[i];
        }

        double averageScore = sumScore / n;
        System.out.println("最后得分是：" + (averageScore));
    }
}