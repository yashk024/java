package com.datastructures.list;

public class DoublyLinkedList {

    private static class Node {
        private Node prev;
        private int data;
        private Node next;

        private Node(int data) {
            this.data = data;
        }

        private Node(Node prev, int data, Node next) {
            this.prev = prev;
            this.data = data;
            this.next = next;
        }
    }

    private Node head, tail;

    private int size;

    public void add(int e) {
        addLast(e);
    }

    public void add(int index, int element) {
        if (index >= 0 && index <= size) {
            if (index == 0) {
                addFirst(element);
            } else if (index == size) {
                addLast(element);
            } else {
                Node n = head;
                while (--index > 0)
                    n = n.next;
                n.next = new Node(n, element, n.next);
                n.next.next.prev = n.next;
                size++;
            }
        } else {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }
    }

    public void addLast(int e) {
        if (head == null) {
            tail = head = new Node(e);
        } else {
            tail.next = new Node(tail, e, null);
            tail = tail.next;
        }
        size++;
    }

    public void addFirst(int e) {
        if (head == null) {
            tail = head = new Node(e);
        } else {
            head.prev = new Node(null, e, head);
            head = head.prev;
        }
        size++;
    }

    public int search(int value) {
        Node n = head;
        int index = 0;
        while (n != null) {
            if (n.data == value) {
                return index;
            }
            n = n.next;
            index++;
        }
        return -1;
    }

    public int remove() {
        return removeFirst();
    }

    public int remove(int index) {
        if (index >= 0 && index < size) {
            if (index == 0)
                return removeFirst();
            if (index == size - 1)
                return removeLast();
            Node n = head;
            while (index-- > 0) {
                n = n.next;
            }
            n.prev.next = n.next;
            n.next.prev = n.prev;
            size--;
            return n.data;
        }
        throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
    }

    public int removeFirst() {
        if (head == null)
            throw new RuntimeException("cannot remove item from empty list");
        Node n = head;
        if (head == tail) {
            tail = head = null;
        } else {
            head = head.next;
            head.prev = null;
        }
        size--;
        return n.data;
    }

    public int removeLast() {
        if (head == null)
            throw new RuntimeException("cannot remove item from empty list");
        Node n = tail;
        if (head == tail) {
            tail = head = null;
        } else {
            tail = tail.prev;
            tail.next = null;
        }
        size--;
        return n.data;
    }

    public int get(int index) {
        if (index >= 0 && index < size) {
            Node n = head;
            while (index-- > 0) {
                n = n.next;
            }
            return n.data;
        }
        throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
    }

    public void set(int index, int element) {
        if (index >= 0 && index < size) {
            Node n = head;
            while (index-- > 0) {
                n = n.next;
            }
            n.data = element;
        } else {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }
    }

    public void reverse() {
        Node n = head, nxt;
        while (n != null) {
            nxt = n.next;
            n.next = n.prev;
            n.prev = nxt;
            n = nxt;
        }
        nxt = head;
        head = tail;
        tail = nxt;
    }

    public int size() {
        return size;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("[");
        Node n = head;
        while (n != null) {
            sb.append(n.data);
            n = n.next;
            if (n != null) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }

}
