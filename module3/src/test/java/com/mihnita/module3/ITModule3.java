package com.mihnita.module3;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class ITModule3 {
	@Test
	public void shouldAnswerWithTrue() {
		Module3.methodToIntegrationTest(this.getClass().getName());
		assertTrue(true);
	}
}
