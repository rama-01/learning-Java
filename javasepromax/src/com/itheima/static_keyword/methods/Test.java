package com.itheima.static_keyword.methods;

public class Test {
    public static void main(String[] args) {
        StaticMethods.ClassMethods(); //类名.类方法

        StaticMethods foo = new StaticMethods();
        foo.InstanceMethods();
    }
}