package org.example;

import java.util.ArrayList;
import java.util.List;

public class ArrayFlattenerMock implements ArrayFlattener {

    public int[] flattenArray(int[][] inputArray) {

        if (inputArray == null) {
            return new int[0];
        }

        List<Integer> flattenedList = new ArrayList<>();
        flatten(inputArray, flattenedList);

        int[] flattenedArray = new int[flattenedList.size()];
        for (int i = 0; i < flattenedList.size(); i++) {
            flattenedArray[i] = flattenedList.get(i);
        }

        return flattenedArray;
    }

    private void flatten(int[][] nestedArray, List<Integer> result) {
        for (int[] innerArray : nestedArray) {
            for (int num : innerArray) {
                result.add(num);
            }
        }
    }

    public static void main(String[] args) {
        int[][] a_in = {{1, 3}, {0}, {4, 5, 9}};
        int[] a_out = new ArrayFlattenerMock().flattenArray(a_in);

        System.out.print("Flattened Array: ");
        for (int num : a_out) {
            System.out.print(num + " ");
        }
    }
}
