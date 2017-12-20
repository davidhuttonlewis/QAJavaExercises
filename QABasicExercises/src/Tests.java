import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class Tests {

	@Test
	void blackJackTest1() {
		IntermediateExercises ex = new IntermediateExercises();
		int result = ex.ex1(18, 21);
		assertEquals(21, result);
	}

	@Test
	void blackJackTest2() {
		IntermediateExercises ex = new IntermediateExercises();
		int result = ex.ex1(18, 22);
		assertEquals(18, result);
	}

	@Test
	void blackJackTest3() {
		IntermediateExercises ex = new IntermediateExercises();
		int result = ex.ex1(13, 15);
		assertEquals(15, result);
	}

	@Test
	void blackJackTest4() {
		IntermediateExercises ex = new IntermediateExercises();
		int result = ex.ex1(19, 19);
		assertEquals(19, result);
	}

}
