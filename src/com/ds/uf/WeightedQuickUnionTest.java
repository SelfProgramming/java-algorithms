package com.ds.uf;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class WeightedQuickUnionTest {

    @org.junit.jupiter.api.Test
    void testUnion() {
        var uf = new WeightedQuickUnion(2);
        uf.union(0, 1);

        assertTrue(uf.connected(0, 1));
    }

    @org.junit.jupiter.api.Test
    void testTransitivity() {
        var uf = new WeightedQuickUnion(3);
        uf.union(0, 1);
        uf.union(2, 0);

        assertTrue(uf.connected(1, 2));
    }

    @org.junit.jupiter.api.Test
    void testNotConnected() {
        var uf = new WeightedQuickUnion(3);
        uf.union(0, 1);

        assertFalse(uf.connected(2, 0));
    }

    @org.junit.jupiter.api.Test
    void testTreesConnected() {
        var uf = new WeightedQuickUnion(5);
        uf.union(0, 1);
        uf.union(2, 3);
        uf.union(0, 2);

        assertTrue(uf.connected(3, 1));
    }
}