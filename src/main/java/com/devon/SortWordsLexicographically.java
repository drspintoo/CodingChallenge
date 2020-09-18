package main.java.com.devon;

public class SortWordsLexicographically {

    public String sortLexi(String words) {
        String[] strArray = words.split(" ");
        String temp;

        // Sorting the strings
        for (int i = 0; i < strArray.length; i++)
        {
            for (int j = i + 1; j < strArray.length; j++)
            {
                if (strArray[i].compareTo(strArray[j]) > 0)
                {
                    temp = strArray[i];
                    strArray[i] = strArray[j];
                    strArray[j] = temp;
                }
            }
        }

        // Return a new string of the joined elements.
        return String.join(" ", strArray);
    }

}
