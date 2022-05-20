package training.interview.linkedlist;

import training.interview.linkedlist.model.ListNode;

public class RemoveNodeFromEndOfList {

    /**
     * 1 - calculate the size
     * 2 - calculate the index that needs to be removed
     * 3 - use 2 pointer (1 before and 1 current) to get to the index
     * 4 - link the previous pointer to the nex of the current (which is the node we want to delete).
     */
    public static ListNode removeNthFromEnd(ListNode head, int n) {

        int size = getSize(head);

        int index = size - n;

        if (index == 0) {
            return head.next;
        }

        ListNode curr = head;
        ListNode prev = null;
        while (index > 0) {
            prev = curr;
            curr = curr.next;
            --index;
        }
        prev.next = curr.next;
        curr.next = null;
        return head;
    }

    private static int getSize(ListNode head) {
        int size = 0;
        ListNode temp = head;
        while (temp != null) {
            size++;
            temp = temp.next;
        }
        return size;
    }
}
