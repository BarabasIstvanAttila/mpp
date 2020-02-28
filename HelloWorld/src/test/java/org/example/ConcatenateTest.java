package org.example;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ConcatenateTest {

    @Test
    public void testConcatenate() {
        Concatenate concat = new Concatenate();

        String result = concat.concatenate("one", "two");

        assertEquals("onetwo", result);
    }
}
