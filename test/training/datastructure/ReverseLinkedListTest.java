package training.datastructure;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

class ReverseLinkedListTest {

    @Test
    void reverseLinkedList() {
        ReverseLinkedList.MyLinkedList.Node<Integer> head = new ReverseLinkedList.MyLinkedList.Node<>(1);
        ReverseLinkedList.MyLinkedList.Node<Integer> n1 = new ReverseLinkedList.MyLinkedList.Node<>(2);
        ReverseLinkedList.MyLinkedList.Node<Integer> n2 = new ReverseLinkedList.MyLinkedList.Node<>(3);

        ReverseLinkedList.MyLinkedList<Integer> linkedList = new ReverseLinkedList.MyLinkedList<>(head);
        linkedList.add(n1);
        linkedList.add(n2);

        linkedList.reverse();

        List<Integer> orderedData = new ArrayList<>();

        ReverseLinkedList.MyLinkedList.Node<Integer> current = linkedList.getHead();
        while (current != null) {
            orderedData.add(current.getData());
            current = current.getNext();
        }

        Assertions.assertArrayEquals(orderedData.toArray(), new Integer[]{3, 2, 1});
    }
}