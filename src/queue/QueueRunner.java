package queue;

public class QueueRunner {
    public static void main(String[] args) {
        Queue q = new Queue(5);
        q.insertQueue(2);
        q.insertQueue(6);
        q.insertQueue("Rahul");
        q.insertQueue(21);
        q.insertQueue(61);
        System.out.println(q);
        q.insertQueue(63);
        q.insertQueue(63);
        System.out.println(q);
        q.removeQueue();
        System.out.println(q);
    }
}
