package com.ds.queue;

public class CircularArrayQueue {
    private final int[] queue;
    private final int size;
    private int rare;
    private int front;

    public CircularArrayQueue(int size) {
        this.size = size;
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
            rare = (rare + 1) % size;
            queue[rare] = value;
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

        front = (front + 1) % size;
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
        return front == (rare + 1) % size;
    }

    private void reset() {
        rare = -1;
        front = -1;
    }
}
