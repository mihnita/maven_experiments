package com.mihnita.module2;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class Module2Test {
	@Test
	public void shouldAnswerWithTrue() {
		Module2.methodToTest(this.getClass().getName());
		assertTrue(true);
	}
}
