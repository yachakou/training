package training.interview.linkedlist.model;

public class ListNode {

    public int val;
    public ListNode next;

    public ListNode(int x) {
        val = x;
    }

    public ListNode() {
    }

    public ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }

    public void print() {
        ListNode temp = this;
        StringBuilder output = new StringBuilder("START --> ");
        while (temp != null) {
            output.append(temp.val).append(" --> ");
            temp = temp.next;
        }
        output.append("NULL");
        System.out.println(output);
    }

}
