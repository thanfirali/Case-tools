package ass;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CalculatorTest {
	Calculator ca;
	@BeforeEach
	public void setup() {
		ca = new Calculator();
		System.out.println("I am BeforeEach");
	}

	@Test
	void testSimpleinterest() {
		System.out.println("I am Test simple interest");
		double actual = ca.simpleinterest(1000, 10, 2);
		double expected = 200;
		assertEquals(expected, actual);
	}

	@Test
	void testCompoundinterest() {
		System.out.println("I am Test compound interest");
		double actual = ca.compoundinterest(10000, 5, 2);
		double expected = 1025;
		assertEquals(expected, actual);
	}

	@Test
	void testAvgfive() {
		System.out.println("I am Test average of 5");
		double actual = ca.avgfive(1, 2, 3, 4, 5);
		double expected = 3;
		assertEquals(expected, actual);
	}

}

