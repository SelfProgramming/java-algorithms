package com.algorithms.backtracking.pathsum;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BinaryTreePathSumTest {

    @Test
    void pathSum() {
        var root = new TreeNode(5);
        root.left = new TreeNode(4);
        root.right = new TreeNode(8);

        root.left.left = new TreeNode(11);
        root.left.left.left = new TreeNode(7);
        root.left.left.right = new TreeNode(2);

        root.right.left = new TreeNode(13);
        root.right.right = new TreeNode(4);
        root.right.right.left = new TreeNode(5);
        root.right.right.right = new TreeNode(1);

        var expected = new Integer[][]{{5, 4, 11, 2}, {5, 8, 4, 5}};
        var result = new BinaryTreePathSum().pathSum(root, 22);
        for (int i = 0; i < result.size(); i++) {
            assertArrayEquals(expected[i], result.get(i).toArray());
        }
    }

    @Test
    void withNullRoot() {
        var expected = new Integer[][]{};
        var result = new BinaryTreePathSum().pathSum(null, 10);
        assertArrayEquals(expected, result.toArray());
    }

    @Test
    void withNegativeValues() {
        var root = new TreeNode(-2);
        root.right = new TreeNode(-3);

        var expected = new Integer[][]{{-2, -3}};
        var result = new BinaryTreePathSum().pathSum(root, -5);

        assertEquals(result.size(), 1);
        assertArrayEquals(expected[0], result.get(0).toArray());
    }
}