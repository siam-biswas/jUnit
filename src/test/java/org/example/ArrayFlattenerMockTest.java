package org.example;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class ArrayFlattenerMockTest {

    @Test
    public void testFlattenArrayWithLegitInput() {
        int[][] inputArray = {{1, 3}, {0}, {4, 5, 9}};
        int[] expectedOutput = {1, 3, 0, 4, 5, 9};
        int[] result = new ArrayFlattenerMock().flattenArray(inputArray);
        assertArrayEquals(expectedOutput, result);
    }

    @Test
    public void testFlattenArrayWithNullInput() {
        int[][] inputArray = null;
        int[] expectedOutput = {};
        int[] result = new ArrayFlattenerMock().flattenArray(inputArray);
        assertArrayEquals(expectedOutput, result);
    }

}