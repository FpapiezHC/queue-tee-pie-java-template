package org.example;

public class QueueTees {
    private Cutie[] queue;
    private int front;
    private int rear;
    private int count;
    private final int capacity;

    public QueueTees() {
        capacity = 10; 
        queue = new Cutie[capacity];
        front = 0;
        rear = -1;
        count = 0;
    }

    public void enqueue(Cutie cutie) {
        if (count == capacity) {
            System.out.println("Queue is full. Cannot enqueue.");
            return;
        }
        rear = (rear + 1) % capacity;
        queue[rear] = cutie;
        count++;
    }

    public Cutie dequeue() {
        if (count == 0) {
            System.out.println("Queue is empty. Cannot dequeue.");
            return null;
        }
        Cutie removed = queue[front];
        front = (front + 1) % capacity;
        count--;
        return removed;
    }

    public int size() {
        return count;
    }

    public void clear() {
        front = 0;
        rear = -1;
        count = 0;
    }
}
