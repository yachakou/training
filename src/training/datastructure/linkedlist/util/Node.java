package training.datastructure.linkedlist.util;

public class Node<T> {
    private T data;
    private Node<T> next;

    public Node(T data) {
        this.data = data;
    }

    public T getData() {
        return data;
    }

    public Node<T> getNext() {
        return next;
    }

    public void setNext(Node<T> next) {
        this.next = next;
    }

    @Override
    public String toString() {
        return "Node : {data=" + data + '}';
    }

    public static class Builder<T> {
        private T data;
        private Node<T> next;

        public Builder<T> withData(T data) {
            this.data = data;
            return this;
        }

        public Builder<T> withNextNode(Node<T> next) {
            this.next = next;
            return this;
        }

        public Node<T> build() {
            return new Node<T>(data);
        }
    }
}