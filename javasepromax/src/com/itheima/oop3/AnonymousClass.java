package com.itheima.oop3;

public class AnonymousClass {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.cry();
// 通过抽象类直接创建了实例对象
        new Animal() {
            public void cry() {
                System.out.println("hello");
            }
        };
    }
}

abstract class Animal {
    public abstract void cry();
}

class Dog extends Animal {
    public void cry() {
        System.out.println("barrr");
    }
}