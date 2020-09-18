package test.java.com.devon;

import main.java.com.devon.IsVowelOrConsonant;
import org.junit.Test;

import static org.junit.Assert.*;

public class IsVowelOrConsonantTest {

    @Test
    public void testIsVowelOrConsonant() {
        IsVowelOrConsonant iVOC = new IsVowelOrConsonant();
        assertFalse(iVOC.isVowel());
        assertFalse(iVOC.isConsonant());
        assertEquals("none", iVOC.isVowelOrConsonant('#'));
        assertFalse(iVOC.isVowel());
        assertFalse(iVOC.isConsonant());
        assertEquals("vowel", iVOC.isVowelOrConsonant('E'));
        assertTrue(iVOC.isVowel());
        assertFalse(iVOC.isConsonant());
        assertEquals("consonant", iVOC.isVowelOrConsonant('z'));
        assertFalse(iVOC.isVowel());
        assertTrue(iVOC.isConsonant());
    }
}