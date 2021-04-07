package com.lining.question_zero;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author lining
 * @date 2021/3/31 9:13
 * https://leetcode-cn.com/problems/subsets-ii/
 * 90. 子集 II
 * 给你一个整数数组 nums ，其中可能包含重复元素，请你返回该数组所有可能的子集（幂集）。
 * 解集 不能 包含重复的子集。返回的解集中，子集可以按 任意顺序 排列。
 */
public class SubsetsWithDup {
    public static List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        Arrays.sort(nums);
        int tempSize = 0;
        for (int i = 0; i < nums.length; i++) {
            int number = nums[i];
            int listSize = list.size();
            if (i == 0 || nums[i] != nums[i - 1]) {
                list.add(new ArrayList<Integer>() {
                    {
                        add(number);
                    }
                });

            }
            if (i != 0 && nums[i] == nums[i - 1]) {
                tempSize = list.size() - 1;
            }
            if (listSize != 0) {
                int num = (nums[i] == nums[i - 1] ? tempSize : 0);
                for (int l = num; l < listSize; l++) {
                    if(l == num){
                        tempSize = listSize;
                    }
                    List<Integer> tempList = list.get(l);
                    List<Integer> newList = new ArrayList<>(tempList);
                    newList.add(number);
                    list.add(newList);
                }
            }
        }
        list.add(new ArrayList<>());
        return list;
    }


    List<Integer> t = new ArrayList<Integer>();
    List<List<Integer>> ans = new ArrayList<List<Integer>>();

    public List<List<Integer>> subsetsWithDup2(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        for (int mask = 0; mask < (1 << n); ++mask) {
            t.clear();
            boolean flag = true;
            for (int i = 0; i < n; ++i) {
                if ((mask & (1 << i)) != 0) {
                    if (i > 0 && (mask >> (i - 1) & 1) == 0 && nums[i] == nums[i - 1]) {
                        flag = false;
                        break;
                    }
                    t.add(nums[i]);
                }
            }
            if (flag) {
                ans.add(new ArrayList<Integer>(t));
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] nums = {5, 5, 5, 5};
        int[] nums1 = {1, 2, 2};
        System.out.println(subsetsWithDup(nums1));
    }
    // 1
    // 1, 2,  12
    //
}

