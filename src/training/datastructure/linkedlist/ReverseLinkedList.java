package training.datastructure.linkedlist;

import training.datastructure.linkedlist.util.LinkedList;
import training.datastructure.linkedlist.util.Node;

public class ReverseLinkedList {

    public static void main(String[] args) {

        Node<Integer> head = new Node<>(1);
        Node<Integer> n1 = new Node<>(2);
        Node<Integer> n2 = new Node<>(3);
        LinkedList<Integer> linkedList = new LinkedList<>(head);
        linkedList.add(n1);
        linkedList.add(n2);

        linkedList.print();
        linkedList.reverse();
        linkedList.print();
    }
}
