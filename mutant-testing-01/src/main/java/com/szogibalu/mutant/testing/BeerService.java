package com.szogibalu.mutant.testing;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BeerService {

	private static final Logger LOGGER = LoggerFactory.getLogger(BeerService.class);

	private static final double NORMAL_PRICE = 4;

	private static final double SPECIAL_PRICE = 3.5;

	public double serve(int numberOfGlasses, boolean bonus) {
		LOGGER.info("Serving {} glass(es) of beer with bonus[{}]", numberOfGlasses, bonus);

		if (numberOfGlasses >= 4 || bonus) {
			return numberOfGlasses * SPECIAL_PRICE;
		} else {
			return numberOfGlasses * NORMAL_PRICE;
		}
	}

}
