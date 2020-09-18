package main.java.com.devon;

public class SecondLargestInArray {

    public int getSecondLargestElement(int[] arr) {
        int arrLength = arr.length;
        int tempArrElement;

        // Reorder the elements in the array.
        for (int i = 0; i < arrLength; i++)
        {
            for (int j = i + 1; j < arrLength; j++)
            {
                if (arr[i] > arr[j])
                {
                    tempArrElement = arr[i];
                    arr[i] = arr[j];
                    arr[j] = tempArrElement;
                }
            }
        }

        // Return the second largest element in the reordered array.
        return arr[arrLength-2];
    }

    /* A utility function for printing an array */
    public void printArray(int[] arr)
    {
        for (int j : arr) System.out.print(j + " ");
    }
}
