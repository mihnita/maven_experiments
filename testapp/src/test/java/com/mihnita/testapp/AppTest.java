package com.mihnita.testapp;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class AppTest {
	@Test
	public void shouldAnswerWithTrue() {
		App.sayHi();
		assertTrue(true);
	}
}
