package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import main.OperatorTest;

class JunitTest {

	@Test
	public void Test() {
         OperatorTest oT = new OperatorTest(); // MyClass is tested
        // assert statements
        assertEquals(5, oT.multiply(1, 5), "10 x 0 must be 0");
        assertEquals(15, oT.addition(5,10)," ");
        assertEquals(15, oT.subtraction(20,5)," ");
        assertEquals(15, oT.division(30,2)," ");
        //assertEquals(15, oT.modulous(25,10)," ");
        assertEquals(true, oT.equals(12,12)," ");
    }
}
