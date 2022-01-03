package org.redquark.onlinejudges.leetcode.graph;


public class FindTheTownJudge {

    public int findJudge(int n, int[][] trust) {
        // Array to store the net degree of a node
        int[] netDegrees = new int[n + 1];
        // Loop through every node
        for (int[] t : trust) {
            // Update the outdegree which means this person
            // cannot be the judge
            netDegrees[t[0]]--;
            // Update the indegree which means this person
            // can be a potential judge
            netDegrees[t[1]]++;
        }
        // Loop through the netDegrees array and find out the
        // element whose netDegree is n - 1. If there is one
        // such element then it will be the judge because
        // a judge is a person which has to be trusted by n - 1
        // people.
        for (int i = 1; i <= n; i++) {
            if (netDegrees[i] == n - 1) {
                return i;
            }
        }
        return -1;
    }
}
