package org.redquark.onlinejudges.leetcode.stack;

import java.util.Stack;

public class MinStack {

    // Internal stack to store nodes of min stack
    private final Stack<MinStackNode> nodes;

    public MinStack() {
        this.nodes = new Stack<>();
    }

    public void push(int value) {
        if (nodes.isEmpty()) {
            nodes.push(new MinStackNode(value, value));
        } else {
            nodes.push(new MinStackNode(value, Math.min(value, nodes.peek().minimum)));
        }
    }

    public void pop() {
        nodes.pop();
    }

    public int top() {
        return nodes.peek().data;
    }

    public int getMin() {
        return nodes.peek().minimum;
    }

    // Class to represent each node of the min stack
    static class MinStackNode {
        int data;
        int minimum;

        MinStackNode(int data, int minimum) {
            this.data = data;
            this.minimum = minimum;
        }
    }
}
