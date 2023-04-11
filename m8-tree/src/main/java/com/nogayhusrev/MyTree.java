package com.nogayhusrev;

import java.util.LinkedList;
import java.util.Queue;

import static java.lang.Math.max;

public class MyTree {

    TNode root;

    public MyTree() {
    }

    public void insert(int value) {
        TNode newNode = new TNode(value);

        if (root == null) {
            root = newNode;
            return;
        }


        TNode current = root;

        while (true) {

            if (value <= current.value) {

                if (current.left == null) {
                    current.left = newNode;
                    break;
                }

                current = current.left;

            } else {

                if (current.right == null) {
                    current.right = newNode;
                    break;
                }

                current = current.right;
            }

        }
    }

    public void preOrderTraversal(TNode root) {
        if (root == null)
            return;
        System.out.print(root.value + ",");
        preOrderTraversal(root.left);
        preOrderTraversal(root.right);
    }

    public void inOrderTraversal(TNode root) {
        if (root == null)
            return;

        inOrderTraversal(root.left);
        System.out.print(root.value + ",");
        inOrderTraversal(root.right);

    }

    public void postOrderTraversal(TNode root) {
        if (root == null)
            return;

        postOrderTraversal(root.right);
        System.out.print(root.value + ",");
        postOrderTraversal(root.left);

    }

    public void levelOrderTraversal() {

        if (root == null) return;

        Queue<TNode> queue = new LinkedList<>();

        queue.add(root);

        while (!queue.isEmpty()) {
            TNode toVisit = queue.poll();
            System.out.print(toVisit.value + ",");
            if (toVisit.left != null)
                queue.add(toVisit.left);
            if (toVisit.right != null)
                queue.add(toVisit.right);

        }

    }

    public boolean contains(int value) {

        if (root == null) return false;

        TNode current = root;
        while (current != null) {

            if (value == current.value) {
                return true;
            } else if (value <= current.value) {
                current = current.left;
            } else {
                current = current.left;
            }
        }
        return false;
    }

    public boolean isLeaf(TNode node) {
        return node.left == null && node.right == null;
    }

    public void printLeaves(TNode node) {
        if (node == null) return;

        if (isLeaf(node))
            System.out.print(node.value + " ");
        printLeaves(node.left);
        printLeaves(node.right);

    }

    public int countLeaves(TNode root) {
        if (root == null) return 0;
        if (isLeaf(root)) return 1;

        return countLeaves(root.left) + countLeaves(root.right);
    }

    public int sumOfLeaves(TNode root) {
        if (root == null) return 0;
        if (isLeaf(root)) return root.value;
        return sumOfLeaves(root.left) + sumOfLeaves(root.right);
    }

    public int height(TNode root) {
        if (root == null) return -1;

        if (isLeaf(root)) return 0;

        return 1 + max(height(root.left), height(root.right));
    }

    public int countNodes(TNode root) {
        if (root == null) return 0;

        if (isLeaf(root)) return 1;

        return 1 + countNodes(root.left) + countNodes(root.right);
    }

    public int sumOfNodesDepths(TNode node, int a) {
        if (node == null) return 0;
        return a + sumOfNodesDepths(node.left, a + 1) + sumOfNodesDepths(node.right, a + 1);
    }

    public int sumOfNodesValues(TNode node, int a) {
        if (node == null)
            return 0;

        a += sumOfNodesValues(node.left, node.value);
        a += sumOfNodesValues(node.right, node.value);

        return a;//+ sumOfNodesValues(node.left,node.value) + sumOfNodesValues(node.right,node.value);

    }

}
