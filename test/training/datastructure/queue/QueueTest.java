package training.datastructure.queue;


import org.junit.jupiter.api.Test;

class QueueTest {


    @Test
    public void queueTest() {

        Queue<Integer> queue = new Queue<>();
        queue.queue(1);
        queue.queue(2);
        queue.queue(3);
        queue.print();
        dequeueValueAndPrint(queue);
        queue.print();
        dequeueValueAndPrint(queue);
        queue.print();
        dequeueValueAndPrint(queue);
        queue.print();
    }

    private void dequeueValueAndPrint(Queue<Integer> queue) {
        Integer dequeue = queue.dequeue();
        System.out.println("Dequeue value is : " + dequeue);
    }

}