package training.datastructure.binarysearchtree;

import java.util.LinkedList;
import java.util.Queue;

public class BinarySearchTree<T> {
    Node<T> head;

    public BinarySearchTree() {
        head = null;
    }

    public BinarySearchTree(Node<T> head) {
        this.head = head;
    }

    public Node<T> getHead() {
        return head;
    }

    public boolean isEmpty() {
        return head == null;
    }


    public static int getSizeRecursively(Node node) {
        if (node == null) return 0;
        return getSizeRecursively(node.getLeftNode()) + getSizeRecursively(node.getRightNode()) + 1;
    }

    public int getSize() {
        int size = 0;
        if (head != null) {
            Queue<Node<T>> queue = new LinkedList<>();
            queue.add(head);
            while (!queue.isEmpty()) {

                Node<T> node = queue.poll();
                Node<T> leftNode = node.getLeftNode();
                Node<T> rightNode = node.getRightNode();
                if (leftNode != null) {
                    queue.add(leftNode);
                }
                if (rightNode != null) {
                    queue.add(rightNode);
                }
                size = size + 1;
            }
        }
        return size;
    }


    public static class Node<T> {
        private T value;
        private Node<T> right;
        private Node<T> left;

        public Node(T data) {
            value = data;
            left = right = null;
        }

        public T getValue() {
            return value;
        }

        public void setValue(T value) {
            value = value;
        }

        public Node<T> getRightNode() {
            return right;
        }

        public Node<T> getLeftNode() {
            return left;
        }

        public void setRightNode(Node<T> node) {
            this.right = node;

        }

        public void setLeftNode(Node<T> value) {
            left = value;
        }
    }
}
