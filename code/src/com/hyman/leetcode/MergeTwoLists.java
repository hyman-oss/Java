package com.hyman.leetcode;

import com.hyman.common.ListNode;


/**
 * 力扣 第21题  链表合并
 * @author hyman
 */
public class MergeTwoLists {

    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if(l1 == null && l2 == null){
            return null;
        }
        ListNode head = new ListNode(0);
        ListNode p = head;
        while (l1 != null || l2 != null){
            int minValue = 0;
            if(l1 != null && l2 != null){
                minValue = Math.min(l1.val,l2.val);
            }else if (l1 == null){
                minValue = l2.val;
            }else {
                minValue = l1.val;
            }
            head.next = new ListNode(minValue);
            head = head.next;
            if(l1 != null && l1.val == minValue) {
                l1 = l1.next;
            } else if(l2 != null) {
                l2 = l2.next;
            }
        }
        return p.next;
    }

    public static void main(String[] args) {
        ListNode l1 = new ListNode(1);
        ListNode l2 = new ListNode(2);
        l1.next = new ListNode(3);
        l1.next.next = new ListNode(4);
        l2.next = new ListNode(2);
        l2.next.next = new ListNode(4);
        MergeTwoLists.mergeTwoLists(l1,l2);
    }
}
