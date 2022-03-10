package com.blz.generics_array;

public class ArrayGenerics {
    private static <E> void toPrint(E[] Array) {
        for (E value : Array) {
            System.out.print(value + ",");
        }
    }
    public static void main(String[] args) {
        Integer[] intArray = {22, 54, 48, 96,};
        Double[] doubleArray = {2.1, 5.8, 7.3, 5.5};
        Character[] charArray = {'A', 'B', 'C', 'D', 'S'};
        ArrayGenerics.toPrint(intArray);
        System.out.println();
        ArrayGenerics.toPrint(doubleArray);
        System.out.println();
        ArrayGenerics.toPrint(charArray);
    }
}
