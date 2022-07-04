package training.interview.linkedlist;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import training.interview.linkedlist.model.ListNode;

class Merge2SortedLinkedListTest {

    @Test
    void mergeTwoLists() {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(4);

        head.print();
        ListNode head2 = new ListNode(1);
        head2.next = new ListNode(3);
        head2.next.next = new ListNode(4);
        head2.print();

        ListNode listNode = Merge2SortedLinkedList.mergeTwoLists(head, head2);

        ListNode expected = new ListNode(1);
        expected.next = new ListNode(1);
        expected.next.next = new ListNode(2);
        expected.next.next.next = new ListNode(3);
        expected.next.next.next.next = new ListNode(4);
        expected.next.next.next.next.next = new ListNode(4);

        while (expected.next != null)
        {
            Assertions.assertEquals(expected.val, listNode.val);
            expected = expected.next;
            listNode = listNode.next;
        }
    }
}