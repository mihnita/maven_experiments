package com.mihnita.module1;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class TestModule1 {
	@Test
	public void shouldAnswerWithTrue() {
		Module1.methodToTest(this.getClass().getName());
		assertTrue(true);
	}
}
