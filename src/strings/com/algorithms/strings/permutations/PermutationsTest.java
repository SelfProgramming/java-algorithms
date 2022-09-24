package strings.com.algorithms.strings.permutations;

import static org.junit.jupiter.api.Assertions.*;

class PermutationsTest {

    @org.junit.jupiter.api.Test
    void getAllPermutations() {
        var expected = new String[]{"abc", "acb", "bac", "bca", "cab", "cba"};
        var result = Permutations.getAllPermutations("abc");
        assertArrayEquals(expected, result.toArray());
    }
}