package main.java.com.devon;

public class ReverseNumber {
    private boolean validReversedNumber;

    public boolean isValidIntWhenReversed() {
        return validReversedNumber;
    }

    public String reverseNumber(int inNumber) {
        long longNumber = inNumber;

        StringBuilder sbNumber = new StringBuilder();
        if (String.valueOf(Math.abs(longNumber)).compareTo(String.valueOf(longNumber)) != 0) {
            sbNumber.append("-");
            longNumber = Math.abs(longNumber);
        }

        while (longNumber != 0) {
            int digit = (int) (longNumber % 10);
            sbNumber.append(digit);
            longNumber /= 10;
        }

        try {
            Integer.parseInt(sbNumber.toString());
            validReversedNumber = true;
        } catch (NumberFormatException e)
        {
            validReversedNumber = false;
        }

        return sbNumber.toString();
    }
}
