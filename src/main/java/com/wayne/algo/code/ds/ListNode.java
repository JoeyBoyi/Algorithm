package com.wayne.algo.code.ds;

/**
 * @author wayne
 * @ClassName ListNode
 * @Description
 * @Date : 2021/6/9 下午10:40
 */
public class ListNode {
    /**
     * 节点存储的值
     */
    int val;

    /**
     * 指向下一个节点的指针
     */
    ListNode next;

    public ListNode(int val) {
        this.val = val;
        this.next = null;
    }

    public int getVal() {
        return val;
    }

    public void setVal(int val) {
        this.val = val;
    }

    public ListNode getNext() {
        return next;
    }

    public void setNext(ListNode next) {
        this.next = next;
    }
}
