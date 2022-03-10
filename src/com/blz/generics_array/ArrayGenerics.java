package com.blz.generics_array;

public class ArrayGenerics {
    Integer intArray[];
    Double doubleArray[];
    Character charArray[];

    ArrayGenerics(Integer[] intArray){
        this.intArray=intArray;
    }
    ArrayGenerics(Character[] charArray) {
        this.charArray = charArray;
    }
    ArrayGenerics(Double[] doubleArray){
        this.doubleArray=doubleArray;
    }

    public static void main(String[] args) {
        Integer[] intArray ={22,54,48,96,};
        Double[] doubleArray ={2.1,5.8,7.3,5.5};
        Character[] charArray ={'A', 'B', 'C', 'D', 'S'};
        ArrayGenerics printIntArray = new ArrayGenerics(intArray);
        printIntArray.toPrint(printIntArray.intArray);
        System.out.println();
        ArrayGenerics printDoubleArray = new ArrayGenerics(doubleArray);
        printDoubleArray.toPrint(printDoubleArray.doubleArray);
        System.out.println();
        ArrayGenerics printCharArray = new ArrayGenerics(charArray);
        printCharArray.toPrint(printCharArray.charArray);

    }
    private void toPrint(Integer[] Array){
        for(Integer value : Array){
            System.out.print(value+",");
        }
    }
    private void toPrint(Double[] Array){
        for(Double value : Array){
            System.out.print(value+",");
        }
    }
    private void toPrint(Character[] Array){
        for(Character value : Array){
            System.out.print(value+",");
        }
    }
}
