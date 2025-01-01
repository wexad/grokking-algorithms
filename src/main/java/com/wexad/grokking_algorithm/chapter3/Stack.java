package com.wexad.grokking_algorithm.chapter3;

/**
 * Stack implementation in java
 */

class Stack<E> {

    private final E[] arr;
    private int top;

    @SuppressWarnings("unchecked")
    Stack(int size) {
        this.arr = (E[]) new Object[size];
        top = -1;
    }

    public void push(E element) {
        if (top == arr.length - 1) throw new StackOverflowError("Stack is full");
        arr[++top] = element;
    }

    public E pop() {
        if (top == -1) throw new StackOverflowError("Stack is empty");
        return arr[top--];
    }

    public E peek() {
        return arr[top];
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == arr.length - 1;
    }

    public void printStack() {
        if (isEmpty()) System.out.println("Stack is empty");
        for (int i = top; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Stack stack = new Stack(5);

        stack.push(1);
        stack.push(2);
        stack.push(3);

        stack.printStack();
        System.out.println(stack.peek());
        System.out.println(stack.pop());

        stack.printStack();
    }
}
