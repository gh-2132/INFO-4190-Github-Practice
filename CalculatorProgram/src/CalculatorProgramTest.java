import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

// To check if the math functions work
class CalculatorProgramTest {

	@Test
	void addTest() {
		CalculatorProgram calc = new CalculatorProgram();
		assertEquals(4, calc.add(2, 2));
	}

}
