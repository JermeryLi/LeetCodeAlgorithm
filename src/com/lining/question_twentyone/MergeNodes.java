package com.lining.question_twentyone;

import com.lining.ListNode;
import jdk.nashorn.internal.ir.WhileNode;

import java.util.WeakHashMap;

/***
 * @author lining
 * @description
 * @create 2024/9/28 10:13
 * https://leetcode.cn/problems/merge-nodes-in-between-zeros/description/
 * 2181. 合并零之间的节点
 * 给你一个链表的头节点 head ，该链表包含由 0 分隔开的一连串整数。链表的 开端 和 末尾 的节点都满足 Node.val == 0 。
 *
 * 对于每两个相邻的 0 ，请你将它们之间的所有节点合并成一个节点，其值是所有已合并节点的值之和。
 * 然后将所有 0 移除，修改后的链表不应该含有任何 0 。
 *
 *  返回修改后链表的头节点 head 。
 **/
public class MergeNodes {
    public ListNode mergeNodes(ListNode head) {
        int sum = 0;
        ListNode node = new ListNode();
        while (head.next != null) {
            if (head.val == 0) {
                if (sum != 0) {
                    node.val = sum;
                    ListNode listNode = new ListNode();
                    sum = 0;
                }
            } else {
                sum += head.val;
            }
            head = head.next;
        }
        return node;
    }
}
