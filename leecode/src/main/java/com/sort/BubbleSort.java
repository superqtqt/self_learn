package com.sort;

import java.util.Arrays;

/**
 * 冒泡排序
 * 循环比较两个元素
 */
public class BubbleSort {
    public static void main(String[] args) {
        int [] test1=new int[]{4,1,234,34,5,3,5555,123,0};
        sort(test1);
        System.out.println(Arrays.toString(test1));
    }
    public static void sort(int [] arr){
        int len=arr.length;
        while (len>0){
            for (int i = 0; i < len-1; i++) {
                if (arr[i]>arr[i+1]){
                    SortUtil.swap(arr,i,i+1);
                }

            }
            len--;
        }

    }
}
