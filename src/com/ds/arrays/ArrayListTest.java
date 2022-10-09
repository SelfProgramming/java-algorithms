package com.ds.arrays;

import static org.junit.jupiter.api.Assertions.*;

class ArrayListTest {
    @org.junit.jupiter.api.Test
    void testInsertion() {
        var arrayList = new ArrayList<Integer>();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);

        assertEquals(arrayList.get(0), 1);
        assertEquals(arrayList.get(1), 2);
        assertEquals(arrayList.get(2), 3);
    }

    @org.junit.jupiter.api.Test
    void testSize() {
        var arrayList = new ArrayList<Integer>();

        for(int i = 0; i < 10; i++) {
            arrayList.add(i);
        }

        assertEquals(arrayList.size(), 10);
    }
}