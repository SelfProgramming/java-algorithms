package com.algorithms.strings;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringsTest {
    @Test
    void testUniqueStr() {
        var str = "abhdyk8l";
        assertTrue(new Strings().isUnique(str));

        // without additional DS
        assertTrue(new Strings().isUniqueWithoutDS(str));
    }

    @Test
    void testNonUniqueStr() {
        var str = "abhdyk8la";
        assertFalse(new Strings().isUnique(str));

        // without additional DS
        assertFalse(new Strings().isUniqueWithoutDS(str));
    }

    @Test
    void testIsPermutation() {
        // Sort and compare (NlogN)
        var str1 = "fjkaba";
        var str2 = "ajfabk";

        // Sort and compare (NlogN)
        assertTrue(new Strings().checkIsPermutation(str1, str2));
        // With additional DS (N)
        assertTrue(new Strings().checkIsPermutationWithDS(str1, str2));
    }

    @Test
    void testIsNotPermutation() {
        var str1 = "fjkaba";
        var str2 = "ajfabb";

        // Sort and compare (NlogN)
        assertFalse(new Strings().checkIsPermutation(str1, str2));
        // With additional DS (N)
        assertFalse(new Strings().checkIsPermutationWithDS(str1, str2));

        str1 = "abc";
        str2 = "acbd";

        // Sort and compare (NlogN)
        assertFalse(new Strings().checkIsPermutation(str1, str2));
        // With additional DS (N)
        assertFalse(new Strings().checkIsPermutationWithDS(str1, str2));
    }
}
