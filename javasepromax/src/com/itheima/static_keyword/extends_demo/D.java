package com.itheima.static_keyword.extends_demo;

public class D extends C {
    String name = "子类";

    public void showName() {
        String name = "局部";
        // System.out.println(name);
        // System.out.println(this.name);
        System.out.println(super.name);
    }
}