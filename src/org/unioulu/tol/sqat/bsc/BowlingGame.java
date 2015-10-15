package org.unioulu.tol.sqat.bsc;
import 
import java.util.ArrayList;
import java.util.List;

public class BowlingGame {
	//a bowling game is made of (at least) 10 frames
	private List<Frame> frames = new ArrayList<Frame>();
	private Frame bonus;
	
	public BowlingGame(){}
	
	public void addFrame(Frame frame){
		//to be implemented
	}
	
	public void setBonus(int firstThrow, int secondThrow) {
	int currentBonus=0;
	if(firstThrow ==10){
		
	}
	else if (firstThrow+secondThrow==10){
		
	}
	}
	
	public int score(){
		int score=0;
		for(int i=0; i<Frame.size(); i++){
			score +=((BowlingGame) Frame.get(i)).score();
		}
		return score;
		
	}
	
	public boolean isNextFrameBonus(){
		//to be implemented
		return false;
	}
}
