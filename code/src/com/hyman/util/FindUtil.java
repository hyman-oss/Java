package com.hyman.util;

import java.util.Arrays;

/**
 * 查找算法
 * @author hyman
 */
public class FindUtil {

    /**
     * 二分查找
     * @param obj 有序数组
     * @param left 左边界
     * @param right 右边界
     * @param value 查找值
     * @return 元素所在位置
     */
    public static int  middleFind(int[] obj,int left ,int right ,int value){
        if(left <= right){
            int middle = (left + right)/2;
            if(obj[middle] == value){
               return middle;
            } else if (obj[middle] > value){
               return middleFind(obj,left,middle-1,value);
            } else if (obj[middle] < value){
                return middleFind(obj,middle+1,right,value);
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] test = {12,34,5654,45,4562,342,24,65,23};
        Arrays.sort(test);
        System.out.println(Arrays.toString(test));
        int result = FindUtil.middleFind(test,0,test.length-1,342);
        System.out.println(result);
    }
}
