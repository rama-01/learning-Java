package com.itheima.interface_;

public interface A {
    // 接口不能创建对象，接口是用来实现类的
    // 接口中定义的字段默认就是公共的（public），静态的（static），以及不可变的（final）
    public static final String HELLO = "hello world";
    public abstract  void test();
    boolean foo();
}