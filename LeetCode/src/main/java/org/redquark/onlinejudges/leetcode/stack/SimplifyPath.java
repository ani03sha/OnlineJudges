package org.redquark.onlinejudges.leetcode.stack;

import java.util.Stack;

/**
 * @author Anirudh Sharma
 */
public class SimplifyPath {

    public String simplifyPath(String path) {
        // Special case
        if (path == null || path.isEmpty()) {
            return path;
        }
        // Split the string by slashes
        String[] splits = path.split("[/]+");
        // Stack to store the directories
        Stack<String> directories = new Stack<>();
        // Loop through the splits array
        for (String split : splits) {
            // Ignore double (or more) slashes
            if (split.equals("/")) {
                continue;
            }
            // Check if the current split is ..
            if (split.equals("..")) {
                if (!directories.isEmpty()) {
                    directories.pop();
                }
            } else if (!split.equals(".") && !split.isEmpty()) {
                directories.push(split);
            }
        }
        if (directories.isEmpty()) {
            return "/";
        }
        // Final path
        StringBuilder result = new StringBuilder();
        for (String directory : directories) {
            result.append("/").append(directory);
        }
        return result.toString();
    }
}
