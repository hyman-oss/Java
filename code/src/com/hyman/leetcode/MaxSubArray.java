package com.hyman.leetcode;

/**
 * 力扣 第53题  最大子序和
 * @author hyman
 */
public class MaxSubArray {

    /**
     * 动态规划
     * @param nums
     * @return
     */
    public int maxSubArray(int[] nums) {
        if(nums.length ==0){
            return 0;
        }
        if(nums.length == 1){
            return nums[0];
        }
        int tmp = 0;
        int sum = nums[0];
        for(int i=0;i<nums.length;i++){
            tmp = Math.max(nums[i],nums[i]+tmp);
            sum = Math.max(sum,tmp);
        }
        return sum;
    }

    public static void main(String[] args) {

    }
}
