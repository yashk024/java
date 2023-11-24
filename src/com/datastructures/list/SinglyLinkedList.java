package com.datastructures.list;

public class SinglyLinkedList {

    private static class Node {
        private int data;
        private Node next;

        private Node(int data) {
            this.data = data;
        }

        private Node(int data, Node next) {
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
                while (--index > 0) {
                    n = n.next;
                }
                n.next = new Node(element, n.next);
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
            tail.next = new Node(e);
            tail = tail.next;
        }
        size++;
    }

    public void addFirst(int e) {
        if (head == null) {
            tail = head = new Node(e);
        } else {
            head = new Node(e, head);
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
            while (--index > 0) {
                n = n.next;
            }
            Node deleted = n.next;
            n.next = n.next.next;
            size--;
            return deleted.data;
        }
        throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
    }

    public int removeFirst() {
        if (head == null)
            throw new RuntimeException("cannot remove item from empty list");
        Node n = head;
        head = head.next;
        if (head == null)
            tail = null;
        size--;
        return n.data;
    }

    public int removeLast() {
        if (head == null)
            throw new RuntimeException("cannot remove item from empty list");
        Node n = head;
        if (head.next == null) {
            tail = head = null;
        } else {
            while (n.next != tail) {
                n = n.next;
            }
            tail = n;
            n = n.next;
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
        tail = head;
        Node p = null;
        Node n = head;
        while (n != null) {
            head = n;
            n = n.next;
            head.next = p;
            p = head;
        }
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
