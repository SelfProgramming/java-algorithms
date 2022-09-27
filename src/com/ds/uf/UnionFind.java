package com.ds.uf;

import java.util.HashMap;
import java.util.Map;

public class UnionFind {
    private final Map<Character, Integer> items;
    private final Map<Integer, Integer> weights;

    public UnionFind() {
        this.items = new HashMap<>();
        this.weights = new HashMap<>();
    }

    public void union(char item1, char item2) {
        var group1 = this.items.get(item1);
        var group2 = this.items.get(item2);

        if (group1.equals(group2)) {
            return;
        }

        var weight1 = this.weights.get(group1);
        var weight2 = this.weights.get(group2);

        if (weight1 > weight2) {

        }
    }

    private void unionGroups(int group1, int group2) {

    }
}
