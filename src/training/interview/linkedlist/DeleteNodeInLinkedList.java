package training.interview.linkedlist;

import training.interview.linkedlist.model.ListNode;

public class DeleteNodeInLinkedList {

    public static void deleteNode(ListNode node) {
        node.val = node.next.val;
        node.next = node.next.next;
    }
}


