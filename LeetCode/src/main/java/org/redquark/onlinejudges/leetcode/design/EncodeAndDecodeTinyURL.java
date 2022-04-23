package org.redquark.onlinejudges.leetcode.design;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

/**
 * @author Anirudh Sharma
 */
public class EncodeAndDecodeTinyURL {

    static class Codec {

        private final Random random;
        private final Map<String, Integer> encodings;
        private final Map<Integer, String> decodings;

        public Codec() {
            this.random = new Random();
            this.encodings = new HashMap<>();
            this.decodings = new HashMap<>();
        }

        // Encodes a URL to a shortened URL.
        public String encode(String longUrl) {
            // Create a random integer as our converted value
            int key = this.random.nextInt();
            // Check if the key is already present in
            // the encodings and decodings table
            if (!this.encodings.containsKey(longUrl)) {
                this.encodings.put(longUrl, key);
                this.decodings.put(key, longUrl);
            }
            String baseURL = "https//tinyurl.com/";
            return baseURL + encodings.get(longUrl);
        }

        // Decodes a shortened URL to its original URL.
        public String decode(String shortUrl) {
            // Get the key present in the short url
            int key = Integer.parseInt(shortUrl.substring(shortUrl.lastIndexOf("/") + 1));
            return decodings.get(key);
        }
    }
}
