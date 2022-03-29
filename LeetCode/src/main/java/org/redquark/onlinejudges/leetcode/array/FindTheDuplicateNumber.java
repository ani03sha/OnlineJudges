package org.redquark.onlinejudges.leetcode.array;

/**
 * @author Anirudh Sharma
 */
public class FindTheDuplicateNumber {

    public int findDuplicate(int[] nums) {
        // The catch in this problem is that the duplicate number
        // can occur any number of times in the array not just
        // two times. We need to keep this thing in mind to think
        // about the solution. We can also leverage the fact that
        // the elements in the array are from 1 to n + 1.

        // We will use Floyd's cycle algorithm where the next index
        // will be determined by the value at the current index

        // Slow and fast pointers
        int slow = nums[0];
        int fast = nums[0];
        // Jump once for slow pointer
        slow = nums[slow];
        // Jump twice for fast pointer
        fast = nums[nums[fast]];
        // Loop until the two pointers meet
        while (slow != fast) {
            // Jump once for slow pointer
            slow = nums[slow];
            // Jump twice for fast pointer
            fast = nums[nums[fast]];
        }
        // At this point, both pointers are pointing to the same
        // element, therefore, we can move slow pointer to the start
        // and move both pointers with equal force. When they meet,
        // the slow would be pointing to the duplicate element
        slow = nums[0];
        while (slow != fast) {
            slow = nums[slow];
            fast = nums[fast];
        }
        return slow;
    }
}
