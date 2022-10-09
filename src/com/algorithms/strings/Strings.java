package com.algorithms.strings;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class Strings {

    public boolean isUnique(String str) {
        HashSet<Character> seenCharacters = new HashSet<>();
        var allChars = str.toCharArray();

        for(var ch: allChars) {
            if (seenCharacters.contains(ch)) {
                return false;
            }

            seenCharacters.add(ch);
        }

        return true;
    }

    public boolean isUniqueWithoutDS(String str) {
        var allChars = str.toCharArray();

        for (int i = 0; i < allChars.length; i++) {
            var curChar = allChars[i];

            for (int j = i + 1; j < allChars.length; j++) {
                if (curChar == allChars[j]) {
                    return false;
                }
            }
        }

        return true;
    }

    public boolean checkIsPermutation(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }

        var chars1 = str1.toCharArray();
        var chars2 = str2.toCharArray();

        Arrays.sort(chars1);
        Arrays.sort(chars2);

        for (int i = 0; i < chars1.length; i++) {
            if (chars1[i] != chars2[i]) {
                return false;
            }
        }

        return true;
    }

    public boolean checkIsPermutationWithDS(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }

        var chars1 = str1.toCharArray();
        var chars2 = str2.toCharArray();

        var seenValues = new HashMap<Character, Integer>();

        for(var ch: chars1) {
            seenValues.compute(ch, (k, v) -> (v == null) ? 1 : v + 1);
        }

        for(var ch: chars2) {
            if (seenValues.containsKey(ch)) {
                var seenTimes = seenValues.get(ch);
                if (seenTimes == 1) {
                    seenValues.remove(ch);
                } else {
                    seenValues.replace(ch, seenTimes - 1);
                }
            } else {
                return false;
            }
        }

        return true;
    }
}
