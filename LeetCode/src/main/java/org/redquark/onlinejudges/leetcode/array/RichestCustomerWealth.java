package org.redquark.onlinejudges.leetcode.array;

/**
 * @author Anirudh Sharma
 */
public class RichestCustomerWealth {

    public int maximumWealth(int[][] accounts) {
        // Variable to store the maximum wealth
        int maxWealth = 0;
        // Loop for each customer
        for (int[] customerAccounts : accounts) {
            // Wealth of the current customer
            int currentWealth = 0;
            for (int account : customerAccounts) {
                currentWealth += account;
            }
            // Update the maxWealth, if needed
            maxWealth = Math.max(maxWealth, currentWealth);
        }
        return maxWealth;
    }
}
