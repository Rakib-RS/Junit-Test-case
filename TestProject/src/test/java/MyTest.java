package test.java;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import main.java.Myclass;

class MyTest {

	@Test
	public void multiplicationOfZeroIntegersShouldReturnZero() {
        Myclass tester = new Myclass(); // MyClass is tested

        // assert statements
        assertEquals(0, tester.multiply(10, 0), "10 x 0 must be 0");
        assertEquals(0, tester.multiply(0, 10), "0 x 10 must be 0");
        assertEquals(0, tester.multiply(0, 0), "0 x 0 must be 0");
        assertEquals("Hello World", tester.addition("Hello", " World"), "0 x 0 must be 0");
    }

}
