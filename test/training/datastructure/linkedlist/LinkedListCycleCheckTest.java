package training.datastructure.linkedlist;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import training.datastructure.linkedlist.util.AbstractLinkedListNodeFactory;
import training.datastructure.linkedlist.util.LinkedList;
import training.datastructure.linkedlist.util.Node;

import static org.junit.jupiter.api.Assertions.*;

class LinkedListCycleCheckTest extends AbstractLinkedListNodeFactory {

    @Test
    void isCycleShouldBeTrue() {
        Node<Integer> n1 = new Node.Builder<Integer>().withData(1).build();
        Node<Integer> n2 = new Node.Builder<Integer>().withData(2).build();
        Node<Integer> n3 = new Node.Builder<Integer>().withData(3).build();

        LinkedList<Integer> linkedList = new LinkedList<>(n1, n2, n3, n2);

        Assertions.assertTrue(linkedList.isCyclic());
    }

    @Test
    void isCycleShouldBeFalse() {
        Node<Integer> n1 = new Node.Builder<Integer>().withData(1).build();
        Node<Integer> n2 = new Node.Builder<Integer>().withData(2).build();
        Node<Integer> n3 = new Node.Builder<Integer>().withData(3).build();

        LinkedList<Integer> linkedList = new LinkedList<>(n1, n2, n3);

        Assertions.assertFalse(linkedList.isCyclic());
    }
}