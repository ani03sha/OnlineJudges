package org.redquark.onlinejudges.leetcode.graph;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Anirudh Sharma
 */
public class CourseSchedule {

    public boolean canFinish(int numCourses, int[][] prerequisites) {
        // Special case
        if (numCourses < 0 && prerequisites == null || prerequisites.length == 0) {
            return true;
        }
        // We have to create a graph represented by an adjacency list
        // to draw the connection among the courses
        List<List<Integer>> graph = new ArrayList<>();
        // Add array lists for each index
        for (int i = 0; i < numCourses; i++) {
            graph.add(i, new ArrayList<>());
        }
        // Populate the adjacency list
        for (int[] prerequisite : prerequisites) {
            int source = prerequisite[1];
            int destination = prerequisite[0];
            graph.get(source).add(destination);
        }
        // If there is cycle in the graph, then the schedule
        // is not possible, otherwise it is possible
        return !isCyclic(numCourses, graph);
    }

    private boolean isCyclic(int numCourses, List<List<Integer>> graph) {
        // Declare a color array where different integers
        // present different states
        // 0 -> unprocessed
        // 1 -> currently processing
        // 2 -> processed
        int[] states = new int[numCourses];
        // Perform DFS for all vertices
        for (int i = 0; i < numCourses; i++) {
            if (states[i] == 0) {
                if (dfs(graph, i, states)) {
                    return true;
                }
            }
        }
        return false;
    }

    private boolean dfs(List<List<Integer>> graph, int index, int[] colors) {
        // Mark the current node as processing
        colors[index] = 1;
        // Loop through all the neighbors of the current node
        for (int neighbor : graph.get(index)) {
            // If we encounter a node which is already being processed,
            // it means there is a cycle
            if (colors[neighbor] == 1) {
                return true;
            }
            // If the current node is not processed and there is a
            // back edge in a subtree rooted with current node
            if (colors[neighbor] == 0 && dfs(graph, neighbor, colors)) {
                return true;
            }
        }
        // Mark this vertex as processed
        colors[index] = 2;
        return false;
    }
}
