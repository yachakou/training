package training.datastructure.linkedlist.util;

import java.util.Arrays;

public class LinkedList<T> {

    private Node<T> head;

    public LinkedList(Node<T> head) {
        this.head = head;
    }

    @SafeVarargs
    public LinkedList(Node<T>... nodes) {
        if (nodes.length <= 0) {
            throw new IllegalArgumentException("LinkedList requires at least one node");
        }
        Arrays.stream(nodes).findFirst().ifPresent((tNode -> this.head = tNode));
        Node<T> current = head;
        for (int i = 1; i < nodes.length; i++) {
            current.setNext(nodes[i]);
            current = current.getNext();
        }
    }

    public Node<T> getHead() {
        return head;
    }


    public void add(Node<T> node) {
        Node<T> current = head;
        while (current != null) {
            if (current.getNext() == null) {
                current.setNext(node);
                break;
            } else {
                current = current.getNext();
            }
        }
    }

    public void print() {
        Node<T> current = head;
        while (current != null) {
            System.out.println(current.getData());
            current = current.getNext();
        }
    }

    public void reverse() {
        Node<T> pointer = head;
        Node<T> previous = null, current = null;
        while (pointer != null) {
            current = pointer;
            pointer = pointer.getNext();

            current.setNext(previous);
            previous = current;
            head = current;
        }
    }

    public Node<T> findMiddle() {
        Node<T> current = this.head, middle = this.head;
        int lenght = 0;
        while (current.getNext() != null) {
            lenght++;
            if (lenght % 2 == 0) {
                middle = middle.getNext();
            }
            current = current.getNext();
        }
        if (lenght % 2 == 1) {
            middle = middle.getNext();
        }
        return middle;
    }

    public int lenght() {
        Node<T> current = this.head;
        int lenght = 0;
        while (current.getNext() != null) {
            lenght++;
            current = current.getNext();
        }
        return lenght;
    }

    public int lenghtRecursive(Node<T> current) {
        if (current == null) {
            return 0;
        }
        return 1 + lenghtRecursive(current.getNext());
    }

    public boolean isCyclic() {
        Node<T> fast = head, slow = head;

        while (fast != null && fast.getNext() != null) {
            fast = fast.getNext().getNext();
            slow = slow.getNext();

            if (fast == slow){
                return true;
            }
        }

        return false;
    }
}

