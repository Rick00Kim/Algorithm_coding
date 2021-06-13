package com.kururu.skillup.datastructure;

import lombok.extern.slf4j.Slf4j;

import java.util.Arrays;

/**
 * <h3>Data structure</h3>
 * Stack
 */
@Slf4j
public class Stack<T> {

    /* Field */
    private final Object[] stackArray;
    private final Integer maxSize;
    private Integer top;

    /* Constructor */
    public Stack(final Integer stackSize) {
        stackArray = new Object[stackSize];
        maxSize = stackSize;
        top = -1;
    }

    /* Push */
    public void push(final T target) {
        if (isFull()) {
            log.error("Stack Overflow\nIt is not able to PUSH.");
            return;
        }
        stackArray[++top] = target;
    }

    /* Pop */
    public T pop() {
        if (isEmpty()) {
            log.error("Stack is Empty...");
            return null;
        } else {
            try {
                return (T) stackArray[top];
            } finally {
                stackArray[top--] = null;
            }
        }
    }

    /* Peek */
    public T peek() {
        return (T) stackArray[top];
    }

    /* isFull */
    public boolean isFull() {
        return top == maxSize - 1;
    }

    /* isEmpty */
    public boolean isEmpty() {
        return top == -1;
    }

    @Override
    public String toString() {
        return "Stack{" +
                "stackArray=" + Arrays.toString(stackArray) +
                '}';
    }
}
