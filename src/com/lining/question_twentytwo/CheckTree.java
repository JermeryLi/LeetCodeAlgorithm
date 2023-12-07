package com.lining.question_twentytwo;

import com.lining.TreeNode;

/**
 * @author lining
 * @Time 2023/12/7 8:33
 */
public class CheckTree {
    public boolean checkTree(TreeNode root) {
        return root.val == root.left.val + root.right.val;
    }
}
