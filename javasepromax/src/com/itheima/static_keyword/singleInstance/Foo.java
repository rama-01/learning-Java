package com.itheima.static_keyword.singleInstance;

public class Foo {
    // 2. 定义一个类变量记住类的一个对象
    private static Foo foo = new Foo();
    // 1. 私有类的构造器
    private Foo() {

    }
    // 3. 定义一个类方法，返回一个类的对象
    public static Foo getObj() {
        return foo;
    }
}