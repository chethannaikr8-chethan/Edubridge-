
class Stack {
    int stack[] = new int[10];
    int top = -1;

    void push(int value) {
        if (top == 9) {
            System.out.println("Stack Overflow!");
        } else {
            stack[++top] = value;
            System.out.println(value + " pushed into stack");
        }
    }
    void pop() {
        if (top == -1) {
            System.out.println("Stack Underflow!");
        } else {
            System.out.println("Popped element: " + stack[top--]);
        }
    }
    void peek() {
        if (top == -1) {
            System.out.println("Stack is empty");
        } else {
            System.out.println("Top element: " + stack[top]);
        }
    }
    void display() {
        if (top == -1) {
            System.out.println("Stack is empty");
        } else {
            System.out.println("Stack elements:");
            for (int i = top; i >= 0; i--) {
                System.out.println(stack[i]);
            }
        }
    }

    boolean isEmpty() {
        return top == -1;
    }

    boolean isFull() {
        return top == 9;
    }
}

public class Main {
    public static void main(String args[]) {

        Stack s = new Stack();

        s.push(10);
        s.push(20);
        s.push(30);
        s.push(40);

        s.display();
        s.peek();
        s.pop();
        s.display();

        System.out.println("Is stack empty? " + s.isEmpty());
        System.out.println("Is stack full? " + s.isFull());
    }
}
