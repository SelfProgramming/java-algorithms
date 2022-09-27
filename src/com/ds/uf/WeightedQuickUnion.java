package com.ds.uf;

public class WeightedQuickUnion {
    private final int[] items;
    private final int[] weights;

    public WeightedQuickUnion(int n) {
        items = new int[n];
        weights = new int[n];

        for (int i = 0; i < n; i++) {
            items[i] = i;
            weights[i] = 0;
        }
    }

    public void union(int p, int q) {
        var i = this.findRoot(p);
        var j = this.findRoot(q);
        if (weights[i] < weights[j]) {
            items[i] = j;
            weights[j] += weights[i];
        } else {
            items[j] = i;
            weights[i] += weights[j];
        }

    }

    public boolean connected(int p, int q) {
        return this.findRoot(p) == this.findRoot(q);
    }

    private int findRoot(int p) {
        var id = p;
        while (items[id] != id) {
            id = items[id];
        }

        return id;
    }
}
