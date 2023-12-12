package com.itheima.oop3;

// 访问修饰符：public private protected default
// 非访问修饰符：static final abstract synchronized volatile transient native
public class Outer {
    private int age;
    static String str;

    public class Inner {
        private String name;
        public static String SCHOOL; // jdk16开始定义静态成员
        private int age  =12;

        public void test() {
            int age = 13;
            // System.out.println(age); // 访问外部类
            System.out.println(str);
            System.out.println(name);  // 访问内部类
            System.out.println(SCHOOL);

            // 分别访问不同作用域的变量
            System.out.println(age);
            System.out.println(this.age);
            System.out.println(Outer.this.age);
        }
    }
}