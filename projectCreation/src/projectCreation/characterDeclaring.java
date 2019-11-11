package projectCreation;

import java.util.*;
public class characterDeclaring {

	public static void main(String[] args) {
    	int minNum = 3;
    	int maxNum = 18;

    	int dex = getRandomNum(minNum, maxNum);
    	int con = getRandomNum(minNum, maxNum);
    	int str = getRandomNum(minNum, maxNum);
    	int wis = getRandomNum(minNum, maxNum);
    	int inte = getRandomNum(minNum, maxNum);
    	int cha = getRandomNum(minNum, maxNum);

    	String myClass = getCharacter(dex, con, str, wis, inte, cha);
    	String myDice = getDice(myClass);
		System.out.println("Dexterity: " + dex + "  |  Constitution: " + con + "  |  Strength: " + str + "  |  Wisdom: " + wis + "  |  Intelligence: " + inte + "  |  Charisma: " + cha);
		System.out.println("Class: " + myClass);
		System.out.println("Hit point dice: " + myDice);
	}

	public static int getRandomNum(int min, int max) {
    	Random rand = new Random();
    	return rand.nextInt((max - min) + 1) + min;
	}

	public static String getCharacter(int a, int b, int c, int d, int e, int f) {
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


	public static String getDice(String myClass) {
    	String diceDecided = "";
    	if (myClass == "Rogue") {
			diceDecided = "d8";
    	} else if (myClass == "Monk") {
  			diceDecided = "d8";
    	} else if (myClass == "Barbarian") {
			diceDecided = "d12";
    	} else if (myClass == "Ranger") {
			diceDecided = "d10";
    	} else if (myClass == "Cleric") {
			diceDecided = "d8";
    	} else if (myClass == "Druid") {
			diceDecided = "d8";
    	} else if (myClass == "Wizard") {
			diceDecided = "d6";
    	} else if (myClass == "Bard") {
			diceDecided = "d8";
    	} else if (myClass == "Warlock") {
			diceDecided = "d8";
    	} else if (myClass == "Paladin") {
			diceDecided = "d10";
    	} else if (myClass == "Sorcerer") {
			diceDecided = "d6";
    	} else {
			diceDecided = "d10";
    	}
    	return diceDecided;
	}
}
