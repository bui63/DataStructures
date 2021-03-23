package stack;

public class StackRunner {
    public static void main(String[] args) {
        Stack stk = new Stack(4);
         stk.isEmpty();
         stk.isFull();
         stk.push(1);
         stk.push("rahul");
         stk.push("Prakash");
         stk.push("Sanjay");
        System.out.println(stk);
        stk.isEmpty();
        stk.isFull();
        stk.push("Pragya");
        stk.pop();
        System.out.println(stk.peak());
        stk.pop();
        stk.pop();
        stk.pop();
        stk.pop();
        stk.isEmpty();
        stk.isFull();
    }
}
