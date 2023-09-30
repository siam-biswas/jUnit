package org.example;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class ArrayReversorTest {

    @Test
    public void testReverseArrayWithLegitInput() {
        int[][] inputArray = {{1, 3}, {0}, {4, 5, 9}};
        int[] expectedOutput = {9, 5, 4, 0, 3, 1};
        int[] result =  new ArrayReversor(new ArrayFlattenerMock()).reverseArray(inputArray);
        assertArrayEquals(expectedOutput, result);
    }

    @Test
    public void testReverseArrayWithNullInput() {
        int[][] inputArray = null;
        int[] expectedOutput = {};
        int[] result = new ArrayReversor(new ArrayFlattenerMock()).reverseArray(inputArray);
        assertArrayEquals(expectedOutput, result);
    }
}