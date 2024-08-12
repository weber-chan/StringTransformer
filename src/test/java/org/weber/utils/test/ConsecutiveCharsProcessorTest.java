package org.weber.utils.test;


import org.junit.Test;
import org.weber.utils.ConsecutiveCharsProcessor;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class ConsecutiveCharsProcessorTest {


    /**
     * Use 3 consecutive characters to test the function of removing 3 consecutive characters.
     */
    @Test
    public void testRemoveConsecutiveChars1() {
        ConsecutiveCharsProcessor processor;
        processor = new ConsecutiveCharsProcessor("aabcccbbad");
        processor.removeConsecutiveChars(3);
        List<String> results = processor.getResults();
        assertEquals(Arrays.asList("aabbbad", "aaad", "d"), results);

    }

    /**
     * Use 3 consecutive characters to test the function of removing 3 consecutive characters.
     */
    @Test
    public void testRemoveConsecutiveChars2() {
        ConsecutiveCharsProcessor processor;
        processor = new ConsecutiveCharsProcessor("acbbbccaad");
        processor.removeConsecutiveChars(3);
        List<String> results = processor.getResults();
        assertEquals(Arrays.asList("acccaad", "aaad", "d"), results);
    }

    /**
     * Use 4 consecutive characters to test the function of removing 3 consecutive characters.
     */
    @Test
    public void testRemoveConsecutiveChars3() {
        ConsecutiveCharsProcessor processor;
        processor = new ConsecutiveCharsProcessor("abbccccd");
        processor.removeConsecutiveChars(3);
        List<String> results = processor.getResults();
        assertEquals(Arrays.asList("abbcd"), results);
    }

    /**
     * Use 4 consecutive characters to test the function of removing 3 consecutive characters.
     */
    @Test
    public void testRemoveConsecutiveChars4() {
        ConsecutiveCharsProcessor processor;
        processor = new ConsecutiveCharsProcessor("abbbbccccd");
        processor.removeConsecutiveChars(3);
        List<String> results = processor.getResults();
        assertEquals(Arrays.asList("abccccd", "abcd"), results);
    }

    /**
     * Use 3 consecutive characters to test the function of replacing 3 consecutive characters.
     */
    @Test
    public void testReplaceConsecutiveChars1() {
        ConsecutiveCharsProcessor processor;
        processor = new ConsecutiveCharsProcessor("abcccbad");
        processor.replaceThreeConsecutiveChars(3);
        List<String> results = processor.getResults();
        assertEquals(Arrays.asList("abbbad", "aaad", "d"), results);

    }

    /**
     * Use 3 consecutive characters to test the function of replacing 3 consecutive characters.
     */
    @Test
    public void testReplaceConsecutiveChars2() {
        ConsecutiveCharsProcessor processor;
        processor = new ConsecutiveCharsProcessor("abcdddcbe");
        processor.replaceThreeConsecutiveChars(3);
        List<String> results = processor.getResults();
        assertEquals(Arrays.asList("abcccbe", "abbbe", "aae"), results);
    }

    /**
     * Use 4 consecutive characters to test the function of replacing 3 consecutive characters.
     */
    @Test
    public void testReplaceConsecutiveChars3() {
        ConsecutiveCharsProcessor processor;
        processor = new ConsecutiveCharsProcessor("abccccbad");
        processor.replaceThreeConsecutiveChars(3);
        List<String> results = processor.getResults();
        assertEquals(Arrays.asList("abbcbad"), results);
    }

    /**
     * Use 4 consecutive characters to test the function of replacing 3 consecutive characters.
     */
    @Test
    public void testReplaceConsecutiveChars4() {
        ConsecutiveCharsProcessor processor;
        processor = new ConsecutiveCharsProcessor("abbbbccccd");
        processor.replaceThreeConsecutiveChars(3);
        List<String> results = processor.getResults();
        assertEquals(Arrays.asList("aabccccd", "aabbcd"), results);
    }
}
