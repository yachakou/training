package training.interview.linkedlist;

import training.interview.linkedlist.model.ListNode;

public class ReverseLinkedList {

    public static ListNode reverse(ListNode head) {
        ListNode listNode = head;
        ListNode current = null;
        ListNode prev;

        while (listNode != null) {
            prev = new ListNode(listNode.val);
            prev.next = current;
            current = prev;
            listNode = listNode.next;
        }
        return current;
    }
}
