package com.mihnita.module3;

public class Module3 {
	public static void methodToTest(String name) {
		System.out.println("\033[93mSPY: Unit test, from " + name + "\033[m");
	}

	public static void methodToIntegrationTest(String name) {
		System.out.println("\033[96mSPY: Integration test, from " + name + "\033[m");
	}
}
