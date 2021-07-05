package training.datastructure.linkedlist;

import training.datastructure.linkedlist.util.LinkedList;
import training.datastructure.linkedlist.util.Node;

public class LinkedListRemoveDuplicates {
    public static void main(String[] args) {
        Node<Integer> n2 = new Node.Builder<Integer>().withData(28).build();
        Node<Integer> n1 = new Node.Builder<Integer>().withData(1).build();
        Node<Integer> n3 = new Node.Builder<Integer>().withData(3).build();
        Node<Integer> n4 = new Node.Builder<Integer>().withData(1).build();
        Node<Integer> n5 = new Node.Builder<Integer>().withData(9).build();
        Node<Integer> n6 = new Node.Builder<Integer>().withData(28).build();

        LinkedList<Integer> linkedList = new LinkedList<>(n2, n1, n3, n4, n6, n5);
        linkedList.print();
        linkedList.removeDuplicate();
        linkedList.print();

    }
}
