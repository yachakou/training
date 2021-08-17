package training.datastructure.binarysearchtree;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class BinarySearchTreeTest {

    @Test
    public void getSizeRecursion() {
        BinarySearchTree.Node<Integer> value = new BinarySearchTree.Node<>(5);
        value.setRightNode(new BinarySearchTree.Node<>(6));
        BinarySearchTree.Node<Integer> head = new BinarySearchTree.Node<>(10);
        head.setRightNode(new BinarySearchTree.Node<>(14));
        head.setLeftNode(value);
        BinarySearchTree<Integer> searchTree = new BinarySearchTree<Integer>(head);

        int size = BinarySearchTree.getSizeRecursively(searchTree.getHead());

        Assertions.assertEquals(4, size);
    }

    @Test
    public void getSize() {
        BinarySearchTree.Node<Integer> value = new BinarySearchTree.Node<>(5);
        value.setRightNode(new BinarySearchTree.Node<>(6));
        value.setLeftNode(new BinarySearchTree.Node<>(2));
        BinarySearchTree.Node<Integer> head = new BinarySearchTree.Node<>(10);
        head.setRightNode(new BinarySearchTree.Node<>(14));
        head.setLeftNode(value);
        BinarySearchTree<Integer> searchTree = new BinarySearchTree<Integer>(head);

        int size = searchTree.getSize();

        Assertions.assertEquals(5, size);

    }

}