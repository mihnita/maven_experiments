package com.mihnita.module3;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class ModuleIT3 {
	@Test
	public void shouldAnswerWithTrue() {
		// Only *IT and IT* are considered test classes by default.
		System.out.println("SPY: This should not be executed, bad name!");
		Module3.methodToIntegrationTest(this.getClass().getName());
		assertTrue(false);
	}
}
