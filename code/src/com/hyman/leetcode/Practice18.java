package com.hyman.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 力扣 第18题 4数之和
 * @author hyman
 */
public class Practice18 {

    public static List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> result = new ArrayList<>();
        if(nums.length == 0){
            return result;
        }
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++){
            if(i > 0 && nums[i] == nums[i-1]){
                continue;
            }
            int curr = target - nums[i];
            for(int j=i+1;j<nums.length;j++){
                if(j > i+1 && nums[j] == nums[j-1]){
                    continue;
                }
                int curr2 = curr-nums[j];
                int k = j+1;
                int o = nums.length-1;
                while (k < o){
                    if(nums[k] + nums[o] == curr2){
                        List<Integer> list = new ArrayList<>();
                        list.add(nums[i]);
                        list.add(nums[j]);
                        list.add(nums[k]);
                        list.add(nums[o]);
                        result.add(list);
                        k++;
                        o--;
                        while (k < nums.length && nums[k] == nums[k-1]){
                            k++;
                        }
                        while (o > k && nums[o] == nums[o+1]){
                            o--;
                        }
                    }else if(nums[k] + nums[o] > curr2){
                        o--;
                    }else {
                        k++;
                    }
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] test = {1, 0, -1, 0, -2, 2};
        System.out.println(Practice18.fourSum(test,0));
    }
}
