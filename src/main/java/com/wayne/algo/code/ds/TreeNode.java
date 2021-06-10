package com.wayne.algo.code.ds;

/**
 * @author wayne
 * @ClassName TreeNode
 * @Description
 * @Date : 2021/6/9 下午10:36
 */
public class TreeNode {
    /**
     * 节点存储的值
     */
    int val;

    /**
     * 指向左侧子节点的指针
     */
    TreeNode left;

    /**
     * 指向右侧子节点的指针
     */
    TreeNode right;

    public TreeNode(int val) {
        this.val = val;
        this.left = null;
        this.right = null;
    }

    public int getVal() {
        return val;
    }

    public void setVal(int val) {
        this.val = val;
    }

    public TreeNode getLeft() {
        return left;
    }

    public void setLeft(TreeNode left) {
        this.left = left;
    }

    public TreeNode getRight() {
        return right;
    }

    public void setRight(TreeNode right) {
        this.right = right;
    }
}
