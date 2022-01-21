package org.redquark.onlinejudges.leetcode.array;

/**
 * @author Anirudh Sharma
 */
public class GasStation {

    public int canCompleteCircuit(int[] gas, int[] cost) {
        int netFuel = 0;
        // Loop through the arrays
        for (int i = 0; i < gas.length; i++) {
            netFuel += gas[i] - cost[i];
        }
        // If netFuel is zero, it means it is not possible to
        // complete the circular circuit
        if (netFuel < 0) {
            return -1;
        }
        // Starting index
        int startIndex = 0;
        netFuel = 0;
        // Again loop through the arrays
        for (int i = 0; i < gas.length; i++) {
            int currentNetFuel = gas[i] - cost[i];
            // If the total fuel in the car goes below zero, it means
            // we cannot have current index as starting point
            if (netFuel + currentNetFuel < 0) {
                startIndex = i + 1;
                netFuel = 0;
            } else {
                // Update the total fuel available in the car
                netFuel += currentNetFuel;
            }
        }
        return startIndex;
    }
}
