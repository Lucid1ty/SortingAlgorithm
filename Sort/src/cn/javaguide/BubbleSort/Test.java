package cn.javaguide.BubbleSort;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        int[] a = new int[]{3, 2, 4, 1, 5, 6};
        System.out.println(Arrays.toString(sort(a)));
    }

    /**
     * 冒泡排序
     * @param arr 传入待排序的数组
     * @return arr 排序好后返回
     */
    public static int[] sort (int[] arr) {
        // 外层for循环确定内层for循环的执行次数
        // 例如有6个数需要排序，那么执行5次内层for循环即可排好序
        for (int i = 1; i < arr.length; i++) {
            // 走完整个内层for循环就把一个数字排序好了
            for (int j = 0; j < arr.length - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    // 交换
                    int temp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }
}
