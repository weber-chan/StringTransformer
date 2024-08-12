package org.weber.utils;

import java.util.ArrayList;
import java.util.List;

public class ConsecutiveCharsProcessor {

    /**
     * StringBuilder to hold the current string
     */
    private StringBuilder sb;

    /**
     * List to store intermediate results
     */
    private List<String> results;

    /**
     * Flag to indicate if the string was modified
     */
    private boolean modified;


    public ConsecutiveCharsProcessor(String input) {
        this.sb = new StringBuilder(input);
        this.results = new ArrayList<>();
        this.modified = true;
    }

    /**
     * Remove consecutive identical sequences of characters from a string.
     *
     * @param limit the number of consecutive identical characters required for removal
     */
    public void removeConsecutiveChars(int limit) {

        while (modified) {
            modified = false;
            int length = sb.length();
            int i = 0;

            while (i < length) {
                int count = calculateConsecutiveChars(i, length);

                if (count >= limit) {
                    sb.delete(i, i + limit);
                    modified = true;
                    results.add(sb.toString());
                    length = sb.length();
                    i = 0;
                } else {
                    i++;
                }
            }
        }
        if (results.isEmpty()) {
            results.add(sb.toString());
        }
    }

    /**
     * Replaces sequences of consecutive identical characters with the previous character in the alphabet.
     *
     * @param limit the number of consecutive identical characters required for replacement
     */
    public void replaceThreeConsecutiveChars(int limit) {
        while (modified) {
            modified = false;
            int length = sb.length();
            int i = 0;

            while (i < length) {
                int count = calculateConsecutiveChars(i, length);

                if (count >= limit) {
                    char originalChar = sb.charAt(i);
                    String replacement = originalChar == 'a' ? "" : String.valueOf((char) (originalChar - 1));
                    sb.replace(i, i + limit, replacement);
                    modified = true;
                    results.add(sb.toString());
                    length = sb.length();
                    i = 0;
                } else {
                    i++;
                }
            }
            if (results.isEmpty()) {
                results.add(sb.toString());
            }
        }
    }

    /**
     * Calculate the number of consecutive identical characters starting from a given index.
     *
     * @param startIndex the starting index
     * @param length     the length of the string
     * @return the count of consecutive identical characters
     */
    private int calculateConsecutiveChars(int startIndex, int length) {
        int count = 1;
        int i = startIndex;

        while (i + 1 < length && sb.charAt(i) == sb.charAt(i + 1)) {
            count++;
            i++;
        }

        return count;
    }

    /**
     * Retrieves the list of results produced by the processing methods.
     *
     * @return a list of strings representing the results.
     */
    public List<String> getResults() {
        return results;
    }
}
