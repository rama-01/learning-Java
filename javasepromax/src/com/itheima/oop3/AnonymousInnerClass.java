package com.itheima.oop3;

public class AnonymousInnerClass {
    public static void main(String[] args) {
        // Swimming s1 = new Swimming() {
        //     @Override
        //     public void swim() {
        //         System.out.println("dog is barring");
        //     }
        // };
        // go(s1);

        go(new Swimming() {
            @Override
            public void swim() {
                System.out.println("cat is crying");
            }
        });
    }
    public static void go(Swimming s) {
        s.swim();
    }

}


interface Swimming {
    void swim();
}