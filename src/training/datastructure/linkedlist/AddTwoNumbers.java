package training.datastructure.linkedlist;


public class AddTwoNumbers {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode res = null;
        l1.print();
        System.out.println("-----------------------------");
        l2.print();
        System.out.println("-----------------------------");


        while (l1.next != null || l2.next != null) {
            if (l1.next == null) {
                l1.next = new ListNode(0);
            }
            l1 = l1.next;

            if (l2.next == null) {
                l2.next = new ListNode(0);
            }
            l2 = l2.next;


//            ret = l1.val + l2.val / 10;
//            int i = (l1.val + l2.val) % 10;
//            if (res == null) {
//                res = new ListNode(i);
//            } else {
//                res.next = new ListNode(i);
//            }

        }

//        int val1 = getValue(l1);
//        int val2 = getValue(l2);
//
//        System.out.println(val1);
//        System.out.println(val2);
//
//        int result = val1 + val2;
//        ListNode listNode = new ListNode(result % 10);
//        result = result / 10;
//        while (result != 0 && result % 10 >= 0) {
//            System.out.println(result % 10);
//            listNode.next = new ListNode(result % 10);
//            listNode = listNode.next;
//            result = result / 10;
//        }

        // 7 --> 0 --> 8

        return res;
    }

    private int getValue(ListNode l2) {
        int val2 = 0;
        int y = 1;
        while (l2 != null) {
            val2 += l2.val * y;
            y = y * 10;
            l2 = l2.next;
        }
        return val2;
    }


    /**
     * Definition for singly-linked list.
     */
    public static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }

        public void print() {
            ListNode current = this;
            while (current != null) {
                System.out.println(current.val);
                current = current.next;
            }
        }
    }

    public static void main(String[] args) {
        AddTwoNumbers addTwoNumbers = new AddTwoNumbers();

        ListNode listNode1 = new ListNode(2, new ListNode(4));
        ListNode listNode2 = new ListNode(5, new ListNode(6, new ListNode(4)));
        //42 + 465
        addTwoNumbers.addTwoNumbers(listNode1, listNode2);
    }

}
