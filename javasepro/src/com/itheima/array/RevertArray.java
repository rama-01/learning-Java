package com.itheima.array;

public class RevertArray {
    public static void main(String[] args) {
        int[] nums = new int[]{2, 4, 12, 23, -12, 33, 8};
        int n = nums.length;
        // 定义双指针
        int i = 0;
        int j = n - 1;
        while (i < j) {
            // 交换数组元素的值
            int tmp = nums[i];
            nums[i] = nums[j];
            nums[j] = tmp;
            // 移动指针，遍历整个数组
            i++;
            j--;
        }
        for (int k = 0; k < n; k++) {
            System.out.print(nums[k] + " ");
        }
        // 这里也可以使用for循环定义直接定义两个变量（指针）
    }
}