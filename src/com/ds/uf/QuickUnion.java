package com.ds.uf;

public class QuickUnion {
    private final int[] items;

    public QuickUnion(int n) {
        items = new int[n];

        for (int i = 0; i < n; i++) {
            items[i] = i;
        }
    }

    public void union(int p, int q) {
        var i = this.findRoot(p);
        var j = this.findRoot(q);
        items[i] = j;
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
