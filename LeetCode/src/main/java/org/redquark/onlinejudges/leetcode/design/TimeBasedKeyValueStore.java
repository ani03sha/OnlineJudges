package org.redquark.onlinejudges.leetcode.design;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TimeBasedKeyValueStore {

    static class TimeMap {

        private final Map<String, List<ValueTimeStore>> keyValueStore;

        TimeMap() {
            this.keyValueStore = new HashMap<>();
        }

        public void set(String key, String value, int timestamp) {
            // Create a new object with value and timestamp
            ValueTimeStore valueTimeStore = new ValueTimeStore(value, timestamp);
            // Add this object against the given key
            if (!keyValueStore.containsKey(key)) {
                keyValueStore.put(key, new ArrayList<>());
            }
            keyValueStore.get(key).add(valueTimeStore);
        }

        public String get(String key, int timestamp) {
            // Special cases
            if (!keyValueStore.containsKey(key) || timestamp < keyValueStore.get(key).get(0).timestamp) {
                return "";
            }
            // Perform binary search
            int left = 0;
            int right = keyValueStore.get(key).size();
            while (left < right) {
                int middle = left + (right - left) / 2;
                if (timestamp >= keyValueStore.get(key).get(middle).timestamp) {
                    left = middle + 1;
                } else {
                    right = middle;
                }
            }
            return right == 0 ? "" : keyValueStore.get(key).get(right - 1).value;
        }

        static class ValueTimeStore {
            final String value;
            final int timestamp;

            ValueTimeStore(String value, int timestamp) {
                this.value = value;
                this.timestamp = timestamp;
            }
        }
    }
}
