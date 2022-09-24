package com.algorithms.backtracking.permutations;

import static org.junit.jupiter.api.Assertions.*;

class PermutationsTest {

    @org.junit.jupiter.api.Test
    void stringPermutations() {
        var expected = new String[]{"abc", "acb", "bac", "bca", "cab", "cba"};
        var result = StringPermutations.permute("abc");
        assertArrayEquals(expected, result.toArray());
    }

    @org.junit.jupiter.api.Test
    void numberPermutations() {
        var expected = new Integer[][]{{1, 2, 3}, {1,3,2},{2,1,3},{2,3,1},{3,1,2},{3,2,1}};
        var result = NumberPermutations.permute(new int[]{1, 2, 3});
        for (var i = 0; i < expected.length; i++) {
            assertArrayEquals(result.get(i).toArray(), expected[i]);
        }
    }
}