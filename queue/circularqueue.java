package queue;

import java.util.*;


public class circularqueue {
    private int[] queue;
    private int front, rear, capacity;

    public circularqueue(int capacity) {
        this.capacity = capacity;
        queue = new int[capacity];
        front = 0;
        rear = -1;
    }

    public boolean enqueue(int element) {
        // Check if the queue is full
        if ((rear + 1) % capacity == front && rear != -1) {
            System.out.println("Queue is full. Cannot enqueue element: " + element);
            return false;
        }
        // Update the rear pointer and insert the element
        rear = (rear + 1) % capacity;
        queue[rear] = element;
        return true;
    }

    public int dequeue() {
        // Check if the queue is empty
        if (front == (rear + 1) % capacity && rear == -1) {
            System.out.println("Queue is empty. Cannot dequeue element.");
            return -1; // Assuming -1 is an invalid value for the queue elements
        }
        // Retrieve and remove the front element
        int element = queue[front];
        // Update the front pointer
        front = (front + 1) % capacity;
        // If the queue becomes empty after the dequeue, reset front and rear
        if (front == (rear + 1) % capacity) {
            front = 0;
            rear = -1;
        }
        return element;
    }

    public int peek() {
        // Check if the queue is empty
        if (front == (rear + 1) % capacity && rear == -1) {
            System.out.println("Queue is empty. Cannot peek element.");
            return -1; // Assuming -1 is an invalid value for the queue elements
        }
        return queue[front];
    }

    public static void main(String[] args) {
        circularqueue cq = new circularqueue(5);

        cq.enqueue(10);
        cq.enqueue(20);
        cq.enqueue(30);
        cq.enqueue(40);
        cq.enqueue(50);

        System.out.println("Dequeued: " + cq.dequeue());
        System.out.println("Front element: " + cq.peek());

        cq.enqueue(60);

        while (cq.peek() != -1) {
            System.out.println("Dequeued: " + cq.dequeue());
        }

        System.out.println("Queue is empty: " + (cq.peek() == -1));
    }
}
