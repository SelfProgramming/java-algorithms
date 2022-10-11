package com.algorithms.strings;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class URLifyTest {

    @Test
    void testURLify() {
        String str = "It is a string      ";
        String result = "It%20is%20a%20string";
        assertArrayEquals(result.toCharArray(), new URLify().execute(str.toCharArray(), 14));
    }
}