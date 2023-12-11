package com.lining.question_zero;

import com.lining.TreeNode;

/**
 * @author lining
 * @Time 2023/12/8 8:55
 * https://leetcode.cn/problems/w6cpku/
 * LCR 054. 把二叉搜索树转换为累加树
 * 给定一个二叉搜索树，请将它的每个节点的值替换成树中大于或者等于该节点值的所有节点值之和。
 */
public class ConvertBST {
    int sum = 0;

    public TreeNode convertBST(TreeNode root) {
        if (root == null) {
            return root;
        }
        convertBST(root.right);
        root.val += sum;
        sum = root.val;
        convertBST(root.left);
        return root;
    }


}
