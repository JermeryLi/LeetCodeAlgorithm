package com.lining.question_thirteen;

import com.lining.TreeNode;

/**
 * @author lining
 * @Time 2023/12/8 9:43
 * 1302. 层数最深叶子节点的和
 * https://leetcode.cn/problems/deepest-leaves-sum/description/
 * 给你一棵二叉树的根节点 root ，请你返回 层数最深的叶子节点的和 。
 */
public class DeepestLeavesSum {
    // 1.1确定层级
    // 1.2求和

    // 2 在确定层级时，拿到和
    public int deepestLeavesSum(TreeNode root) {
        return sumOfDepth(root, maxDepth(root));
    }

    public int maxDepth(TreeNode root) {
        if (null == root) {
            return 0;
        }
        int leftDepth = maxDepth(root.left);
        int rightDepth = maxDepth(root.right);
        return Math.max(leftDepth, rightDepth) + 1;
    }

    public int sumOfDepth(TreeNode root, int depth) {
        if (root == null) {
            return 0;
        }
        if (depth == 1) {
            return root.val;
        } else {
            return sumOfDepth(root.left, depth - 1) + sumOfDepth(root.right, depth - 1);
        }
    }
}
