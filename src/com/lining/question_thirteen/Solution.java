package com.lining.question_thirteen;

import com.lining.TreeNode;

class Solution {
    int maxPathSum;

    public int maxPathSum(TreeNode root) {
        maxPathSum = Integer.MIN_VALUE;
        maxGain(root);
        return maxPathSum;
    }

    private int maxGain(TreeNode node) {
        if (node == null) {
            return 0;
        }

        // 只有当左子树贡献为正时，才会选择左子树
        int leftGain = Math.max(maxGain(node.left), 0);

        // 只有当右子树贡献为正时，才会选择右子树
        int rightGain = Math.max(maxGain(node.right), 0);

        // 当前节点的值加上其左右子树的最大贡献
        int priceNewPath = node.val + leftGain + rightGain;

        // 更新最大路径和
        maxPathSum = Math.max(maxPathSum, priceNewPath);

        // 返回节点的最大贡献值
        return node.val + Math.max(leftGain, rightGain);
    }
}