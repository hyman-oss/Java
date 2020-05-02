package com.hyman.leetcode;

import com.hyman.common.ListNode;

import java.util.ArrayList;
import java.util.List;

/**
 * 力扣 第141题 环形链表
 * @author hyman
 */
public class Practice141 {

    /**
     * 解法1
     * @param head
     * @return
     */
    public boolean hasCycle(ListNode head) {
        if(head == null || head.next == null){
            return false;
        }
        List<ListNode> list = new ArrayList<>();
        ListNode tmp = head;
        while (tmp.next != null){
            if(list.contains(tmp.val)){
                return true;
            }else {
               list.add(tmp);
            }

        }
        return false;
    }

    /**
     * 解法2 快慢指针法
     * @param head
     * @return
     */
    public boolean hasCycle2(ListNode head) {
        if(head == null || head.next == null){
            return false;
        }
        ListNode slow = head;
        ListNode fast = head.next;
        while (slow != fast){
            if(fast == null || fast.next == null){
                return false;
            }

            slow = slow.next;
            fast = fast.next.next;
        }
        return true;
    }

    public static void main(String[] args) {

    }
}
