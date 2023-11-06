package org.redquark.onlinejudges.leetcode.design;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class DesignANumberContainerSystem {

    static class NumberContainers {

        private final Map<Integer, Set<Integer>> mappings;
        private final Map<Integer, Integer> indexMappings;

        public NumberContainers() {
            this.mappings = new HashMap<>();
            this.indexMappings = new HashMap<>();
        }

        public void change(int index, int number) {
            indexMappings.put(index, number);
            if (!mappings.containsKey(number)) {
                mappings.put(number, new TreeSet<>());
            }
            mappings.get(number).add(index);
        }

        public int find(int number) {
            if (mappings.containsKey(number)) {
                for (int index : mappings.get(number)) {
                    if (indexMappings.get(index) == number) {
                        return index;
                    }
                }
            }
            return -1;
        }
    }
}
