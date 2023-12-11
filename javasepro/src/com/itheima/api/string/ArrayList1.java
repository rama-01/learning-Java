package com.itheima.api.string;

import java.util.ArrayList;

public class ArrayList1 {
    public static void main(String[] args) {
        ArrayList<String> arr = new ArrayList();
        arr.add("hello");
        // arr.add(123);
        arr.add("world");
        System.out.println(arr.add("!"));
        System.out.println(arr);

        System.out.println(arr.remove(2));
        System.out.println(arr);

        System.out.println(arr.size());

        System.out.println(arr.get(0));

        System.out.println(arr.remove("hello"));
        System.out.println(arr);

        System.out.println(arr.set(0, "word"));
        System.out.println(arr);
    }
}