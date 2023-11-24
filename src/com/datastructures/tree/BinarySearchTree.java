package com.datastructures.tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BinarySearchTree {

    private static class Node {
        private int data;
        private Node left, right;

        Node(int data) {
            this.data = data;
        }
    }

    private Node root;

    public void insert(int e) {
        if (root == null) {
            root = new Node(e);
            return;
        }
        Node n = root;
        while (true) {
            if (n.data == e)
                throw new RuntimeException("duplicate element: " + e);
            if (e < n.data) {
                if (n.left == null) {
                    n.left = new Node(e);
                    return;
                }
                n = n.left;
            } else {
                if (n.right == null) {
                    n.right = new Node(e);
                    return;
                }
                n = n.right;
            }
        }
    }

    public boolean contains(int e) {
        Node n = root;
        while (n != null) {
            if (e < n.data) {
                n = n.left;
            } else if (e > n.data) {
                n = n.right;
            } else {
                return true;
            }
        }
        return false;
    }

    public void rInsert(int e) {
        if (root == null) {
            root = new Node(e);
        } else {
            rInsert(root, e);
        }
    }

    public boolean rContains(int e) {
        return rContains(root, e);
    }

    public void remove(int e) {
        deleteNode(root, e);
    }

    public List<Integer> bfs() { // breadth-first search
        var list = new ArrayList<Integer>();
        if (root == null)
            return list;

        Queue<Node> queue = new LinkedList<>();
        queue.add(root);

        Node n;
        while (!queue.isEmpty()) {
            n = queue.remove();
            if (n.left != null)
                queue.add(n.left);
            if (n.right != null)
                queue.add(n.right);
            list.add(n.data);
        }

        return list;
    }

    public List<Integer> preorder() { // depth-first search
        var list = new ArrayList<Integer>();
        if (root == null)
            return list;
        class Traverse {
            Traverse(Node n) {
                list.add(n.data);
                if (n.left != null)
                    new Traverse(n.left);
                if (n.right != null)
                    new Traverse(n.right);
            }
        }
        new Traverse(root);
        return list;
    }

    public List<Integer> postorder() { // depth-first search
        var list = new ArrayList<Integer>();
        if (root == null)
            return list;
        class Traverse {
            Traverse(Node n) {
                if (n.left != null)
                    new Traverse(n.left);
                if (n.right != null)
                    new Traverse(n.right);
                list.add(n.data);
            }
        }
        new Traverse(root);
        return list;
    }

    public List<Integer> inorder() { // depth-first search, increasing order
        var list = new ArrayList<Integer>();
        if (root == null)
            return list;
        class Traverse {
            Traverse(Node n) {
                if (n.left != null)
                    new Traverse(n.left);
                list.add(n.data);
                if (n.right != null)
                    new Traverse(n.right);
            }
        }
        new Traverse(root);
        return list;
    }

    private Node rInsert(Node n, int e) { // helper method
        if (n == null)
            return new Node(e);
        if (e < n.data)
            n.left = rInsert(n.left, e);
        else if (e > n.data)
            n.right = rInsert(n.right, e);
        return n;
    }

    private boolean rContains(Node n, int e) { // helper method
        if (n == null)
            return false;
        if (n.data == e)
            return true;
        if (e < n.data)
            return rContains(n.left, e);
        return rContains(n.right, e);
    }

    private Node deleteNode(Node n, int e) { // helper method
        if (n == null)
            return null;
        if (e < n.data)
            n.left = deleteNode(n.left, e);
        else if (e > n.data)
            n.right = deleteNode(n.right, e);
        else {
            if (n.left == null && n.right == null)
                return null;
            if (n.left == null)
                return n.right;
            if (n.right == null)
                return n.left;
            int min = minimum(n.right);
            n.data = min;
            n.right = deleteNode(n.right, min);
        }
        return n;
    }

    private int minimum(Node n) { // helper method
        while (n.left != null)
            n = n.left;
        return n.data;
    }

}
