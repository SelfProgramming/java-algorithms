package com.ds.queue;

public class ArrayQueue {
    private final int[] queue;
    private int rare;
    private int front;

    public ArrayQueue(int size) {
        this.queue = new int[size];
        front = -1;
        rare = -1;
    }


    public boolean enQueue(int value) {
        if (isFull()) {
            return false;
        }

        if (rare == -1 && front == -1) {
            rare = 0;
            front = 0;
            queue[rare] = value;
        } else {
            queue[++rare] = value;
        }
        return true;
    }

    public boolean deQueue() {
        if (isEmpty()) {
            return false;
        }

        if (front == rare) {
            reset();
            return true;
        }

        front++;
        return true;
    }

    public int Front() {
        if (isEmpty()) {
          return -1;
        }

        return queue[front];
    }

    public int Rear() {
        if (isEmpty()) {
            return -1;
        }

        return queue[rare];
    }

    public boolean isEmpty() {
        return rare == -1 && rare == front;
    }

    public boolean isFull() {
        return rare == queue.length - 1;
    }

    private void reset() {
        rare = -1;
        front = -1;
    }
}
