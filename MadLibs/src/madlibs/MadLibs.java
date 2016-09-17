package madlibs;

import java.util.Random;
import java.util.Scanner;

public class MadLibs {
	
	Scanner scan = new Scanner(System.in);
	String story;
	String name;
	String adjective1;
	String adjective2;
	String noun1;
	String noun2;
	String noun3;
	String adverb;
	String verb;
	String randomNums;
	Random rand = new Random();

	public Scanner getScan() {
		return scan;
	}

	public void setScan(Scanner scan) {
		this.scan = scan;
	}

	public String getStory() {
		return story;
	}

	public void setStory(String story) {
		this.story = story;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAdjective1() {
		return adjective1;
	}

	public void setAdjective1(String adjective1) {
		this.adjective1 = adjective1;
	}

	public String getAdjective2() {
		return adjective2;
	}

	public void setAdjective2(String adjective2) {
		this.adjective2 = adjective2;
	}

	public String getNoun1() {
		return noun1;
	}

	public void setNoun1(String noun1) {
		this.noun1 = noun1;
	}

	public String getNoun2() {
		return noun2;
	}

	public void setNoun2(String noun2) {
		this.noun2 = noun2;
	}

	public String getNoun3() {
		return noun3;
	}

	public void setNoun3(String noun3) {
		this.noun3 = noun3;
	}

	public String getAdverb() {
		return adverb;
	}

	public void setAdverb(String adverb) {
		this.adverb = adverb;
	}

	public String getVerb() {
		return verb;
	}

	public void setVerb(String verb) {
		this.verb = verb;
	}

	public String getRandomNums() {
		return randomNums;
	}

	public void setRandomNums() {
		int num = Math.abs(rand.nextInt()) % 100;
		int index = 0;
		int [] numberHolder = new int[3];
		while(index < numberHolder.length) {
			numberHolder[index] = num + index;
			index++;
		}
		randomNums = "not " + numberHolder[0] + " not " + numberHolder[1] + " but " + numberHolder[2];
	}

	public Random getRand() {
		return rand;
	}

	public void setRand(Random rand) {
		this.rand = rand;
	}
	
	public void printInstructions() {
		System.out.println("Type in workds and I'll give you a story! Start by typing in a name.");
	}
	
	public void enterName() {
		setName(scan.nextLine());
	}
	
	public void enterNoun1() {
		System.out.println("Give me a noun");
		setNoun1(scan.nextLine());
	}
	
	public void enterNoun2() {
		System.out.println("Give me a noun");
		setNoun2(scan.nextLine());
	}
	
	public void enterNoun3() {
		System.out.println("Give me a noun");
		setNoun3(scan.nextLine());
	}
	
	public void enterAdjective1() {
		System.out.println("Give me an adjective");
		setAdjective1(scan.nextLine());
	}
	
	public void enterAdjective2() {
		System.out.println("Give me an adjective");
		setAdjective2(scan.nextLine());
	}
	
	public void enterAdverb() {
		System.out.println("Give me an adverb");
		setAdverb(scan.nextLine());
	}
	
	public void enterVerb() {
		System.out.println("Give me an verb");
		setVerb(scan.nextLine());
	}
	
	public void putTogetherStory() {
		StringBuilder str = new StringBuilder();
		int num = Math.abs(rand.nextInt()) % 2;
		if(num == 0) {
			//Story 1
		} else {
			//Story 2
		}
		setStory(str.toString());
	}
	
	public void play() {
		enterName();
		enterNoun1();
		enterNoun2();
		enterNoun3();
		enterAdjective1();
		enterAdjective2();
		enterAdverb();
		enterVerb();
		setRandomNums();
		putTogetherStory();
		System.out.println(getStory());
	}

	public static void main(String[] args) {
		MadLibs madGame = new MadLibs();
		madGame.printInstructions();
		madGame.play();
		
	}

}
