package com.datastructures.hashmap;

import java.util.ArrayList;

public class HashMap {

    private static class Node {
        private final String key;
        private final int value;
        private Node next;

        private Node(String key, int value) {
            this.key = key;
            this.value = value;
        }
    }

    private final int size = 11; // fewer collisions if we have prime number of addresses

    private final Node[] dataMap;

    public HashMap() {
        dataMap = new Node[size];
    }

    public void put(String key, int value) {
        int index = hash(key);
        if (dataMap[index] == null) {
            dataMap[index] = new Node(key, value);
        } else {
            Node n = dataMap[index];
            while (n.next != null && !n.key.equals(key)) {
                n = n.next;
            }
            if (!n.key.equals(key)) {
                n.next = new Node(key, value);
            }
        }
    }

    public int get(String key) {
        int index = hash(key);
        Node n = dataMap[index];
        while (n != null) {
            if (n.key.equals(key)) {
                return n.value;
            }
            n = n.next;
        }
        return -1; // if the HashTable does not contain the key which we are looking for
    }

    public ArrayList<String> getKeys() {
        var keys = new ArrayList<String>();
        for (int i = 0; i < size; i++) {
            Node n = dataMap[i];
            while (n != null) {
                keys.add(n.key);
                n = n.next;
            }
        }
        return keys;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append('{').append(' ');
        for (int i = 0; i < size; i++) {
            Node n = dataMap[i];
            while (n != null) {
                sb.append("(").append(n.key).append(", ").append(n.value).append("), ");
                n = n.next;
            }
        }
        sb.append('}');
        return sb.toString();
    }

    public void printTable() {
        for (int i = 0; i < size; i++) {
            System.out.print(i + ": ");
            Node n = dataMap[i];
            while (n != null) {
                System.out.print("{" + n.key + ", " + n.value + "}, ");
                n = n.next;
            }
            System.out.println();
        }
    }

    private int hash(String key) {
        int hash = 0;
        for (int asciiVal : key.toCharArray()) {
            hash = (hash + asciiVal * 23) % size; // Why 23 ??
        }
        return hash;
    }

}
