package test.java.com.devon;

import main.java.com.devon.IsPrime;
import org.junit.Test;

import static org.junit.Assert.*;

public class IsPrimeTest {

    @Test
    public void testIsPrime(){
        IsPrime iP = new IsPrime();

        assertTrue(iP.prime(2));
        assertFalse(iP.prime(4));
        assertFalse(iP.prime(66));
        assertFalse(iP.prime(77));
        assertTrue(iP.prime(97));
        assertFalse(iP.prime(100));
    }

}