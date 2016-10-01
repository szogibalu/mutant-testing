package com.szogibalu.mutant.testing;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Before;
import org.junit.Test;

public class BeerServiceTest {

	private BeerService systemUnderTest;

	@Before
	public void init() {
		systemUnderTest = new BeerService();
	}

	@Test
	public void shouldCalculateWithNormalPriceWhenOneGlassOfBeerWasOrdered() {
		double price = systemUnderTest.serve(1, false);

		assertThat(price).isEqualTo(4.0);
	}

	@Test
	public void shouldCalculateWithSpecialPriceWhenOneGlassOfBeerWasOrderedWithBonus() {
		double price = systemUnderTest.serve(1, true);

		assertThat(price).isEqualTo(3.5);
	}

	@Test
	public void shouldCalculateWithSpecialPriceWhenFourGlassOfBeerWasOrdered() {
		double price = systemUnderTest.serve(4, true);

		assertThat(price).isEqualTo(3.5 * 4);
	}

}