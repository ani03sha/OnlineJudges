package org.redquark.onlinejudges.leetcode.string;

/**
 * @author Anirudh Sharma
 */
public class CompareVersionNumbers {

    public int compareVersion(String version1, String version2) {
        // Special case
        if (version1 == null || version1.isEmpty() || version2 == null || version2.isEmpty()) {
            throw new IllegalArgumentException("Invalid version");
        }
        // Get the individual revisions from the versions
        String[] revisions1 = version1.split("\\.");
        String[] revisions2 = version2.split("\\.");
        // Pointers to move through the array of revisions
        int i = 0;
        int j = 0;
        // Loop through the strings
        while (i < revisions1.length && j < revisions2.length) {
            // Check if the current revision of version1 is smaller
            // than the current revision of version2
            if (Integer.parseInt(revisions1[i]) < Integer.parseInt(revisions2[j])) {
                return -1;
            }
            // Check if the current revision of version1 is greater
            // than the current revision of version2
            else if (Integer.parseInt(revisions1[i]) > Integer.parseInt(revisions2[j])) {
                return 1;
            }
            i++;
            j++;
        }
        // For every remaining revision of version1
        while (i < revisions1.length) {
            if (Integer.parseInt(revisions1[i]) != 0) {
                return 1;
            }
            i++;
        }
        // For every remaining revision of version2
        while (j < revisions2.length) {
            if (Integer.parseInt(revisions2[j]) != 0) {
                return -1;
            }
            j++;
        }
        return 0;
    }
}
