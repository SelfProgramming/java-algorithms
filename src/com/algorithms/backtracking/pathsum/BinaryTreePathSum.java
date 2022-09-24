package com.algorithms.backtracking.pathsum;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreePathSum {
    private int currentSum;
    private List<Integer> currentPath;
    private List<List<Integer>> results;
    private int targetSum;

    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        results = new ArrayList<>();
        currentSum = 0;
        currentPath = new ArrayList<>();
        this.targetSum = targetSum;

        if (root != null) {
            this.calculateSums(root);
        }
        return results;
    }

    private void calculateSums(TreeNode node) {
        currentPath.add(node.val);
        currentSum += node.val;

        if (node.left == null && node.right == null) {
            if (currentSum == targetSum) {
                results.add(new ArrayList<>(currentPath));
            }
            return;
        }

        if (node.left != null) {
            this.calculateSums(node.left);
            this.backtrackLast();
        }

        if (node.right != null) {
            this.calculateSums(node.right);
            this.backtrackLast();
        }
    }

    private void backtrackLast() {
        var last = currentPath.size() - 1;
        currentSum -= currentPath.get(last);
        currentPath.remove(last);
    }
}