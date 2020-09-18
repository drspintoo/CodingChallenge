package main.java.com.devon;

public class LeftRotateArray {

    public int[] rotateLeft(int[] arr, int rotations) {
        for (int i = 0; i < rotations; i++) {
            int j, temp;
            temp = arr[0];
            for (j = 0; j < arr.length - 1; j++) {
                arr[j] = arr[j + 1];
            }
            arr[j] = temp;
        }

        return arr;
    }

    /* A utility function for printing an array */
    public void printArray(int[] arr)
    {
        for (int j : arr) System.out.print(j + " ");
    }

}
