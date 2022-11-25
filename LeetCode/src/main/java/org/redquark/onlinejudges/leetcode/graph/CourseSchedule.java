package org.redquark.onlinejudges.leetcode.graph;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

/**
 * @author Anirudh Sharma
 */
public class CourseSchedule {

    public boolean canFinishDFS(int numCourses, int[][] prerequisites) {
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

    public boolean canFinishBFS(int numCourses, int[][] prerequisites) {
        // Special cases
        if (numCourses == 0 || prerequisites == null || prerequisites.length == 0) {
            return true;
        }
        // Array to represent indegree of each node which shows how many
        // prerequisites are needed to complete this course
        int[] inDegrees = new int[numCourses];
        // Populate the in-degrees
        for (int[] ints : prerequisites) {
            int course = ints[0];
            inDegrees[course]++;
        }
        // Queue to add independent course (whose in-degree is zero)
        // If the indegree of a course is zero it means we can complete it
        final Queue<Integer> completedCourses = new ArrayDeque<>();
        for (int i = 0; i < numCourses; i++) {
            if (inDegrees[i] == 0) {
                completedCourses.offer(i);
            }
        }
        // Count of the courses we can finish successfully
        // Since at this time, all the courses in the queue
        // are finished, we will assign this count to the value
        // of the size of the queue
        int completedCoursesCount = completedCourses.size();
        // Loop through the queue
        while (!completedCourses.isEmpty()) {
            // Get the current independent course as it is already finished
            int completedCourse = completedCourses.remove();
            // Loop through the prerequisites array and check if the current
            // completed course is a prerequisite of any other course
            for (int[] prerequisite : prerequisites) {
                int courseToComplete = prerequisite[0];
                int preRequistedCourse = prerequisite[1];
                if (preRequistedCourse == completedCourse) {
                    // Decrease the in-degree of courseToComplete by 1
                    inDegrees[courseToComplete]--;
                    // If all the prerequisite courses are completed, then
                    // we can add this courseToComplete to the completedCourses
                    // queue and increment the completedCoursesCount by 1
                    if (inDegrees[courseToComplete] == 0) {
                        completedCoursesCount++;
                        completedCourses.offer(prerequisite[0]);
                    }
                }
            }
        }
        // If the completedCoursesCount is equal to the total number
        // of courses, we return true, else false.
        return completedCoursesCount == numCourses;
    }
}
