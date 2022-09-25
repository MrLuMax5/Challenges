package com.vosseptum.leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * Given a string s, find the length of the longest substring without repeating characters.
 */
public class LongestSubstringWithoutRepeatingCharacters {

    public int lengthOfLongestSubstring(String s) {
        Map<Character, Integer> lastPositions = new HashMap<>();
        int maxWindowStartIndex = 0;
        int maxWindowEndIndex = -1;
        int windowStartIndex = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (!lastPositions.containsKey(c) || windowStartIndex > lastPositions.get(c)) {
                if (maxWindowEndIndex - maxWindowStartIndex < i - windowStartIndex) {
                    maxWindowStartIndex = windowStartIndex;
                    maxWindowEndIndex = i;
                }
                lastPositions.put(c, i);
            } else {
                windowStartIndex = Math.max(lastPositions.get(c) + 1, windowStartIndex);
                lastPositions.put(c, i);
            }
        }
        return maxWindowEndIndex - maxWindowStartIndex + 1;
    }
}
