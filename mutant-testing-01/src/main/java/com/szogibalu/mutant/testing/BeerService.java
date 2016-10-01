package com.szogibalu.mutant.testing;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BeerService {

	private static final Logger LOGGER = LoggerFactory.getLogger(BeerService.class);

	private static final double NORMAL_PRICE = 800;

	private static final double SPECIAL_PRICE = 600;

	public double getPrice(int numberOfGlasses, boolean bonus) {
		LOGGER.info("Get price for {} glass(es) of beer with bonus[{}]", numberOfGlasses, bonus);
		
		validate(numberOfGlasses);

		if (numberOfGlasses >= 4 || bonus) {
			return  SPECIAL_PRICE;
		} else {
			return  NORMAL_PRICE;
		}
	}

	private void validate(int numberOfGlasses) {
		if(numberOfGlasses < 1 || numberOfGlasses >= 100) {
			throw new IllegalArgumentException();			
		}
	}

}
