package com.itheima.interface_;

// 一个类可以实现多个接口，实现类实现多个接口，必须重写完全部抽象类的全部抽象方法，否则实现类需要定义为抽象类
public class E implements  C,D {
    @Override
    public boolean foo() {
        return false;
    }

    @Override
    public void bar() {

    }
}