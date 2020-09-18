package test.java.com.devon;

import main.java.com.devon.SortWordsLexicographically;
import org.junit.Test;

import static org.junit.Assert.*;

public class SortWordsLexicographicallyTest {

    @Test
    public void testSortedWordsLexicographically() {
        SortWordsLexicographically sWL = new SortWordsLexicographically();
        String fox = "The quick brown fox jumps over the lazy dog";
        assertEquals("The brown dog fox jumps lazy over quick the", sWL.sortLexi(fox));
        assertNotEquals(fox, sWL.sortLexi(fox));
        String shells = "She sells sea shells on the sea shore.";
        assertEquals("She on sea sea sells shells shore. the", sWL.sortLexi(shells));
        assertNotEquals(shells, sWL.sortLexi(shells));
        String best = "Never let it rest until your Good is Better and your better is Best";
        assertEquals("Best Better Good Never and better is is it let rest until your your", sWL.sortLexi(best));
        assertNotEquals(best, sWL.sortLexi(best));
    }
}