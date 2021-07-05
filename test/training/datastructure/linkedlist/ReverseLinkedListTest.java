package training.datastructure.linkedlist;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import training.datastructure.linkedlist.util.AbstractLinkedListNodeFactory;
import training.datastructure.linkedlist.util.LinkedList;
import training.datastructure.linkedlist.util.Node;

import java.util.ArrayList;
import java.util.List;

class ReverseLinkedListTest extends AbstractLinkedListNodeFactory {

    @Test
    void reverseLinkedList() {
        Node<Integer> head = createNode(1);
        Node<Integer> n1 = createNode(2);
        Node<Integer> n2 = createNode(3);


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