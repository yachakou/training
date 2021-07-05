package training.datastructure.linkedlist;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import training.datastructure.linkedlist.util.AbstractLinkedListNodeFactory;
import training.datastructure.linkedlist.util.LinkedList;

class FindLinkedListLenghtTest extends AbstractLinkedListNodeFactory {

    @Test
    void findLenghtUsingRecursion() {
        LinkedList<Integer> linkedListFromNode = createLinkedListFromNode(1, 2, 3);

        int lenght = linkedListFromNode.lenghtRecursive(linkedListFromNode.getHead());
        Assertions.assertEquals(3, lenght);
    }

    @Test
    void findLenght() {
        LinkedList<Integer> linkedListFromNode = createLinkedListFromNode(1, 2, 3, 4);

        int lenght = linkedListFromNode.lenght();
        Assertions.assertEquals(4, lenght + 1);
    }
}