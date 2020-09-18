package test.java.com.devon;

import main.java.com.devon.ReverseNumber;
import org.junit.Test;

import static org.junit.Assert.*;

public class ReverseNumberTest {

    @Test
    public void testReverseNumber() {
        ReverseNumber rn = new ReverseNumber();

        assertFalse(rn.isValidIntWhenReversed());
        assertEquals("123", rn.reverseNumber(321));
        assertTrue(rn.isValidIntWhenReversed());
        assertEquals("-8463847412", rn.reverseNumber(Integer.MIN_VALUE));
        assertFalse(rn.isValidIntWhenReversed());
        assertEquals("7463847412", rn.reverseNumber(Integer.MAX_VALUE));
        assertFalse(rn.isValidIntWhenReversed());
        assertEquals("000000123", rn.reverseNumber(321000000));
        assertTrue(rn.isValidIntWhenReversed());
    }

}