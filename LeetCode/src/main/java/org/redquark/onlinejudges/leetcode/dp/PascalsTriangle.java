package org.redquark.onlinejudges.leetcode.dp;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author Anirudh Sharma
 */
public class PascalsTriangle {

    public List<List<Integer>> generate(int numRows) {
        // List to store the final output
        List<List<Integer>> output = new ArrayList<>();
        // Special case
        if (numRows <= 0) {
            return output;
        }
        // Add the list for the first row
        output.add(Collections.singletonList(1));
        // Populate for remaining rows
        for (int i = 1; i < numRows; i++) {
            // Get the previous row
            List<Integer> previousRow = output.get(i - 1);
            // List for currentRow
            List<Integer> currentRow = new ArrayList<>();
            // Add first element in the currentRow
            currentRow.add(1);
            // Loop for remaining elements
            for (int j = 1; j < i; j++) {
                currentRow.add(previousRow.get(j - 1) + previousRow.get(j));
            }
            // Add the last element in the currentRow
            currentRow.add(1);
            // Add this row to the final ouptut list
            output.add(currentRow);
        }
        return output;
    }
}
