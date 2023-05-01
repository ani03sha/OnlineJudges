package org.redquark.onlinejudges.leetcode.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AverageSalaryExcludingTheMinimumAndMaximumSalaryTest {

    private final AverageSalaryExcludingTheMinimumAndMaximumSalary testObject = new AverageSalaryExcludingTheMinimumAndMaximumSalary();

    @Test
    public void testAverage() {
        int[] salary = new int[]{4000, 3000, 1000, 2000};
        assertEquals(2500.0, testObject.average(salary));

        salary = new int[]{1000, 2000, 3000};
        assertEquals(2000.0, testObject.average(salary));
    }
}