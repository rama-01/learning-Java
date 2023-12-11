package com.itheima.parameter;

public class Methods {
    public static void main(String[] args) {
        int[] arr = {12, 21};
        change(arr);
        System.out.println(arr[0]);
        int a = 56;
        change2(a);
        System.out.println(a);
    }

    // 引用数据类型的参数传递是地址值
    public static void change(int[] arr) {
        arr[0] = 233;
    }

    // 基本数据类型的参数传递是数据值,二者都是值传递
    public static void change2(int a) {
        a = 123;
    }
}