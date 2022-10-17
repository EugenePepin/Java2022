package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {
    int[]array = new int[]{3,1,10,88,5,98};
    @Test
    void massive() {
        int[] arr = Main.massive(9);
        int expected = 9;
        int actual = arr.length;

        assertEquals(expected, actual);
    }

    @Test
    void arithmeticmean() {
        int expected = 6;
        int actual = Main.arithmeticmean(array);
        assertEquals(expected, actual);

    }
}