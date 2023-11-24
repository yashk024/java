package com.datastructures.stack;

public class Stack {

    private static class Node {
        private final int data;
        private Node next;

        Node(int data) {
            this.data = data;
        }

        Node(int data, Node next) {
            this.data = data;
            this.next = next;
        }
    }

    private Node top;

    private int size;

    public void push(int item) {
        if (top == null)
            top = new Node(item);
        else
            top = new Node(item, top);
        size++;
    }

    public int pop() {
        if (top == null)
            throw new RuntimeException("stack underflow");
        Node del = top;
        top = top.next;
        size--;
        return del.data;
    }

    public boolean isEmpty() {
        return top == null;
    }

    public int size() {
        return size;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (top != null) {
            sb.append("top = ");
            sb.append(top.data);
            sb.append("; ");
        }
        sb.append('[');
        Node n = top;
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
