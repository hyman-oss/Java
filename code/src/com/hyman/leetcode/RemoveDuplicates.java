package com.hyman.leetcode;

/**
 * 力扣 第26题 删除重复项
 * @author hyman
 */
public class RemoveDuplicates {

    /**
     * 双指针法
     * @param nums
     * @return
     */
    public static int removeDuplicates(int[] nums) {
        if(nums.length == 0){
            return 0;
        }

        int i = 0;
        for(int j = 1;j<nums.length;j++){
            //对比值是否相等 相等继续循环对比 i 记录不重复的值
            if(nums[i] != nums[j]){
                i++;
                nums[i] = nums[j];
            }
        }
        return i+1;
    }

    public static void main(String[] args) {
        int[] test = {0,0,1,1,1,2,2,3,3,4};
        RemoveDuplicates.removeDuplicates(test);
    }

}
