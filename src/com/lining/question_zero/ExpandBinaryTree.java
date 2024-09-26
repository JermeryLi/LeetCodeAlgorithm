package com.lining.question_zero;

import com.lining.TreeNode;

/**
 * 描述：
 * https://leetcode.cn/problems/KnLfVT/
 * LCP 67. 装饰树
 * @author lining
 * createTime 2023/7/14 16:01
 * lastModify
 * lastModifyTime
 * 小组
 */
public class ExpandBinaryTree {

    public TreeNode expandBinaryTree(TreeNode root) {
        return null;
    }

    /**
     * 前序遍历
     * @param root
     */
    public static void preOrderTraversal(TreeNode root) {
        if (root != null) {
            System.out.print(root.val + " ");
            preOrderTraversal(root.left);
            preOrderTraversal(root.right);
        }
    }
}
