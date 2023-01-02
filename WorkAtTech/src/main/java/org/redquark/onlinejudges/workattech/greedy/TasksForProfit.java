package org.redquark.onlinejudges.workattech.greedy;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class TasksForProfit {

    public int getMaxProfit(Task[] tasks) {
        // Special case
        if (tasks == null || tasks.length == 0) {
            return 0;
        }
        // Sort the array in the increasing order of
        // the deadline
        Arrays.sort(tasks, new TaskComparator());
        // Min heap to store all the tasks selected
        // based on the deadline
        Queue<Integer> chosenTasks = new PriorityQueue<>();
        for (Task task : tasks) {
            if (chosenTasks.size() == task.deadline) {
                if (!chosenTasks.isEmpty() && chosenTasks.peek() > task.profit) {
                    continue;
                }
                chosenTasks.remove();
            }
            chosenTasks.offer(task.profit);
        }
        // Total profit
        int totalProfit = 0;
        while (!chosenTasks.isEmpty()) {
            totalProfit += chosenTasks.remove();
        }
        return totalProfit;
    }

    static class Task {
        public int deadline, profit;

        public Task(int deadline, int profit) {
            this.deadline = deadline;
            this.profit = profit;
        }
    }

    static class TaskComparator implements Comparator<Task> {
        @Override
        public int compare(Task A, Task B) {
            return A.deadline - B.deadline;
        }
    }
}
