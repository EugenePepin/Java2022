package org.example;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

   int[]array = new int[]{-99,1,-98,88,-39,98,0,2,30,1};
    @Test
    void massive() {

        int[] arr = Main.massive(9);
        int expected = 9;
        int actual = arr.length;

        assertEquals(expected, actual);
    }

    @Test
    void checkmaxmod() {

        int expected = 99;
        int actual = Main.checkmaxmod(array);

        assertEquals(expected, actual);
    }

    @Test
    void checksum() {
        int expected = 33;
        int actual = Main.checksum(array);
        assertEquals(expected, actual);
    }
}