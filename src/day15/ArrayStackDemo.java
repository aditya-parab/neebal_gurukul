
package day15;
class ArrayStack<T> {

    private T[] array;

    private int top = -1;

    public ArrayStack(int size) {
        array = (T[]) new Object[size];
    }

    void push(T data) {
        if (top == array.length - 1)
            throw new RuntimeException("stack is full");

        array[++top] = data;
    }

    T pop() {
        if (top == -1)
            throw new RuntimeException("Stack is empty");

        return array[top--];
    }

    boolean isEmpty() {
        return top == -1;
    }


}

public class ArrayStackDemo {
    public static void main(String[] args) {
        ArrayStack<Integer> stack = new ArrayStack<>(4);
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);

        while (!stack.isEmpty()) {

            Integer popped = stack.pop();
            System.out.println("popped = " + popped);
        }

        ArrayStack<Integer> stack1 = new ArrayStack<>(10);

        int n = 18;
        while (n != 0) {
            stack1.push(n % 2); //0, 1,
            n = n / 2;
        }

        while (!stack1.isEmpty()) {
            System.out.print(stack1.pop());

        }

//        stack.pop();
    }
}