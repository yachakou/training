package training.interview.linkedlist;

import org.junit.jupiter.api.Test;
import training.interview.linkedlist.model.ListNode;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ReverseLinkedListTest {


    @Test
    public void deleteNode() {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);

        head.print();
        ListNode reverse = ReverseLinkedList.reverse(head);
        reverse.print();

        ListNode res = new ListNode(4);
        res.next = new ListNode(3);
        res.next.next = new ListNode(2);
        res.next.next.next = new ListNode(1);

        while (reverse != null) {
            assertEquals(reverse.val, res.val);
            reverse = reverse.next;
            res = res.next;
        }
    }
}