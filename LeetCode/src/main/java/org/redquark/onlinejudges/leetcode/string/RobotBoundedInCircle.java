package org.redquark.onlinejudges.leetcode.string;

/**
 * @author Anirudh Sharma
 */
public class RobotBoundedInCircle {

    public boolean isRobotBounded(String instructions) {
        // Special case
        if (instructions == null || instructions.isEmpty()) {
            return true;
        }
        // Initial vectors
        int x = 0;
        int y = 0;
        // Initial direction
        char d = 'N';
        // Loop through every instruction and update vectors and direction
        for (char instruction : instructions.toCharArray()) {
            if (instruction == 'G') {
                if (d == 'N') {
                    y++;
                } else if (d == 'W') {
                    x--;
                } else if (d == 'S') {
                    y--;
                } else {
                    x++;
                }
            } else if (instruction == 'L') {
                if (d == 'N') {
                    d = 'W';
                } else if (d == 'W') {
                    d = 'S';
                } else if (d == 'S') {
                    d = 'E';
                } else {
                    d = 'N';
                }
            } else if (instruction == 'R') {
                if (d == 'N') {
                    d = 'E';
                } else if (d == 'W') {
                    d = 'N';
                } else if (d == 'S') {
                    d = 'W';
                } else {
                    d = 'S';
                }
            }
        }
        // A robot can only remain in circle if both the vectors are zero
        // or direction is not north
        return (x == 0 && y == 0) || d != 'N';
    }
}
