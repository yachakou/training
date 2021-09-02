package training.datastructure.queue;

public class Queue<T> {

    private Node<T> head;
    private Node<T> tail;

    private static class Node<T> {
        private final T data;
        private Node<T> next;

        public Node(T data) {
            this.data = data;
        }
    }

    public void queue(T value) {
        Node<T> newNode = new Node<>(value);

        if (tail != null) {
            tail.next = newNode;
        }
        tail = newNode;
        if (head == null) {
            head = tail;
        }
    }

    public T dequeue() {
        T value;
        if (head != null) {
            value = head.data;
            if (head.next != null) {
                head = head.next;
            } else {
                head = null;
            }
        } else {
            throw new IllegalStateException("There is no element in this queue");
        }
        return value;
    }

    public void print() {
        if (head != null) {
            Node<T> current = head;
            int position = 1;
            while (current != null) {
                System.out.println("position : " + position + " , value : " + current.data);
                current = current.next;
                position++;
            }
        } else {
            System.out.println("Queue is empty.");
        }
    }

    public int size() {
        int counter = 0;
        Node<T> current = head;
        while (current != null) {
            current = current.next;
            counter++;
        }
        return counter;
    }
}
