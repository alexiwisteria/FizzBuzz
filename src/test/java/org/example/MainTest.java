package org.example;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class MainTest {

    @Test
    void testFizzBuzz_15() {
        Main main = new Main();
        String expected = "1, 2, Fizz, 4, Buzz, Fizz, 7, 8, Fizz, Buzz, 11, Fizz, 13, 14, FizzBuzz";
        String actual = main.FizzBuzz(15);
        assertEquals(expected, actual);
    }

    @Test
    void testFizzBuzz_3() {
        Main main = new Main();
        String expected = "1, 2, Fizz";
        String actual = main.FizzBuzz(3);
        assertEquals(expected, actual);
    }

    @Test
    void testFizzBuzz_5() {
        Main main = new Main();
        String expected = "1, 2, Fizz, 4, Buzz";
        String actual = main.FizzBuzz(5);
        assertEquals(expected, actual);
    }

    @Test
    void testFizzBuzz_1() {
        Main main = new Main();
        String expected = "1";
        String actual = main.FizzBuzz(1);
        assertEquals(expected, actual);
    }

    @Test
    void testFizzBuzz_10000() {
        Main main = new Main();
        // Verify the function doesn't break with large inputs
        String result = main.FizzBuzz(10000);
        assertNotNull(result); // We're mainly checking that it doesn't crash.
        assertTrue(result.contains("FizzBuzz")); // Just a basic check for FizzBuzz presence.
    }

    @Test
    void testFizzBuzz_0() {
        Main main = new Main();
        String expected = ""; // Expecting an empty result for n=0
        String actual = main.FizzBuzz(0);
        assertEquals(expected, actual);
    }

    @Test
    void testFizzBuzz_negativeNumber() {
        Main main = new Main();
        String expected = ""; // Expecting an empty result for negative numbers
        String actual = main.FizzBuzz(-5);
        assertEquals(expected, actual);
    }
}
