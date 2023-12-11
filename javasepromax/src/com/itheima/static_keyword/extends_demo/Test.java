package com.itheima.static_keyword.extends_demo;

public class Test {
    public static void main(String[] args) {
        B b = new B();
        System.out.println("---" + (b.getNum()));
        b.setNum(12);
        b.setA("hello");
        System.out.println(b.getNum());
        System.out.println(b.getA());

        System.out.println("----------------------");
        D d = new D();
        // System.out.println(d.name);
        d.showName();
    }
}