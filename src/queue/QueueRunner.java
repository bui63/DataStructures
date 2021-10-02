package queue;

public class QueueRunner {
    public static void main(String[] args) {
        Queue queue = new Queue(5);
        queue.insertQueue(2);
        queue.insertQueue(6);
        queue.insertQueue("Rahul");
        queue.insertQueue(21);
        queue.insertQueue(61);
        System.out.println(queue);
        queue.insertQueue(63);
        queue.insertQueue(63);
        System.out.println(queue);
        queue.removeQueue();
        System.out.println(queue);
    }
}
