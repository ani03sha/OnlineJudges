package org.redquark.onlinejudges.workattech.greedy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.redquark.onlinejudges.workattech.greedy.TasksForProfit.Task;

public class TasksForProfitTest {

    private final TasksForProfit testObject = new TasksForProfit();

    @Test
    public void testGetMaxProfit() {
        Task[] tasks = new Task[]{
                new Task(4, 20),
                new Task(2, 10),
                new Task(2, 40),
                new Task(1, 30)
        };
        assertEquals(90, testObject.getMaxProfit(tasks));
    }
}