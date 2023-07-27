package com.lining;

/**
 * 描述：
 *
 * @author lining
 * createTime 2023/7/14 16:18
 * lastModify
 * lastModifyTime
 * 小组
 */
public class TreeNode {
    public int val;
    public TreeNode left;
    public TreeNode right;

    TreeNode() {
    }

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
        System.out.println("1111");
    }
}