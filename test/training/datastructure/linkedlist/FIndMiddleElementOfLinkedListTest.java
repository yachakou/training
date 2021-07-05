package training.datastructure.linkedlist;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import training.datastructure.linkedlist.util.AbstractLinkedListNodeFactory;
import training.datastructure.linkedlist.util.LinkedList;
import training.datastructure.linkedlist.util.Node;

class FIndMiddleElementOfLinkedListTest extends AbstractLinkedListNodeFactory {

    @Test
    public void fIndMiddleElementOfLinkedListPairNode() {
        Node<Integer> node1 = createNode(1);
        Node<Integer> node2 = createNode(2);
        Node<Integer> node3 = createNode(3);

        LinkedList<Integer> linkedList = new LinkedList<>(node1, node2, node3);

        Node<Integer> result = linkedList.findMiddle();
        Assertions.assertEquals(result.getData(), 2);

    }

    @Test
    public void fIndMiddleElementOfLinkedListOddNode() {
        Node<Integer> node1 = createNode(1);
        Node<Integer> node2 = createNode(2);
        Node<Integer> node3 = createNode(3);
        Node<Integer> node4 = createNode(4);

        LinkedList<Integer> linkedList = new LinkedList<>(node1, node2, node3, node4);

        Node<Integer> result = linkedList.findMiddle();

        Assertions.assertEquals(result.getData(), 3);
    }
}