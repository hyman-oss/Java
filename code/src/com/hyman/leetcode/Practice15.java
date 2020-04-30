package com.hyman.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 力扣 15题 三数之和
 * @author hyman
 */
public class Practice15 {

    /**
     * 三数之和0  解题思想 遍历一次选定一个数 i,剩下的数中找出两个数的和为 -i 即可
     * @param nums
     * @return
     */
    public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> returnList = new ArrayList<>();
        if(nums.length <= 0){
            return returnList;
        }
        Arrays.sort(nums);
        for(int i = 0;i<nums.length;i++){
            if(i>0 && nums[i] == nums[i-1]) {
                continue;
            }
            int target = nums[i];
            int left = i+1;
            int right = nums.length-1;
            while (left < right){
                if(nums[left] + nums[right] == - target){
                    List<Integer> list = new ArrayList<>();
                    list.add(nums[i]);
                    list.add(nums[left]);
                    list.add(nums[right]);
                    returnList.add(list);
                    left++;
                    right--;
                    while (left < nums.length && nums[left] == nums[left-1]) left ++;
                    while (right > left && nums[right] == nums[right+1]) right --;
                } else if(nums[left] + nums[right] > -target){
                    right--;
                } else {
                    left++;
                }
            }
        }
        return returnList;
    }

    public static void main(String[] args) {
        int[] test = {-1, 0, 1, 2, -1, -4};
        System.out.println(Practice15.threeSum(test).toString());
    }
}
