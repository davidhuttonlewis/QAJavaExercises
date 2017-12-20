import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.Test;

class TooHotTests {

	@Test
	void tooHotTest1() {
		IntermediateExercises ex = new IntermediateExercises();
		boolean result = ex.ex3(60, false);
		assertTrue(result);
	}

	@Test
	void tooHotTest2() {
		IntermediateExercises ex = new IntermediateExercises();
		boolean result = ex.ex3(95, true);
		assertTrue(result);
	}

	@Test
	void tooHotTest3() {
		IntermediateExercises ex = new IntermediateExercises();
		boolean result = ex.ex3(95, false);
		assertFalse(result);
	}

	@Test
	void tooHotTest4() {
		IntermediateExercises ex = new IntermediateExercises();
		boolean result = ex.ex3(55, false);
		assertFalse(result);
	}

}
