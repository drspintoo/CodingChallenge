package main.java.com.devon;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

public class FibonacciSeries {

    public List<BigInteger> getSeries (double forCount) {
        BigInteger num1 = BigInteger.ZERO, num2 = BigInteger.ONE;

        List<BigInteger> fibList = new ArrayList<>();
        for (int i = 1; i <= forCount; ++i) {
            fibList.add(num1);

            /* On each iteration we assign the second number to the first
             * number and assign the sum of the last two numbers to the
             * second number.
             */
            BigInteger sumOfPrevTwo = num1.add(num2);
            num1 = num2;
            num2 = sumOfPrevTwo;
        }

        // System.out.println(fibList.toString());

        return fibList;
    }
}
