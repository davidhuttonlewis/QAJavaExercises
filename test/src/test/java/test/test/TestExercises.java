package test.test;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestExercises {

	@BeforeClass
	static public void beforeClass() {
		System.out.println("beforeClass");
	}

	@Before
	public void before() {
		System.out.println("before");
	}

	@Test
	public void test() {
		System.out.println("test");
	}

	@After
	public void after() {
		System.out.println("after");
	}

	@AfterClass
	static public void afterClass() {
		System.out.println("afterClass");
	}

}
