package com.datastructures.queue;

public class Queue {

    private static class Node {
        private final int data;
        private Node next;

        private Node(int data) {
            this.data = data;
        }
    }

    private Node front, rear;

    private int size;

    public void enqueue(int item) {
        if (rear == null) {
            front = rear = new Node(item);
        } else {
            rear.next = new Node(item);
            rear = rear.next;
        }
        size++;
    }

    public int dequeue() {
        if (front == null) {
            throw new RuntimeException("cannot remove item from empty queue");
        }
        Node n = front;
        if (front == rear) {
            front = rear = null;
        } else {
            front = front.next;
        }
        size--;
        return n.data;
    }

    public boolean isEmpty() {
        return front == null;
    }

    public int size() {
        return size;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (front != null) {
            sb.append("front = ");
            sb.append(front.data);
            sb.append(", ");
            sb.append("rear = ");
            sb.append(rear.data);
            sb.append("; ");
        }
        sb.append('[');
        Node n = front;
        while (n != null) {
            sb.append(n.data);
            n = n.next;
            if (n != null)
                sb.append(", ");
        }
        sb.append(']');
        return sb.toString();
    }

}
