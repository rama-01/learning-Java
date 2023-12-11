package com.itheima.branch;

public class Branch2 {
    public static void main(String[] args) {
        String a = "tudesday";
        switch (a) {
            case "monday1":
                System.out.println("monday");
                break;
            case "wedesday":
                System.out.println("wedesday");
                break;
            case "thursday":
                System.out.println("thursday");
                break;
            default:
                System.out.println("未匹配到值，执行的代码");
        }
    }
}