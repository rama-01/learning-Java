package com.itheima.array;

public class MaxValue {
    public static void main(String[] args) {
        int[] nums = new int[]{2, 4, 12, 23, -12, 33, 8};
        int max = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > max) {
                max = nums[i];
            }
        }
        System.out.println(max);
    }
}