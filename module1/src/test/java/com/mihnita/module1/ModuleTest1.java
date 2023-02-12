package com.mihnita.module1;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class ModuleTest1 {
	@Test
	public void shouldAnswerWithTrue() {
		// Only *Test and Test* are considered test classes by default.
		System.out.println("SPY: This should not be executed, bad name!");
		Module1.methodToTest(this.getClass().getName());
		assertTrue(false);
	}
}
