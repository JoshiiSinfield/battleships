package uk.co.lala.battleships.game;

import static org.junit.Assert.*;

import org.junit.Test;

public class FiringSolutionTest {

	@Test
	public void checkFiringFails() {
		FiringSolution fs = new FiringSolution();
		assertFalse(fs.fire());
	}

}
