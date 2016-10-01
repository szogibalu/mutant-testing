package com.szogibalu.mutant.testing;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.fail;

import org.junit.Before;
import org.junit.Test;


public class BeerServiceTest {

	private BeerService systemUnderTest;

	@Before
	public void init() {
		systemUnderTest = new BeerService();
	}
	
	
	@Test(expected = IllegalArgumentException.class)
	public void shouldReturnWithErrorWhenZeroGlassOfBeerWasOrdered() {
		systemUnderTest.getPrice(0, false);

		fail();
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void shouldReturnWithErrorWhenMoreThanHundredlassesOfBeerWasOrdered() {
		systemUnderTest.getPrice(100, false);

		fail();
	}

	@Test
	public void shouldReturnWithNormalPriceWhenOneGlassOfBeerWasOrdered() {
		double price = systemUnderTest.getPrice(1, false);

		assertThat(price).isEqualTo(800);
	}

	@Test
	public void shouldReturnWithSpecialPriceWhenOneGlassOfBeerWasOrderedWithBonus() {
		double price = systemUnderTest.getPrice(1, true);

		assertThat(price).isEqualTo(600);
	}

	@Test
	public void shouldReturnWithSpecialPriceWhenFourGlassesOfBeerWasOrdered() {
		double price = systemUnderTest.getPrice(4, true);

		assertThat(price).isEqualTo(600);
	}

}