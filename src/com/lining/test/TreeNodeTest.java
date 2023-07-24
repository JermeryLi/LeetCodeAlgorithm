package com.lining.test;

import sun.reflect.generics.tree.Tree;

/**
 * 描述：
 *
 * @author lining
 * createTime 2023/7/24 11:05
 * lastModify
 * lastModifyTime
 * 小组
 */
public class TreeNodeTest {


    /**
     * 构建一个示例二叉树
     *
     * @return TreeNode
     */
    public static TreeNode buildExampleBinaryTree() {
        // 创建节点
        TreeNode root = new TreeNode(1);
        TreeNode node2 = new TreeNode(2);
        TreeNode node3 = new TreeNode(3);
        TreeNode node4 = new TreeNode(4);
        TreeNode node5 = new TreeNode(5);
        TreeNode node6 = new TreeNode(6);
        TreeNode node7 = new TreeNode(7);
        TreeNode node8 = new TreeNode(8);
        TreeNode node9 = new TreeNode(9);
        TreeNode node10 = new TreeNode(10);
        TreeNode node11 = new TreeNode(11);

        // 构建树的结构
        root.left = node2;
        root.right = node3;
        node2.left = node4;
        node2.right = node5;
        node3.left = node6;
        node3.right = node7;
        node4.left = node8;
        node5.right = node9;
        node6.left = node10;
        node7.right = node11;

        // 返回树的根节点
        return root;
    }

    //前序遍历
    public static void preOrderTraversal(TreeNode root) {
        if (root != null) {
            System.out.print(root.val + " ");
            preOrderTraversal(root.left);
            preOrderTraversal(root.right);
        }
    }

    // 中序遍历
    public static void inOrderTraversal(TreeNode root) {
        if (root != null) {
            inOrderTraversal(root.left);
            System.out.print(root.val + " ");
            inOrderTraversal(root.right);
        }
    }

    // 后序遍历
    public static void postOrderTraversal(TreeNode root) {
        if (root != null) {
            postOrderTraversal(root.left);
            postOrderTraversal(root.right);
            System.out.print(root.val + " ");
        }
    }

    public static void main(String[] args) {
        TreeNode treeNode = buildExampleBinaryTree();
        preOrderTraversal(treeNode);
        System.out.println();
        inOrderTraversal(treeNode);
        System.out.println();
        postOrderTraversal(treeNode);
    }
}
