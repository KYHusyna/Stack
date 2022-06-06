package com;

public class Stack {
    private int maxSize;
    private int[] stackArr;
    private int top;

    public Stack(int size) {
        this.maxSize = size;
        stackArr = new int[maxSize];
        top = -1;
    }

    public int readTop() {
        return stackArr[top];
    }

    public void addElement_Push(int newElement) {
        stackArr[++top] = newElement;//create element
    }

    public int deleteElement_Pop() {//delete element
        return stackArr[top--];
    }

    public boolean stackIsEmpty() {//check stack
        return (top == -1);
    }

    public boolean StackIsFull() {//check stack
        return (top == maxSize - 1);
    }
}

