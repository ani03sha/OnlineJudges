package org.redquark.onlinejudges.leetcode.graph;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class AccountsMerge {

    public List<List<String>> accountsMerge(List<List<String>> accounts) {
        // List to store the merged accounts
        List<List<String>> mergedAccounts = new ArrayList<>();
        // Special case
        if (accounts == null || accounts.isEmpty()) {
            return mergedAccounts;
        }
        // Map to represent graph - email and its neighbors
        Map<String, Set<String>> graph = new HashMap<>();
        // Map to store email and name mapping
        Map<String, String> emailNameMappings = new HashMap<>();
        // All the emails
        Set<String> emails = new HashSet<>();
        // Build the graph
        for (List<String> account : accounts) {
            // Get the name of the user
            String name = account.get(0);
            // Process the emails in the list
            for (int i = 1; i < account.size(); i++) {
                String currentEmail = account.get(i);
                emails.add(currentEmail);
                emailNameMappings.put(currentEmail, name);
                graph.putIfAbsent(currentEmail, new HashSet<>());
                if (i == 1) {
                    continue;
                }
                String previousEmail = account.get(i - 1);
                // Build edge between currentEmail and previousEmail
                graph.get(currentEmail).add(previousEmail);
                graph.get(previousEmail).add(currentEmail);
            }
        }
        // Set to store the visited nodes
        Set<String> visited = new HashSet<>();
        for (String email : emails) {
            if (visited.contains(email)) {
                continue;
            }
            visited.add(email);
            // List to store the emails
            List<String> buffer = new ArrayList<>();
            buffer.add(email);
            dfs(email, graph, visited, buffer);
            Collections.sort(buffer);
            buffer.add(0, emailNameMappings.get(email));
            mergedAccounts.add(buffer);
        }
        return mergedAccounts;
    }

    private void dfs(String email, Map<String, Set<String>> graph, Set<String> visited, List<String> buffer) {
        for (String node : graph.get(email)) {
            if (!visited.contains(node)) {
                visited.add(node);
                buffer.add(node);
                dfs(node, graph, visited, buffer);
            }
        }
    }
}
