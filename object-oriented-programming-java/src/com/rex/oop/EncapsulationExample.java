package com.rex.oop;

// make it so that score can be protected
class CricketScorer {
	private int score;

	public int getScore() {
		return score;
	}

	public void addRuns(int score) {
		this.score += score;
	}
	
	public void six() {
		addRuns(6);
	}
	
	public void four() {
		addRuns(4);
	}
	
	public void single() {
		addRuns(1);
	}
	
	public void printScore() {
		System.out.println("Score : "+ score);
	}
}

public class EncapsulationExample {

	public static void main(String[] args) {
		CricketScorer scorer = new CricketScorer();
		scorer.four();
		scorer.single();
		scorer.six();
		scorer.six();
		scorer.six();
		scorer.printScore();
	}

}
