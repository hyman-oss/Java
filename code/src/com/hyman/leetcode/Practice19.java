package com.hyman.leetcode;


/**
 * 力扣 第19题  删除倒数第n个元素
 * @author hyman
 */
public class Practice19 {

    class ListNode{
        int val;
        ListNode next;
        ListNode(int x){
            val = x;
        }
    }

    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode pre = new ListNode(0);
        pre.next = head;
        int i = 0;
        ListNode tmp = head;
        while (tmp.next != null){
            i++;
            tmp = tmp.next;
        }
        i = i-n;
        tmp = pre;
        while( i >= 0){
            i--;
            tmp = tmp.next;
        }
        tmp.next = tmp.next.next;
        return pre.next;
    }
}
