package com.itheima.api.string;

public class String1 {
    public static void main(String[] args) {
        String name = "rama";
        System.out.println(name);

        String str = "hello world";
        System.out.println(str);

        char[] chars = {'a', 'b', 'c'};
        System.out.println(new String(chars));

        byte[] bytes = {123, 127, 97};
        byte[] bytes2 = {97, 98, 99};
        System.out.println(new String(bytes));
        System.out.println(new String(bytes2));
    }
}