package com.itheima.static_keyword.variables;

public class Test {
    public static void main(String[] args) {
        User user = new User();
        User user2 = new User();
        User user3 = new User();

        System.out.println(User.num);
    }
}