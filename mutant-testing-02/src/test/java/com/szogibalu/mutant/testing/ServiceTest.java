package com.szogibalu.mutant.testing;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Before;
import org.junit.Test;

public class ServiceTest {

	Service sut;

	@Before
	public void init() {
		sut = new Service();
	}

	@Test
	public void test1() {
		int result = sut.add(0, 0);
		assertThat(result).isEqualTo(0);
	}

	@Test
	public void test2() {
		int result = sut.add(3, 0);
		assertThat(result).isEqualTo(3);
	}

}