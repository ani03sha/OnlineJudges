package org.redquark.onlinejudges.workattech.graph;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

public class ValidCourseSchedule {

    public boolean canCompleteProgram(int n, int[][] prerequisites) {
        // Special case
        if (n <= 0 || prerequisites == null || prerequisites.length == 0) {
            throw new IllegalArgumentException("Invalid inputs!");
        }
        List<List<Integer>> graph = createGraph(prerequisites, n);
        // Array to keep track of indegrees
        int[] indegrees = new int[n];
        // Populate this indegrees array
        for (int[] prerequisite : prerequisites) {
            indegrees[prerequisite[1]]++;
        }
        // Queue to store the nodes with zero indegree
        // or courses which do not require any prerequisite
        Queue<Integer> coursesWithNoPrerequisite = new ArrayDeque<>();
        for (int i = 0; i < n; i++) {
            if (indegrees[i] == 0) {
                coursesWithNoPrerequisite.offer(i);
            }
        }
        // List to store course order (Topological sort)
        List<Integer> courseOrder = new ArrayList<>();
        // Traverse through the queue
        while (!coursesWithNoPrerequisite.isEmpty()) {
            int course = coursesWithNoPrerequisite.remove();
            courseOrder.add(course);
            for (int neighbor : graph.get(course)) {
                indegrees[neighbor]--;
                if (indegrees[neighbor] == 0) {
                    coursesWithNoPrerequisite.offer(neighbor);
                }
            }
        }
        return courseOrder.size() == n;
    }

    private List<List<Integer>> createGraph(int[][] prerequisites, int n) {
        List<List<Integer>> graph = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            graph.add(i, new ArrayList<>());
        }
        for (int[] prerequisite : prerequisites) {
            int u = prerequisite[0];
            int v = prerequisite[1];
            graph.get(u).add(v);
        }
        return graph;
    }
}
