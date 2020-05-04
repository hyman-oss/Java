package com.hyman.leetcode;

/**
 * 力扣 第35题
 * @author hyman
 */
public class SearchInsert {

    public int searchInsert(int[] nums, int target) {
        if(nums.length == 0){
            return 0;
        }
        int left = 0;
        int right = nums.length-1;

        while (left < right){
            int mid = (left + right)/2;
            if(nums[mid] >= target){
                right = mid;
            }else if(nums[mid] < target){
                left = mid+1;
            }
        }
        return left;
    }
}
