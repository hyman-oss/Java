package com.hyman.util;

import java.util.Arrays;

/**
 * 排序算法实现
 * @author hyman
 */
public class SortUtil {

    /**
     * 快速排序
     * @param obj 需要排序的数组
     * @param left 左边界
     * @param right 右边界
     */
    public static void fastSort(int[] obj,int left,int right){
        if(left > right){
            return;
        }
        //中间值
        int base = obj[left];
        int i = left,j = right;

        //一次遍历找出所有需要交换的值
        while (i != j){
            //从右边开始找出比 base 小的值
            while (obj[j] >= base && i < j){
                j--;
            }
            //从左边开始找出比 base 大的值
            while (obj[i] <= base && i < j){
                i++;
            }

            //两者交换位置
            if(i < j){
                int tmp = obj[i];
                obj[i] = obj[j];
                obj[j] = tmp;
            }
        }
        //一次循环后 i 为 base 的正确位置
        //原i位置元素移动到 base 元素的位置
        obj[left] = obj[i];
        //base元素归位
        obj[i] = base;

        //重复操作左子数组和右子数组直到排序结束
        fastSort(obj,i+1,right);
        fastSort(obj,left,i-1);
    }

    public static void main(String[] args) {
        int[] test = {12,34,5654,45,4562,342,24,65,23};
        SortUtil.fastSort(test,0,test.length-1);
        System.out.println(Arrays.toString(test));

    }
}
