package projectCreation;

import java.util.*;

public class characterClass {
	int minNum = 3;
	int maxNum = 18;
	
	String characterName = "Dobby";
	
	int dex = getRandomNum(minNum, maxNum);
	int con = getRandomNum(minNum, maxNum);
	int str = getRandomNum(minNum, maxNum);
	int wis = getRandomNum(minNum, maxNum);
	int inte = getRandomNum(minNum, maxNum);
	int cha = getRandomNum(minNum, maxNum);

	String myClass = getCharacter(dex, con, str, wis, inte, cha);
	String myDice = getDice(myClass);
	
	public void printInfo() {
		System.out.println("Dexterity: " + dex + "  |  Constitution: " + con + "  |  Strength: " + str + "  |  Wisdom: " + wis + "  |  Intelligence: " + inte + "  |  Charisma: " + cha);
		System.out.println("Class: " + myClass);
		System.out.println("Hit point dice: " + myDice);
	}
	
	public String getName() {
		return characterName;
	}

	public int getRandomNum(int min, int max) {
		Random rand = new Random();
		return rand.nextInt((max - min) + 1) + min;
	}

	public String getCharacter(int a, int b, int c, int d, int e, int f) {
		String classDecided = "";
		if (a >= 15) {
	    	//rogue, monk
	    	if (e > b) {
	        	classDecided = "Rogue";//d8
	    	} else {
	        	classDecided = "Monk";//d8
	    	}
		} else if (c >= 15) {
	    	//barb
	    	classDecided = "Barbarian";//d12
		} else if (d >= 15) {
	    	//druid, ranger dex, cleric con
	    	if ((d + a) >= 25) {
	        	classDecided = "Ranger";//d10
	    	} else if ((d + b) >= 25) {
	        	classDecided = "Cleric";//d8
	    	} else {
	        	classDecided = "Druid";//d8
	    	}
		} else if (e >= 15) {
	    	//wizard
	    	classDecided = "Wizard";//d6
		} else if (f >= 15) {
	    	//bard dex, sorcerer, warlock wis, paladin con
	    	if ((f + a) >= 25) {
	        	classDecided = "Bard";//d8
	    	} else if ((f + d) >= 25) {
	        	classDecided = "Warlock";//d8
	    	} else if ((f + b) >= 25) {
	        	classDecided = "Paladin";//d10
	    	} else {
	        	classDecided = "Sorcerer";//d6
	    	}
		} else {
	    	//fighter
	    	classDecided = "Fighter";//d10
		}
		return classDecided;
	}

	public String getDice(String myClass) {
		String diceDecided = "";
		
		switch(myClass) {
		case "Rogue":
			diceDecided = "d8";
			break;
		case "Monk":
			diceDecided = "d8";
			break;
		case "Barbarian":
			diceDecided = "d12";
			break;
		case "Ranger":
			diceDecided = "d10";
			break;
		case "Cleric":
			diceDecided = "d8";
			break;
		case "Druid":
			diceDecided = "d8";
			break;
		case "Wizard":
			diceDecided = "d6";
			break;
		case "Bard":
			diceDecided = "d8";
			break;
		case "Warlock":
			diceDecided = "d8";
			break;
		case "Paladin":
			diceDecided = "d10";
			break;
		case "Sorcerer":
			diceDecided = "D6";
		default:
			diceDecided = "d10";
		}
		return diceDecided;
	}
}
