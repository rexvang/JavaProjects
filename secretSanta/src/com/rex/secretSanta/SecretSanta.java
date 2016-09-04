package com.rex.secretSanta;

import java.util.ArrayList;
import java.util.Random;

public class SecretSanta {

	public ArrayList2d<String> randomPair(ArrayList<String> names) {
		ArrayList2d<String> pairs = new ArrayList2d<String> ();
		Random ran = new Random();
		int pair = 0;
		boolean paired = false;
		ArrayList<String> alreadyPaired = new ArrayList<String> ();
		
		// put names into list
		for(int index=0;index<names.size();index++) {
			pairs.Add(names.get(index), index);
		}
		
		// generate random number to pair up
		pair = ran.nextInt(names.size());
		
		// cannot pair with itself and if already paired, keep trying
		for(int index=0;index<names.size();index++) {
			while(!paired) {
				//System.out.println("Finding pair");
				if(pair!=index) {
					//System.out.println("Not the same");
					if(!alreadyPaired.contains(names.get(pair))) {
						pairs.Add(names.get(pair), index);
						alreadyPaired.add(names.get(pair));
						paired = true;
						//System.out.println("Paired up");
					}
				}
				pair = ran.nextInt(names.size());
			}
			paired = false;
		}
		
		return pairs;
	}
	
	public static void main(String[] args) {

	}

}
