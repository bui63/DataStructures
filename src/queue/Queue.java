package queue;

public class Queue {

    private int maxSize;
    private Object[] queueArr;
    private int front;
    private int rear;
    private int nItems; // counter for no. of items

    public Queue(int maxSize) {
        this.maxSize = maxSize;
        this.queueArr = new Object[maxSize];
        this.front = 0;
        this.rear = -1;
        this.nItems = 0;
    }

    public void insertQueue(Object object) {
        if(rear==maxSize-1){
            System.out.println("Queue is full");
        } else {
        rear++;
        queueArr[rear] = object;
        nItems++;
        }
    }

    public String toString() {
        String st = "[";
        for (int i = front; i <= rear; i++) {
            st = st + queueArr[i];
            if (i < rear)
                st = st + ",";
        }
        return st + "]";
    }

    public void removeQueue() {
        if(front==rear+1) {
            System.out.println("Queue is empty.");
        }
        else {
            front++;
        }

    }

}
