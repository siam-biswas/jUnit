package org.example;

public class ArrayReversor {

    ArrayFlattener arrayFlattener;

    public ArrayReversor(ArrayFlattener arrayFlattener) {
        this.arrayFlattener = arrayFlattener;
    }

    public int[] reverseArray(int[][] inputArray) {

        int[] flattenedArray = arrayFlattener.flattenArray(inputArray);

        int length = flattenedArray.length;
        int[] reversedArray = new int[length];

        for (int i = 0; i < length; i++) {
            reversedArray[i] = flattenedArray[length - i - 1];
        }

        return reversedArray;
    }

    public static void main(String[] args) {
        int[][] inputArray = {{1, 3}, {0}, {4, 5, 9}};
        int[] reversedArray = new ArrayReversor(new ArrayFlattenerMock()).reverseArray(inputArray);

        System.out.print("Reversed Flattened Array: ");
        for (int num : reversedArray) {
            System.out.print(num + " ");
        }
    }
}
