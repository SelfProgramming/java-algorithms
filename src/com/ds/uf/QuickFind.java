package com.ds.uf;

public class QuickFind {
    private final int[] items;

    public QuickFind(int n) {
        items = new int[n];

        for (int i = 0; i < n; i++) {
            items[i] = i;
        }
    }

    public void union(int p, int q) {
        if (this.connected(p, q)) {
            return;
        }

        var groupToUnion = items[q];
        for (int i = 0; i < items.length; i++) {
            if (items[i] == groupToUnion) {
                items[i] = items[p];
            }
        }
    }

    public boolean connected(int p, int q) {
        return items[p] == items[q];
    }
}
