package cn.javaguide.BubbleSort;

import java.util.Arrays;

public class bubbleSort {
    public static void main(String[] args) {
        int[] a = new int[]{1, 6, 2, 49, 4, 8, 1, 45, 8, 2, 6, 3};
        System.out.println(Arrays.toString(bubbleSort(a)));
    }
    /**
     * 冒泡排序
     * @param arr
     * @return arr
     */
    public static int[] bubbleSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            // Set a flag, if true, that means the loop has not been swapped,
            // that is, the sequence has been ordered, the sorting has been completed.
            boolean flag = true;
            for (int j = 0; j < arr.length - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;
                    // Change flag
                    flag = false;
                }
            }
            if (flag) {
                break;
            }
        }
        return arr;
    }
}
