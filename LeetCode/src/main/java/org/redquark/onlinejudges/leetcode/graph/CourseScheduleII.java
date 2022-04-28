package org.redquark.onlinejudges.leetcode.graph;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * @author Anirudh Sharma
 */
public class CourseScheduleII {

    public int[] findOrder(int numCourses, int[][] prerequisites) {
        // Adjacency list to maintain the relationship
        // between the prerequisite course and the actual
        // course
        List<List<Integer>> graph = new ArrayList<>();
        // Initialize lists at the index position
        for (int i = 0; i < numCourses; i++) {
            graph.add(new ArrayList<>());
        }
        // Populate the adjacency list
        for (int[] prerequisite : prerequisites) {
            int source = prerequisite[1];
            int destination = prerequisite[0];
            // Make an edge
            graph.get(source).add(destination);
        }
        // Stack to store the order of courses
        Stack<Integer> order = new Stack<>();
        // Declare a states array where different integers
        // present different states
        // 0 -> unprocessed
        // 1 -> currently processing
        // 2 -> processed
        int[] visited = new int[numCourses];
        // Loop for all the courses
        for (int i = 0; i < numCourses; i++) {
            // Here we are returning an empty array if we get
            // a cycle in the graph
            if (visited[i] == 0 && isCyclic(i, graph, order, visited)) {
                return new int[]{};
            }
        }
        // Array to store the order
        int[] output = new int[numCourses];
        // Since we have to return an array, we are storing the elements
        // in the output array
        for (int i = 0; i < numCourses; i++) {
            output[i] = order.pop();
        }
        return output;
    }

    private boolean isCyclic(int index, List<List<Integer>> graph, Stack<Integer> order, int[] visited) {
        // Mark the current node as currently processing
        visited[index] = 1;
        // Loop for all the neighbors of the current node
        for (int n : graph.get(index)) {
            // If we encounter the node as currently processing, it means
            // we have encountered a cycle
            if (visited[n] == 1) {
                return true;
            }
            // If we haven't visited the node and the neighbor node is
            // cyclic, then we will make the whole graph as cyclic
            if (visited[n] == 0 && isCyclic(n, graph, order, visited)) {
                return true;
            }
        }
        // Mark the current node as visited
        visited[index] = 2;
        order.push(index);
        return false;
    }
}
