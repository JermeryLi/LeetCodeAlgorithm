package com.lining.question_twentyone;

import com.lining.ListNode;

/***
 * @author lining
 * @description
 * @create 2024/9/28 10:13
 * https://leetcode.cn/problems/merge-nodes-in-between-zeros/description/
 * 2181. 合并零之间的节点
 * 给你一个链表的头节点 head ，该链表包含由 0 分隔开的一连串整数。链表的 开端 和 末尾 的节点都满足 Node.val == 0 。
 
 * 对于每两个相邻的 0 ，请你将它们之间的所有节点合并成一个节点，其值是所有已合并节点的值之和。
 * 然后将所有 0 移除，修改后的链表不应该含有任何 0 。
 *
 *  返回修改后链表的头节点 head 。
 **/
public class MergeNodes {
    public ListNode mergeNodes(ListNode head) {
        // 创建虚拟头节点，用于构建结果链表
        ListNode dummy = new ListNode(0);
        // 当前结果链表的指针
        ListNode current = dummy;
        // 累加两个0之间的节点值
        int sum = 0;
        
        // 遍历原链表
        while (head != null) {
            // 如果当前节点值为0
            if (head.val == 0) {
                // 当累加和不为0时，说明有节点需要合并
                if (sum != 0) {
                    // 创建新节点并链接到结果链表
                    current.next = new ListNode(sum);
                    current = current.next;
                    sum = 0;
                }
            } else {
                // 累加非0节点的值
                sum += head.val;
            }
            head = head.next;
        }
        
        return dummy.next;
    }
}
