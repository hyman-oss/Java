package com.hyman.leetcode;

import com.hyman.common.ListNode;

/**
 * 力扣 删除节点
 * @author hyman
 */
public class DeleteNode {

    /**
     * 删除中间节点
     * @param node
     */
    public void deleteNode(ListNode node) {
        node.val = node.next.val;
        node.next = node.next.next;
    }
}
