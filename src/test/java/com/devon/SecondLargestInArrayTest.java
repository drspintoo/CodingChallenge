package test.java.com.devon;

import main.java.com.devon.SecondLargestInArray;
import org.junit.Test;

import static org.junit.Assert.*;

public class SecondLargestInArrayTest {

    @Test
    public void testSecondLargestInArray() {
        SecondLargestInArray secondLargest = new SecondLargestInArray();
        int[] arr = {44,66,99,77,33,22,55};
        assertNotEquals(22, secondLargest.getSecondLargestElement(arr));
        assertEquals(77, secondLargest.getSecondLargestElement(arr));
        arr = new int[]{1,2,5,6,3,2};
        assertNotEquals(3, secondLargest.getSecondLargestElement(arr));
        assertEquals(5, secondLargest.getSecondLargestElement(arr));
        arr = new int[]{110,20,40,70,0,0,80,0,90,44,66,199,77,33,22,55,101,2,5,6,31,2};
        assertNotEquals(31, secondLargest.getSecondLargestElement(arr));
        assertEquals(110, secondLargest.getSecondLargestElement(arr));
        arr = new int[]{Integer.MAX_VALUE,200,400,28672,0,10,880,0,9000,Integer.MIN_VALUE};
        assertNotEquals(9000, secondLargest.getSecondLargestElement(arr));
        assertEquals(28672, secondLargest.getSecondLargestElement(arr));
    }
}