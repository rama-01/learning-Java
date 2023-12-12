package com.itheima.oop3;

public class Test {
    public static void main(String[] args) {
        Outer.Inner foo = new Outer().new Inner();
        foo.test();
    }
}