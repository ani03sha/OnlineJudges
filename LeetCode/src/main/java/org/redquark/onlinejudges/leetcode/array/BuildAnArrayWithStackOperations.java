package org.redquark.onlinejudges.leetcode.array;

import java.util.ArrayList;
import java.util.List;

public class BuildAnArrayWithStackOperations {

    public List<String> buildArray(int[] target, int n) {
        // Special case
        if (target == null || target.length == 0) {
            throw new IllegalArgumentException("Array cannot be null!");
        }
        // Length of target array
        // List to store the operations
        List<String> operations = new ArrayList<>();
        // Pointer to keep track of index in the target array
        int index = 0;
        // Traverse through the stream
        for (int i = 1; i <= n; i++) {
            // We have to push a number in any case in the stack.
            operations.add("Push");
            // If the number from stream matches with the current element
            // in the target array, we will move to the next element
            if (target[index] == i) {
                index++;
            }
            // If the number is different, then we will pop
            else {
                operations.add("Pop");
            }
            // Check if we have traversed the array
            if (target[target.length - 1] == i || index >= target.length) {
                break;
            }
        }
        return operations;
    }
}
