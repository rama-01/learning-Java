package com.itheima.branch;

public class Branch {
    public static void main(String[] args) {
        double score = 76;
        if (score >= 0 && score < 60) {
            System.out.println("不及格");
        } else if (score >= 60 && score < 90) {
            System.out.println("良好");
        } else if (score >= 90 && score <= 100){
            System.out.println("优秀");
        }else {
            System.out.println("成绩输入有误，请重新输入");
        }
    }
}