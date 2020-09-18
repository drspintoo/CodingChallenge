package main.java.com.devon;

public class IsVowelOrConsonant {

    public boolean isVowel() {
        return vowel;
    }

    public boolean isConsonant() {
        return consonant;
    }

    private boolean vowel;
    private boolean consonant;
    
    public String isVowelOrConsonant(char ch) {
        vowel = false;
        consonant = false;

        switch(ch)
        {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
            case 'A':
            case 'E':
            case 'I':
            case 'O':
            case 'U':
                vowel = true;
                break;
            default:
                if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z'))
                    consonant = true;
        }

        return vowel ? "vowel" : consonant ? "consonant" : "none";
    }
}
