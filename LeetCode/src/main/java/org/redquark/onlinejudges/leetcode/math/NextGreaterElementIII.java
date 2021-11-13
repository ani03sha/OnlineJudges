package org.redquark.onlinejudges.leetcode.math;

public class NextGreaterElementIII {

    public int nextGreaterElement(int n) {
        // Special case
        if (n <= 0) {
            throw new IllegalArgumentException("Invalid input: " + n);
        }
        // Convert the number to character array for easy manipulation
        char[] digits = String.valueOf(n).toCharArray();
        // Digits in the given number
        int digitCount = digits.length;
        // Find the first element which is smaller than the element to its right
        // starting from the right side
        int index = digitCount - 2;
        while (index >= 0 && digits[index] >= digits[index + 1]) {
            index--;
        }
        // If the element is the greatest element that can be formed with the digits
        if (index < 0) {
            return -1;
        }
        // Now find the smallest element to the right of the element at index
        int i = digitCount - 1;
        while (digits[i] <= digits[index]) {
            i--;
        }
        // Swap the elements at index and minIndex
        swap(digits, index, i);
        // Reverse the numbers from index + 1 to digitCount - 1
        reverse(digits, index + 1, digitCount - 1);
        // Convert the digits array back to integer
        try {
            return Integer.parseInt(String.valueOf(digits));
        } catch (NumberFormatException e) {
            return -1;
        }
    }

    private void reverse(char[] digits, int i, int j) {
        int left = i;
        int right = j;
        while (left < right) {
            swap(digits, left, right);
            left++;
            right--;
        }
    }

    private void swap(char[] digits, int i, int j) {
        char temp = digits[i];
        digits[i] = digits[j];
        digits[j] = temp;
    }
}
