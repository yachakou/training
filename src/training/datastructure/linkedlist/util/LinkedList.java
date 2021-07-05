package training.datastructure.linkedlist.util;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

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

            if (fast == slow) {
                return true;
            }
        }

        return false;
    }

    public void removeDuplicate() {
        Node<T> loop1 = head, loop2 = null;
        while (loop1 != null && loop1.getNext() != null) {
            loop2 = loop1;
            while (loop2 != null && loop2.getNext() != null) {
                if (loop1.getData() == loop2.getNext().getData()) {
                    System.out.println("found duplicate " + loop1.getData());
                    loop2.setNext(loop2.getNext().getNext());
                } else {
                    loop2 = loop2.getNext();
                }
            }
            loop1 = loop1.getNext();
        }
    }

    public void removeDuplicate2() {
        Node<T> current = head, prev = null;
        HashSet<T> hashSet = new HashSet<>();
        while (current != null) {
            T data = current.getData();
            if (!hashSet.contains(data)) {
                hashSet.add(data);
                prev = current;
            } else {
                System.out.println("Found duplicate " + data);
                prev.setNext(current.getNext());
            }
            current = current.getNext();
        }
    }

    public List<T> getAllData() {
        List<T> result = new ArrayList<>();
        Node<T> node = head;
        while (node != null) {
            result.add(node.getData());
            node = node.getNext();
        }
        return result;
    }
}

