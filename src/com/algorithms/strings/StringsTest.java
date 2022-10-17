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

    @Test
    void testOneAwayRemoved() {
        var str1 = "pale";
        var str2 = "ple";

        assertTrue(new Strings().oneAway(str1, str2));
    }

    @Test
    void testOneAwayReplaced() {
        var str1 = "pale";
        var str2 = "bale";

        assertTrue(new Strings().oneAway(str1, str2));
    }

    @Test
    void testOneAwayAdded() {
        var str1 = "pale";
        var str2 = "pales";

        assertTrue(new Strings().oneAway(str1, str2));
    }

    @Test
    void testNotOneAway() {
        var str1 = "bale";
        var str2 = "pales";

        assertFalse(new Strings().oneAway(str1, str2));
    }
}
