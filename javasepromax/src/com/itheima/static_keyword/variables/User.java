package com.itheima.static_keyword.variables;

public class User {
    public static int num;

    public User() {
        // User.num++;
        // 在同一个类中，访问自己的类变量，可以省略类名
        num++;
    }
}