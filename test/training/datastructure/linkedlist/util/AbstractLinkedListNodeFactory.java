package training.datastructure.linkedlist.util;

import java.util.Arrays;

public abstract class AbstractLinkedListNodeFactory {

    public final Node<Integer> createNode(Integer data) {
        return new Node.Builder<Integer>().withData(data).build();
    }

    public final LinkedList<Integer> createLinkedListFromNode(Integer... data) {
        LinkedList<Integer> integerLinkedList = new LinkedList<>(createNode(data[0]));
        Arrays.stream(data).skip(1).map(Node::new).forEach(integerLinkedList::add);
        return integerLinkedList;
    }

}
