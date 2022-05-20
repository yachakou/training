package training.interview.linkedlist;

import org.junit.jupiter.api.Test;
import training.interview.linkedlist.model.ListNode;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DeleteNodeInLinkedListTest {


    @Test
    public void deleteNode() {
        ListNode head = new ListNode(1);
        ListNode nodeToDelete = new ListNode(2);
        head.next = nodeToDelete;
        nodeToDelete.next = new ListNode(3);
        nodeToDelete.next.next = new ListNode(4);

        head.print();
        DeleteNodeInLinkedList.deleteNode(nodeToDelete);
        head.print();

        ListNode expectedHead = new ListNode(1);
        expectedHead.next = new ListNode(3);
        expectedHead.next.next = new ListNode(4);
        ListNode temp = head;

        while (temp != null) {
            assertEquals(expectedHead.val, temp.val);
            expectedHead = expectedHead.next;
            temp = temp.next;
        }
    }
}