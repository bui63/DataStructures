package stack;

public class StackRunner {
    public static void main(String[] args) {
        Stack stack = new Stack(4);
         stack.isEmpty();
         stack.isFull();
         stack.push(1);
         stack.push("rahul");
         stack.push("Prakash");
         stack.push("Sanjay");
        System.out.println(stack);
        stack.isEmpty();
        stack.isFull();
        stack.push("Pragya");
        stack.pop();
        System.out.println(stack.peak());
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();
        stack.isEmpty();
        stack.isFull();
    }
}
