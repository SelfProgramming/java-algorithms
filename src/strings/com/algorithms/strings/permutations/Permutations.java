package strings.com.algorithms.strings.permutations;

import java.util.ArrayList;

public class Permutations {
    public static  ArrayList<String> getAllPermutations(String str) {
        var results = new ArrayList<String>();

        Permutations.permutation(str, "", results);
        return results;
    }

    private static void permutation(String decisions, String prefix, ArrayList<String> results) {
        if (decisions.length() == 0) {
            results.add(prefix);
        } else {
            for (int i = 0; i < decisions.length(); i++) {
                var nextDecisions = decisions.substring(0, i) + decisions.substring(i + 1);
                permutation(nextDecisions, prefix + decisions.toCharArray()[i], results);
            }
        }
    }
}
