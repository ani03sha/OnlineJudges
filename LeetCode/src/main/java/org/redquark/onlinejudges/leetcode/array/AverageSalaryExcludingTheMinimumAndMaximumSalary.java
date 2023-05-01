package org.redquark.onlinejudges.leetcode.array;

public class AverageSalaryExcludingTheMinimumAndMaximumSalary {

    public double average(int[] salary) {
        // Special case
        if (salary == null || salary.length == 0) {
            return 0.0;
        }
        // Length of the array
        int n = salary.length;
        int maximumSalary = salary[0];
        int minimumSalary = salary[0];
        int totalSalary = salary[0];
        // Traverse through the remaining elements
        for (int i = 1; i < n; i++) {
            maximumSalary = Math.max(maximumSalary, salary[i]);
            minimumSalary = Math.min(minimumSalary, salary[i]);
            totalSalary += salary[i];
        }
        // Calculate the average
        return (totalSalary - maximumSalary - minimumSalary) * 1.0 / (n - 2);
    }
}
