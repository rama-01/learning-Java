package com.itheima.api.string;

public class StringAPI {
    public static void main(String[] args) {
        String string = "Hello World!";
        System.out.println(string.length());

        for (int i = 0; i < string.length(); i++) {
            System.out.println(string.charAt(i));
        }

        char[] str = string.toCharArray();
        for (int i = 0; i < str.length; i++) {
            System.out.println(str[i]);
        }

        String s = "Hello World";
        String s2 = "Hello World!";
        System.out.println(string == s);
        System.out.println(string == s2);
        System.out.println(string.equals(s2));

        System.out.println(string.substring(0,5));

        System.out.println(string.replace("!", ""));

        System.out.println(string.contains("!"));
        System.out.println(string.contains(" "));

        System.out.println(string.startsWith("H"));
        System.out.println(string.startsWith("He"));

        String str2 = "h-e-l-l-o- -w-o-r-l-d-!";
        String[] str3 = str2.split("-");
        System.out.println(str3);
        for (int i = 0; i < str3.length; i++) {
            System.out.println(str3[i]);
        }
    }
}