package main.java.com.devon;

public class ReverseString {

    public String reverse(String inString) {

        if (inString == null) {
            return null;
        }

        StringBuilder sb = new StringBuilder();

        for (int r = inString.length() - 1; r >= 0; r--) {
            sb.append(inString.charAt(r));
        }
        return sb.toString();
    }
}
