package test.java.com.devon;

import main.java.com.devon.LeftRotateArray;
import org.junit.Test;

import static org.junit.Assert.*;

public class LeftRotateArrayTest {

    @Test
    public void testLeftRotateArray() {
        LeftRotateArray lRA = new LeftRotateArray();
        int[] arr = {1,2,3,4,5};
        int rotations = 4;
        // 1 2 3 4 5  ... left rotated 4 becomes ... 5 1 2 3 4
        assertEquals(1, arr[0]);
        int[] rotatedArr = lRA.rotateLeft(arr, rotations);
        assertEquals(5, rotatedArr[0]);


        arr = new int[]{1, 2, 3, 4, 5};
        rotations = 1;
        // 1 2 3 4 5  ... left rotated 1 becomes ... 2 3 4 5 1
        assertEquals(2, arr[1]);
        rotatedArr = lRA.rotateLeft(arr, rotations);
        assertEquals(2, rotatedArr[0]);


        arr = new int[]{1, 2, 3, 4, 5};
        rotations = 3;
        // 1 2 3 4 5  ... left rotated 3 becomes ... 4 5 1 2 3
        assertEquals(3, arr[2]);
        rotatedArr = lRA.rotateLeft(arr, rotations);
        assertEquals(3, rotatedArr[4]);
    }

}