package training.datastructure.stack;

/**
 * LIFO principle => Last In, First Out
 */
public class Stack<T> {

    private Node<T> head;

    public static class Node<T> {
        private T data;
        private Node<T> next;

        public Node(T data) {
            this.data = data;
        }
    }

    public void push(T data) {
        Node<T> newNode = new Node<>(data);
        newNode.next = head;
        head = newNode;
    }

    public T pop() {
        if (head == null) {
            throw new IllegalStateException("Stack is empty");
        }
        T value = head.data;
        head = head.next;
        return value;
    }

    public int size() {
        int count = 0;
        Node<T> current = head;
        while (current != null) {
            count++;
            current = current.next;
        }
        return count;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void print() {
        Node<T> current = head;
        int count = 1;
        if (head != null) {

            while (current != null) {
                System.out.println("position : " + count + " value : " + current.data);
                current = current.next;
                count++;
            }
        } else {
            System.out.println("Stack is empty.");
        }
    }

}
