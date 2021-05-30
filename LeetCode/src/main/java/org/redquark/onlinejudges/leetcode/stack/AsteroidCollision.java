package org.redquark.onlinejudges.leetcode.stack;

import java.util.Stack;

/**
 * @author Anirudh Sharma
 */
public class AsteroidCollision {

    public int[] asteroidCollision(int[] asteroids) {
        // Special case
        if (asteroids == null || asteroids.length == 0) {
            return new int[]{};
        }
        // Stack to store the right moving or positive
        //  size asteroids
        Stack<Integer> rightMovingAsteroids = new Stack<>();
        // Loop through the entire array of asteroids
        for (int asteroid : asteroids) {
            // If the asteroid size is positive
            if (asteroid > 0) {
                rightMovingAsteroids.push(asteroid);
            }
            // If the asteroid size is negative
            else {
                // As long as we have elements in the stack
                // and the top of stack is smaller than the
                // current asteroid, we will destroy the
                // asteroid represented by top of the stack
                while (!rightMovingAsteroids.isEmpty() && rightMovingAsteroids.peek() > 0 && rightMovingAsteroids.peek() < Math.abs(asteroid)) {
                    rightMovingAsteroids.pop();
                }
                // If the stack is empty or the top of the stack is
                // negative, it means both the current asteroid and
                // the top are moving in the same direction
                if (rightMovingAsteroids.isEmpty() || rightMovingAsteroids.peek() < 0) {
                    rightMovingAsteroids.push(asteroid);
                }
                // If both the asteroids are equal, destroy both
                else if (rightMovingAsteroids.peek() == Math.abs(asteroid)) {
                    rightMovingAsteroids.pop();
                }
            }
        }
        // Array to store remaining asteroids
        int[] remaining = new int[rightMovingAsteroids.size()];
        // Store the asteroids in the stack to the array
        for (int i = rightMovingAsteroids.size() - 1; i >= 0; i--) {
            remaining[i] = rightMovingAsteroids.pop();
        }
        return remaining;
    }
}
