package org.redquark.onlinejudges.leetcode.string;

public class Dota2Senate {

    public String predictPartyVictory(String senate) {
        // Special case
        if (senate == null || senate.isEmpty()) {
            throw new IllegalArgumentException("Invalid inputs!");
        }
        // Total number of senators
        int n = senate.length();
        // Count of senators of Radiant and Dire parties
        int radiantCount = 0;
        int direCount = 0;
        // Traverse through the string
        for (char c : senate.toCharArray()) {
            if (c == 'R') {
                radiantCount++;
            } else {
                direCount++;
            }
        }
        // Boolean array to keep track of senators which are banned
        boolean[] banned = new boolean[n];
        // Index to keep track of the turn
        int index = 0;
        // Traverse until we get ban all the senators of one type
        while (radiantCount > 0 && direCount > 0) {
            // We will process only if the current senator is not banned
            if (!banned[index]) {
                // For the senator from the Radiant party
                if (senate.charAt(index) == 'R') {
                    // We would try to ban senator from the Dire party
                    ban(senate, banned, 'D', (index + 1) % n, n);
                    direCount--;
                } else {
                    ban(senate, banned, 'R', (index + 1) % n, n);
                    radiantCount--;
                }
            }
            index = (index + 1) % n;
        }
        return radiantCount > 0 ? "Radiant" : "Dire";
    }

    private void ban(String senate, boolean[] banned, char senatorToBan, int start, int n) {
        // Find the next candidate to ban
        int index = start;
        while (true) {
            if (senate.charAt(index) == senatorToBan && !banned[index]) {
                banned[index] = true;
                break;
            }
            index = (index + 1) % n;
        }
    }
}
