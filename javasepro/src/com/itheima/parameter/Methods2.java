package com.itheima.parameter;

public class Methods2 {
    public static void main(String[] args) {
        // System.out.println(judgeEqual({1,2,3},{1,2,3}));
        System.out.println(judgeEqual(new int[]{1, 2, 3}, new int[]{1, 2, 3}));
        int[] arr1 = {2, 5, 6};
        int[] arr2 = {2, 5, 4};
        System.out.println(judgeEqual(arr1, arr2));
    }

    public static boolean judgeEqual(int[] arr1, int[] arr2) {
        // 考虑参数为null
        if (arr1 == null && arr2 == null) return true;
        if (arr1 == null || arr2 == null) return false;
        if (arr1.length != arr2.length) return false;
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) return false;
        }
        return true;
    }
}