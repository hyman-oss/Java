package com.hyman.leetcode;

import com.hyman.common.ListNode;

/**
 * 力扣 第24题 两两交换节点
 * @author hyman
 */
public class SwapPairs {

    public static ListNode swapPairs(ListNode head) {
        if(head == null){
            return null;
        }
        ListNode p = head;
        ListNode q = head.next;
        ListNode r;
        int tmp = 0;
        while (p != null && q != null){
            tmp = p.val;
            r = p;

            p.val = q.val;
            p = q;

            q.val = tmp;
            q = r;

            if(p != null)p = p.next;
            if(p != null)q = p.next;
        }
        return head;
    }

    public static void main(String[] args) {
        ListNode test = new ListNode(1);
        test.next = new ListNode(2);
        test.next.next = new ListNode(3);
        test.next.next.next = new ListNode(4);
        SwapPairs.swapPairs(test);
    }
}
