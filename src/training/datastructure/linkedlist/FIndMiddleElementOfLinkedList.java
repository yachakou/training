package training.datastructure.linkedlist;

import training.datastructure.linkedlist.util.LinkedList;
import training.datastructure.linkedlist.util.Node;

public class FIndMiddleElementOfLinkedList {
    public static void main(String[] args) {
        Node<Integer> n1 = new Node.Builder<Integer>().withData(1).build();
        Node<Integer> n2 = new Node.Builder<Integer>().withData(2).build();
        Node<Integer> n3 = new Node.Builder<Integer>().withData(3).build();

        LinkedList<Integer> linkedList = new LinkedList<>(n1, n2, n3);

        Node<Integer> middle = linkedList.findMiddle();

        System.out.println("Middle element is " + middle.getData());
    }
}
