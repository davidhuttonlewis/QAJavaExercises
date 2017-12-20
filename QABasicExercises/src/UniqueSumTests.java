import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class UniqueSumTests {

	@Test
	void blackJackTest1() {
		IntermediateExercises ex = new IntermediateExercises();
		int result = ex.ex2(1, 2, 3);
		assertEquals(6, result);
	}

	@Test
	void blackJackTest2() {
		IntermediateExercises ex = new IntermediateExercises();
		int result = ex.ex2(3, 3, 3);
		assertEquals(0, result);
	}

	@Test
	void blackJackTest3() {
		IntermediateExercises ex = new IntermediateExercises();
		int result = ex.ex2(1, 1, 2);
		assertEquals(2, result);
	}

}
