package training.interview.linkedlist;

import training.interview.linkedlist.model.ListNode;

public class Merge2SortedLinkedList {

    @Deprecated
    public ListNode mergeTwoListsv1(ListNode list1, ListNode list2) {
        ListNode head = null;
        ListNode start = null;

        while (list1 != null || list2 != null) {
            int nextVal = 0;
            if (list1 != null && list2 != null) {
                if (list1.val <= list2.val) {
                    nextVal = list1.val;
                    list1 = list1.next;
                } else if (list2.val <= list1.val) {
                    nextVal = list2.val;
                    list2 = list2.next;
                }
            } else if (list1 != null && list2 == null) {
                nextVal = list1.val;
                list1 = list1.next;
            } else if (list2 != null && list1 == null) {
                nextVal = list2.val;
                list2 = list2.next;
            }

            if (head == null) {
                head = new ListNode(nextVal);
                start = head;
            } else {
                head.next = new ListNode(nextVal);
                head = head.next;
            }

        }
        return start;
    }

    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {

        ListNode dummy = new ListNode(0);
        ListNode head = dummy;

        while (true) {
            if (list1 == null) {
                head.next = list2;
                break;
            }
            if (list2 == null) {
                head.next = list1;
                break;
            }
            if (list1.val <= list2.val) {
                head.next = list1;
                list1 = list1.next;
            } else {
                head.next = list2;
                list2 = list2.next;
            }
            head = head.next;
        }
        dummy.print();
        return dummy.next;
    }
}
