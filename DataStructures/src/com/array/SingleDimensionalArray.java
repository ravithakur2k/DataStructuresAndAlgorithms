package com.array;

public class SingleDimensionalArray {

    int[] arr;

    public SingleDimensionalArray(int sizeOfArray) {
        arr = new int[sizeOfArray];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.MIN_VALUE;
        }
    }

    public void traverseArray() {
        try {
            for (int i = 0; i < arr.length; i++) {
                System.out.println(arr[i] + " ");
            }
        } catch (Exception e) {
            System.out.println("Array no longer exists");
        }
    }

    public void insert(int location, int valueToBeInserted) {
        try {
            if (arr[location] == Integer.MIN_VALUE) {
                arr[location] = valueToBeInserted;
                System.out.println("Successfully inserted " + valueToBeInserted + " at location " + location);
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("This cell is already occupied by another value");
        }
    }

    public void accessingCell(int location) {
        try {
            System.out.println(arr[location]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid index");
        }
    }

    public void searchInArray(int valueToSearch) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == valueToSearch) {
                System.out.println("Value found!");
                System.out.println("Index of " + valueToSearch + " is: " + i);
                return;
            }
        }
        System.out.println(valueToSearch + " is not found!");
    }

    public void deleteCell(int cellToBeDeleted){
        try{
            arr[cellToBeDeleted] = Integer.MIN_VALUE;
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println();
            System.out.println("Cant delete the value as cell# provided is not in the range of array !");
        }
    }

    public void deleteValueInArray(int valueToDelete) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == valueToDelete) {
                arr[i] = Integer.MIN_VALUE;
                System.out.println("Value deleted" + valueToDelete);
                return;
            }
        }
        System.out.println("Value not found in the array");
    }

    public void deleteEntireArray() {
        arr = null;
        System.out.println("Array has been successfully deleted");
    }
}
