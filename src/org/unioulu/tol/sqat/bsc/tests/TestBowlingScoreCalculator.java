package org.unioulu.tol.sqat.bsc.tests;

import org.unioulu.tol.sqat.bsc.Frame;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestBowlingScoreCalculator {

	@Test
	public void testScoreofTwoThrows() {
		Frame frame = new Frame(4,2);
		int Score = frame.score();
        assertEquals (6, frame.score());
		
	}
	public void testScoreWithStrike() {
		Frame frame = new Frame(10, 0);
		int Score = frame.score();
        assertEquals (11, frame.score());

}
	public void testScoreWithSpare() {
		Frame frame = new Frame(0, 10);
		int Score = frame.score();
        assertEquals (10, frame.score());

}
	public void testScoreWithZeroScore() {
		Frame frame = new Frame(0, 0);
		int Score = frame.score();
        assertEquals (2, frame.score());

}
}
