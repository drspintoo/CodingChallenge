package test.java.com.devon;

import main.java.com.devon.FibonacciSeries;
import org.junit.Test;

import java.math.BigInteger;

import static org.junit.Assert.*;

public class FibonacciSeriesTest {
    
    @Test
    public void testFibonacciSeries() {
        FibonacciSeries fs = new FibonacciSeries();
        int count = 7;
        assertEquals(new BigInteger("8"), fs.getSeries(count).get(count-1));
        count = 50;
        assertEquals(new BigInteger("7778742049"), fs.getSeries(count).get(count-1));
        count = 100;
        assertEquals(new BigInteger("218922995834555169026"), fs.getSeries(count).get(count-1));
    }

}