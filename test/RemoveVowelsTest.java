package com.stackroute;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class RemoveVowelsTest {

    RemoveVowels obj;
    @Before
    public void setUp() throws Exception {
        RemoveVowels obj = new RemoveVowels();
    }

    @After
    public void tearDown() throws Exception {
        obj = null;
    }

    @Test
    public void vowelsDelete() {
        assertEquals("nd",obj.vowelsDelete("India"));
        assertEquals("ntd Stts",obj.vowelsDelete("United States"));
        assertEquals("Grmny",obj.vowelsDelete("Germany"));
        assertEquals("ygpt",obj.vowelsDelete("Eygpt"));
        assertEquals("czchslvk",obj.vowelsDelete("czechoslovakia"));
    }
}
