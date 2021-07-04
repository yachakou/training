package training.datastructure;

public class ReverseLinkedList {

    public static void main(String[] args) {


        MyLinkedList.Node<Integer> head = new MyLinkedList.Node<>(1);
        MyLinkedList.Node<Integer> n1 = new MyLinkedList.Node<>(2);
        MyLinkedList.Node<Integer> n2 = new MyLinkedList.Node<>(3);
        MyLinkedList<Integer> linkedList = new MyLinkedList<>(head);
        linkedList.add(n1);
        linkedList.add(n2);

        linkedList.print();
        linkedList.reverse();
        linkedList.print();

    }


    public static class MyLinkedList<T> {

        private Node<T> head;

        public MyLinkedList(Node<T> head) {
            this.head = head;
        }

        public Node<T> getHead() {
            return head;
        }

        static class Node<T> {
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
        }

        public void add(Node<T> node) {
            Node<T> current = head;
            while (current != null) {
                if (current.next == null) {
                    current.next = node;
                    break;
                } else {
                    current = current.next;
                }
            }
        }

        public void print() {
            Node<T> current = head;
            while (current != null) {
                System.out.println(current.data);
                current = current.next;
            }
        }

        public void reverse() {
            Node<T> pointer = head;
            Node<T> previous = null, current  = null;
            while (pointer != null) {
                current = pointer;
                pointer = pointer.next;

                current.next = previous;
                previous = current;
                head = current;
            }
        }
    }
}
