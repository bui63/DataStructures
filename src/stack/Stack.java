package stack;

public class Stack {

    private int maxSize;
    private Object[] stkArray;
    private int top;

    public Stack(int maxSize) {
        this.maxSize = maxSize;
        this.stkArray = new Object[maxSize];
        this.top = -1;
    }

    public String toString() {
        String st = "[";
        for (int i = 0; i <= top; i++) {
            st = st + stkArray[i];
            if (i < top)
                st = st + ",";
        }
        return st + "]";
    }

    public void push(Object item) {
        if (top == maxSize - 1) {
            System.out.println("Stack is full");
        } else {
            top++;
            stkArray[top] = item;
        }
    }

    public Object pop() {
        Object popedItem = -1;
        if (top == -1) {
            System.out.println("Stack is Empty");
        } else {
            popedItem = stkArray[top];
            top--;

        }
        return popedItem;
    }

    public Object peak() {
        return stkArray[top];
    }

    public boolean isEmpty() {
        return (top == -1);
    }

    public boolean isFull() {
        return (maxSize - 1 == top);
    }
}