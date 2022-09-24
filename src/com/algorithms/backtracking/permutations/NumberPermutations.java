package com.algorithms.backtracking.permutations;

import java.util.ArrayList;
import java.util.List;

public class NumberPermutations {
    public static List<List<Integer>> permute(int[] nums) {
        var results = new ArrayList<List<Integer>>();
        var used = new boolean[nums.length];
        var permutation = new ArrayList<Integer>();

        NumberPermutations.permutations(nums, used, permutation, results);

        return results;
    }

    public static void permutations(int[] nums, boolean[] used, List<Integer> permutation, List<List<Integer>> results) {
        if (permutation.size() == nums.length) {
            results.add(new ArrayList<>(permutation));
        } else {
            for (int i = 0; i < nums.length; i++) {
                if (used[i]) {
                    continue;
                }
                used[i] = true;
                permutation.add(nums[i]);

                permutations(nums, used, permutation, results);

                permutation.remove(permutation.size() - 1);
                used[i] = false;
            }
        }
    }
}
