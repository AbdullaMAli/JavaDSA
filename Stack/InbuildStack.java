import java.util.Stack;

public class InbuildStack {
    public static void main(String[] args) {
        // Create a Stack
        Stack<Integer> stack = new Stack<>();

        // Push elements onto the Stack
        stack.push(5);
        stack.push(10);
        stack.push(15);

        // Peek the top element
        System.out.println("Top element is: " + stack.peek());

        // Pop elements from the Stack
        System.out.println("Popped element: " + stack.pop());

        // Check if the Stack is empty
        System.out.println("Is stack empty? " + stack.isEmpty());

        // Check the size of the Stack
        System.out.println("Stack size: " + stack.size());

        // Search for an element
        System.out.println("Position of 10: " + stack.search(10));
    }
}
