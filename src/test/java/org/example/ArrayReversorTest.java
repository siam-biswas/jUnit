package org.example;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ArrayReversorTest {

    @Test
    public void testReverseArrayWithLegitInput() {
        ArrayFlattenerMock arrayFlattener = new ArrayFlattenerMock();
        ArrayReversor arrayReversor = new ArrayReversor(arrayFlattener);

        int[][] inputArray = {{1, 3}, {0}, {4, 5, 9}};
        int[] expectedOutput = {9, 5, 4, 0, 3, 1};
        int[] result = arrayReversor.reverseArray(inputArray);

        assertArrayEquals(expectedOutput, result);
        assertTrue(arrayFlattener.wasInvoked());
    }

    @Test
    public void testReverseArrayWithNullInput() {
        ArrayFlattenerMock arrayFlattener = new ArrayFlattenerMock();
        ArrayReversor arrayReversor = new ArrayReversor(arrayFlattener);

        int[][] inputArray = null;
        int[] expectedOutput = {};
        int[] result = arrayReversor.reverseArray(inputArray);

        assertArrayEquals(expectedOutput, result);
        assertTrue(arrayFlattener.wasInvoked());
    }
}