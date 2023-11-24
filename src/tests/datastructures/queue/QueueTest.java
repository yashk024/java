package tests.datastructures.queue;

import com.datastructures.queue.Queue;

public class QueueTest {

    public static void main(String[] args) {
        Queue queue = new Queue();

        queue.enqueue(20);
        queue.enqueue(30);
        queue.enqueue(40);
        queue.enqueue(50);

        System.out.println(queue);

        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());

        queue.enqueue(60);

        System.out.println(queue);
        System.out.println(queue.isEmpty());
        System.out.println(queue.size());
    }

}
