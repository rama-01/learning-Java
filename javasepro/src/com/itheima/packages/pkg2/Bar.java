package com.itheima.packages.pkg2;

import com.itheima.packages.pkg1.Foo;

public class Bar {
    public static void main(String[] args) {
        Bar2 bar = new Bar2();
        bar.print();
        Foo foo = new Foo();
        foo.print();
    }

    public static void bar() {
        System.out.println("bar fuc exec");
    }
}