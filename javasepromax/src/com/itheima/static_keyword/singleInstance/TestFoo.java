package com.itheima.static_keyword.singleInstance;

public class TestFoo {
    public static void main(String[] args) {
        Foo bar = Foo.getObj();
        Foo bar2 = Foo.getObj();

        System.out.println(bar);
        System.out.println(bar2);
        System.out.println(bar == bar2);
    }
}