import java.util.Stack;

public class ReverseStack {
    
    // Function to insert an element at the bottom of the stack
    static void insertAtBottom(Stack<Integer> stack, int item) {
        if (stack.isEmpty()) {
            stack.push(item);
        } else {
            int temp = stack.pop();
            insertAtBottom(stack, item);
            stack.push(temp);
        }
    }

    // Function to reverse the stack using recursion
    static void reverse(Stack<Integer> stack) {
        if (!stack.isEmpty()) {
            int temp = stack.pop();
            reverse(stack);
            insertAtBottom(stack, temp);
        }
    }

    // Function to print the stack
    static void printStack(Stack<Integer> stack) {
        System.out.println(stack);
    }

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        
        stack.push(4);
        stack.push(3);
        stack.push(2);
        stack.push(1);

        System.out.println("Original Stack: ");
        printStack(stack);

        reverse(stack);

        System.out.println("Reversed Stack: ");
        printStack(stack);
    }
}
