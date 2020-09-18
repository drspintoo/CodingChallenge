package test.java.com.devon;

import main.java.com.devon.ReverseString;
import org.junit.Test;

import static org.junit.Assert.*;

public class ReverseStringTest {

    @Test
    public void testReverseString() {
        ReverseString rs = new ReverseString();
        assertEquals("droWsihTesreveR", rs.reverse("ReverseThisWord"));
        assertEquals("zyxwvutsrqponmlkjihgfedcba", rs.reverse("abcdefghijklmnopqrstuvwxyz"));
        assertEquals("", rs.reverse(""));
        assertEquals("I", rs.reverse("I"));
        assertEquals("It", rs.reverse("tI"));
        assertNotEquals("Oh No", rs.reverse("Oh No"));
        assertNull(rs.reverse(null));
        assertNotNull(rs.reverse("not-null"));
    }
}