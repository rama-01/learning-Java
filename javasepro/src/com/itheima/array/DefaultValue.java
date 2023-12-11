package com.itheima.array;

public class DefaultValue {
    public static void main(String[] args) {
        int[] ages = new int[3];
        System.out.println(ages[0]);
        System.out.println(ages[1]);
        System.out.println(ages[2]);

        char[] chars = new char[3];
        System.out.println((int)chars[0]);
        System.out.println(chars[1]);
        System.out.println(chars[2]);

        double[] doubles = new double[3];
        System.out.println(doubles[0]);
        System.out.println(doubles[2]);

        boolean[] booleans = new boolean[199];
        System.out.println(booleans[198]);

        String[] strings = new String[211];
        System.out.println(strings[210]);
    }
}