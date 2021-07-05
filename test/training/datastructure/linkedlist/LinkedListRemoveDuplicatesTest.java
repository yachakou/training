package training.datastructure.linkedlist;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import training.datastructure.linkedlist.util.AbstractLinkedListNodeFactory;
import training.datastructure.linkedlist.util.LinkedList;

import java.util.List;

class LinkedListRemoveDuplicatesTest extends AbstractLinkedListNodeFactory {

    @Test
    void removeDuplicate() {
        LinkedList<Integer> linkedListFromNode = createLinkedListFromNode(1, 4, 3, 4, 5, 1, 3);

        linkedListFromNode.removeDuplicate();

        List<Integer> allData = linkedListFromNode.getAllData();
        Assertions.assertArrayEquals(allData.toArray(), new Integer[]{1, 4, 3, 5});
    }

    @Test
    void removeDuplicate2() {
        LinkedList<Integer> linkedListFromNode = createLinkedListFromNode(1, 1, 4, 4, 5, 1, 4, 3);

        linkedListFromNode.removeDuplicate2();

        List<Integer> allData = linkedListFromNode.getAllData();
        Assertions.assertArrayEquals(allData.toArray(), new Integer[]{1, 4, 5, 3});
    }
}