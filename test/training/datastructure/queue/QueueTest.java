package training.datastructure.queue;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class QueueTest {


    @Test
    public void queueTest() {

        Queue<Integer> queue = new Queue<>();
        queue.queue(1);
        queue.queue(2);
        queue.queue(3);
        queue.print();
        Assertions.assertEquals(3, queue.size());
        Assertions.assertEquals(dequeueValueAndPrint(queue), 1);
        Assertions.assertEquals(2, queue.size());
        queue.print();
        Assertions.assertEquals(dequeueValueAndPrint(queue), 2);
        Assertions.assertEquals(1, queue.size());
        queue.print();
        Assertions.assertEquals(dequeueValueAndPrint(queue), 3);
        Assertions.assertEquals(0, queue.size());
        queue.print();
    }

    private Integer dequeueValueAndPrint(Queue<Integer> queue) {
        Integer dequeue = queue.dequeue();
        System.out.println("Dequeue value is : " + dequeue);
        return dequeue;
    }

}