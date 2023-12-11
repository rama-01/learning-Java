package com.itheima.api.string;

public class Case1 {
    public static void main(String[] args) {
        String s1 = "abc";
        String s2 = "ab";
        String s3 = s2 + "c";
        String s4 = "abc";
        String s5 = "a" + "b" + "c";
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        System.out.println(s1 == s3);
        System.out.println(s1 == s4);
        System.out.println(s2 == s3);
        // s1是一个字符串常量，它的值是"abc"，因此它会被存储在字符串常量池中。而s3是通过连接s2和"c"得到的，这个过程会创建一个新的String对象，但这个对象不会被存储在字符串常量池中，因为它是在运行时创建的。
        System.out.println(s1 == s5);  //java存在编译优化机制，s5在编译时会直接转为"abc"
    }
}