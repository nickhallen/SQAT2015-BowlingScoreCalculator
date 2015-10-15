package org.unioulu.tol.sqat.bsc.tests;

import org.unioulu.tol.sqat.bsc.Frame;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestBowlingScoreCalculator {

	@Test
	public void testScoreWithNoThrows() {
		Frame frame = new Frame(4,2);
		int Score = frame.score();
        assertEquals (6, frame.score());
		
	}

}
