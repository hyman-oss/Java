package com.hyman.leetcode;

import com.hyman.common.ListNode;


/**
 * 力扣 第2题  两数相加
 * @author hyman
 */
public class Practice2 {

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if(l1 == null && l2 == null){
            return  null;
        }
        ListNode p = new ListNode(0);
        ListNode q = p;
        int addOne = 0;

        while (l1 != null || l2 !=null || addOne > 0 ){
            int i = l1 == null ? 0 : l1.val;
            int j = l2 == null ? 0 : l2.val;
            int sum = i+j+addOne;
            q.next = new ListNode(sum % 10);
            addOne = sum / 10;
            q = q.next;
            if(l1 != null) l1 = l1.next;
            if(l2 != null) l2 = l2.next;
        }
        return p.next;
    }

    public static void main(String[] args) {
        ListNode l1 = new ListNode(4);
        ListNode l2 = new ListNode(5);
        l1.next = new ListNode(6);
        l2.next = new ListNode(7);
        Practice2.addTwoNumbers(l1,l2);
    }
}
