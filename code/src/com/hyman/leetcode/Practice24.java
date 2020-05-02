package com.hyman.leetcode;

import com.hyman.common.ListNode;


/**
 * 力扣 第24题  链表反转
 * @author hyman
 */
public class Practice24 {


    /**
     * 逆序链表
     * @param head
     * @return
     */
    public ListNode reverseList(ListNode head) {
        //head的长度小于2 直接返回
        if(head == null || head.next == null){
            return head;
        }
        //p和head指向头节点
        ListNode p = head;
        //q为遍历指针
        ListNode q = head.next;
        ListNode r;
        //头节点的下一节点设置为空，此时p.next=null
        head.next = null;
        //从第二节点开始循环
        while (q != null){
            //r指向原链表的下一个节点
            r = q.next;
            //q节点反向指向头节点
            q.next = p;
            //p指向反转后的链表
            p = q;
            //下一个节点成为新的q 重复以上操作直到结束
            q = r;
        }
        head = p;
        return head;
    }

    public static void main(String[] args) {
        ListNode l = new ListNode(0);
        l.next = new ListNode(2);
        l.next = new ListNode(3);

        ListNode n = l;
        l.next = null;

        System.out.println(n.next == null);
    }
}
