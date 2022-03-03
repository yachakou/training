package training.algorithms.other;

public class RecursiveTraining {

    public static int factorial(int n) {
        if (n == 0) return 1;
        System.out.println(n);
        return n * factorial(n - 1);
    }

    public static char[] reverseString(char[] s) {

        internalReverseString(s, 0, s.length - 1);
        return s;
    }

    private static char[] internalReverseString(char[] s, int firstIndex, int lastIndex) {
        if (firstIndex == s.length / 2) {
            return s;
        }
        char temp = s[firstIndex];
        s[firstIndex] = s[lastIndex];
        s[lastIndex] = temp;
        return internalReverseString(s, firstIndex + 1, lastIndex - 1);
    }

//    private static String internalReverseString(int index, char[] s) {
//        if (index == 0) {
//            return String.valueOf(s[index]);
//        }
//        return s[index] + internalReverseString(index - 1, s);
//    }


    //     Definition for singly-linked list.
    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public static ListNode swapPairs(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode temp = head;
        head = head.next;
        temp.next = head.next;
        head.next = temp;
        if (head.next.next != null) {
            head.next.next = swapPairs(head.next.next);
        }
        return head;

    }


}
