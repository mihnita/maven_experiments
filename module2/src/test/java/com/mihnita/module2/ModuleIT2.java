package com.mihnita.module2;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class ModuleIT2 {
	@Test
	public void shouldAnswerWithTrue() {
		Module2.methodToIntegrationTest(this.getClass().getName());
		assertTrue(true);
	}
}
