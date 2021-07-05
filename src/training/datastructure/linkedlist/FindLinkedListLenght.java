package training.datastructure.linkedlist;

import training.datastructure.linkedlist.util.LinkedList;
import training.datastructure.linkedlist.util.Node;

public class FindLinkedListLenght {
    public static void main(String[] args) {
        Node<String> n1 = new Node.Builder<String>().withData("a").build();
        Node<String> n2 = new Node.Builder<String>().withData("b").build();
        Node<String> n3 = new Node.Builder<String>().withData("c").build();

        LinkedList<String> linkedList = new LinkedList<>(n1, n2, n3);

        System.out.println("Linked list lenght is " + linkedList.lenght());
        System.out.println("Linked list lenght (using recursive method) is " + linkedList.lenghtRecursive(linkedList.getHead()));
    }

}
