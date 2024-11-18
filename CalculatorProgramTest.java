import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

// To check if the math functions work
class CalculatorProgramTest {

	@Test
	void subtractTest() {
		CalculatorProgram calc = new CalculatorProgram();
		assertEquals(2, calc.subtract(4, 2));
	}

}
