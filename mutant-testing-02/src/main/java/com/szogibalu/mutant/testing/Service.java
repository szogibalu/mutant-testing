package com.szogibalu.mutant.testing;

public class Service {

	public int add(int a, int b) {
		if (a >= 2) {
			return a + b;
		} else {
			return (a + b) * -1;
		}
	}

}
