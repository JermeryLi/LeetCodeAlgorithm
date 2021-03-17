package com.lining.question_ten;

/**
 * @author lining
 * @date 2020/12/18 9:42
 * https://leetcode-cn.com/problems/duplicate-zeros/
 * 1089. 复写零
 * 给你一个长度固定的整数数组 arr，请你将该数组中出现的每个零都复写一遍，并将其余的元素向右平移。
 * 注意：请不要在超过该数组长度的位置写入元素。
 * 要求：请对输入的数组 就地 进行上述修改，不要从函数返回任何东西。
 */
public class DuplicateZeros {
    public static void duplicateZeros(int[] arr) {
        int[] array = new int[arr.length];
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            try {
                array[i + count] = arr[i];
                if (arr[i] == 0) {
                    count++;
                    array[i + count] = arr[i];
                }
            } catch (Exception e) {
                arr = array;
                for (int i1 : arr) {
                    System.out.println(i1);
                }
                break;
            }
        }
    }

    public static void main(String[] args) {
        duplicateZeros(new int[]{1,0,2,3,0,4,5,0});
    }

}
