package com.example.seanchen.test2;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    @Test
    public void validateEmail() throws Exception {
        assertSame(true, MainActivity.validateEmail("kevalpatel2106@gmail.com"));
        assertSame(true, MainActivity.validateEmail("kevalpatel2106gmail.com"));
        assertSame(false, MainActivity.validateEmail(""));
        assertSame(false, MainActivity.validateEmail("k@com"));
    }
}
