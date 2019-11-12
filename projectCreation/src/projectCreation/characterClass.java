package projectCreation;


import java.util.Random;
public class characterClass {
	int minNum = 3;
	int maxNum = 18;
	
	//Proof of concept
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

	public String getCharacter(int dex, int con, int str, int wis, int inte, int cha) {
		String classDecided = "";
		
		if (dex >= 15) {
			
	    		if (inte > con) {
	       	 		classDecided = "Rogue";
	    		} 
			else {
	        		classDecided = "Monk";
	    		}
		} 
		else if (str >= 15) {
	    		classDecided = "Barbarian";
		} 
		else if (wis >= 15) {
			
	    		if ((wis + dex) >= 25) {
	        		classDecided = "Ranger";
	    		} 
			else if ((wis + con) >= 25) {
	        		classDecided = "Cleric";
	    		} 
			else {
	        		classDecided = "Druid";
	    		}
		} 
		else if (inte >= 15) {
	    		classDecided = "Wizard";
		} 
		else if (cha >= 15) {
			
	    		if ((cha + dex) >= 25) {
	        		classDecided = "Bard";
	    		} 
			else if ((cha + wis) >= 25) {
	        		classDecided = "Warlock";
			} 
			else if ((cha + con) >= 25) {
	        		classDecided = "Paladin";
	    		} 
			else {
	        		classDecided = "Sorcerer";
	    		}
		} 
		else {
	    		classDecided = "Fighter";
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
