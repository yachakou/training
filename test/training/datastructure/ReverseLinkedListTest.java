package training.datastructure;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import training.datastructure.linkedlist.util.LinkedList;
import training.datastructure.linkedlist.util.Node;

import java.util.ArrayList;
import java.util.List;

class ReverseLinkedListTest {

    @Test
    void reverseLinkedList() {
        Node<Integer> head = new Node<>(1);
        Node<Integer> n1 = new Node<>(2);
        Node<Integer> n2 = new Node<>(3);

        LinkedList<Integer> linkedList = new LinkedList<>(head);
        linkedList.add(n1);
        linkedList.add(n2);

        linkedList.reverse();

        List<Integer> orderedData = new ArrayList<>();

        Node<Integer> current = linkedList.getHead();
        while (current != null) {
            orderedData.add(current.getData());
            current = current.getNext();
        }

        Assertions.assertArrayEquals(orderedData.toArray(), new Integer[]{3, 2, 1});
    }
}